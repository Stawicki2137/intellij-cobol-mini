package pl.mateusz.cobolmini.lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import pl.mateusz.cobolmini.psi.CobolMiniTypes;

%%

%class CobolMiniLexer
%implements FlexLexer
%unicode
%ignorecase
%function advance
%type IElementType

%state LINE_START
%state AFTER_LINE_NO
%state AFTER_PIC

%init{
  yybegin(LINE_START);
%init}

%eof{
  return;
%eof}

CRLF=\R
WS=[ \t\f]+

LINE_NUMBER=(0[1-9]|[1-9][0-9])
LEVEL_NUMBER=(0[1-9]|[1-9][0-9])

IDENT_START=[A-Z]
IDENT_CHUNK=[A-Z0-9]+
IDENTIFIER={IDENT_START}({IDENT_CHUNK})?(-{IDENT_CHUNK})*


STRING=\'([^\'\r\n])*\'
PICTURE_STRING=[0-9A-Z][0-9A-Z()]*

%%

{CRLF}+                             { yybegin(LINE_START); return TokenType.WHITE_SPACE; }

<LINE_START> {WS}+                  { return TokenType.WHITE_SPACE; }
<LINE_START> {LINE_NUMBER}          { yybegin(AFTER_LINE_NO); return CobolMiniTypes.LINE_NUMBER; }

<LINE_START> .                      { yybegin(YYINITIAL); yypushback(1); }

<AFTER_LINE_NO> {WS}+               { return TokenType.WHITE_SPACE; }

<AFTER_LINE_NO> {LEVEL_NUMBER} / {WS}+{IDENTIFIER}
                                   { yybegin(YYINITIAL); return CobolMiniTypes.LEVEL_NUMBER; }

<AFTER_LINE_NO> .                   { yybegin(YYINITIAL); yypushback(1); }

<YYINITIAL> {WS}+                   { return TokenType.WHITE_SPACE; }

<AFTER_PIC> {WS}+                   { return TokenType.WHITE_SPACE; }

<YYINITIAL> "PIC"                   { yybegin(AFTER_PIC); return CobolMiniTypes.PIC; }
<YYINITIAL> "PICTURE"               { yybegin(AFTER_PIC); return CobolMiniTypes.PICTURE; }

<AFTER_PIC> {PICTURE_STRING}        { yybegin(YYINITIAL); return CobolMiniTypes.PICTURE_STRING; }
<AFTER_PIC> .                       { yybegin(YYINITIAL); return TokenType.BAD_CHARACTER; }

<YYINITIAL> "."                     { return CobolMiniTypes.DOT; }
<YYINITIAL> "="                     { return CobolMiniTypes.EQ; }

<YYINITIAL> "IDENTIFICATION"        { return CobolMiniTypes.IDENTIFICATION; }
<YYINITIAL> "ID"                    { return CobolMiniTypes.ID; }
<YYINITIAL> "DIVISION"              { return CobolMiniTypes.DIVISION; }
<YYINITIAL> "PROGRAM-ID"            { return CobolMiniTypes.PROGRAM_ID; }

<YYINITIAL> "DATA"                  { return CobolMiniTypes.DATA; }
<YYINITIAL> "WORKING-STORAGE"       { return CobolMiniTypes.WORKING_STORAGE; }
<YYINITIAL> "SECTION"               { return CobolMiniTypes.SECTION; }
<YYINITIAL> "PROCEDURE"             { return CobolMiniTypes.PROCEDURE; }

<YYINITIAL> "VALUE"                 { return CobolMiniTypes.VALUE; }
<YYINITIAL> "IS"                    { return CobolMiniTypes.IS; }

<YYINITIAL> "PERFORM"               { return CobolMiniTypes.PERFORM; }
<YYINITIAL> "VARYING"               { return CobolMiniTypes.VARYING; }
<YYINITIAL> "FROM"                  { return CobolMiniTypes.FROM; }
<YYINITIAL> "BY"                    { return CobolMiniTypes.BY; }
<YYINITIAL> "UNTIL"                 { return CobolMiniTypes.UNTIL; }

<YYINITIAL> "STOP"                  { return CobolMiniTypes.STOP; }
<YYINITIAL> "RUN"                   { return CobolMiniTypes.RUN; }

<YYINITIAL> "DISPLAY"               { return CobolMiniTypes.DISPLAY; }

<YYINITIAL> "AUTHOR"                { return CobolMiniTypes.AUTHOR; }
<YYINITIAL> "INSTALLATION"          { return CobolMiniTypes.INSTALLATION; }
<YYINITIAL> "DATE-WRITTEN"          { return CobolMiniTypes.DATE_WRITTEN; }
<YYINITIAL> "DATE-COMPILED"         { return CobolMiniTypes.DATE_COMPILED; }
<YYINITIAL> "SECURITY"              { return CobolMiniTypes.SECURITY; }

<YYINITIAL> {STRING}                { return CobolMiniTypes.STRING; }
<YYINITIAL> [0-9]+                  { return CobolMiniTypes.INTEGER; }
<YYINITIAL> {IDENTIFIER}            { return CobolMiniTypes.IDENTIFIER; }

<YYINITIAL> [^]                     { return TokenType.BAD_CHARACTER; }
