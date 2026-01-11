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
IDENTIFIER={IDENT_START}{IDENT_CHUNK}(-{IDENT_CHUNK})*


STRING=\'([^\'\r\n])*\'

PICTURE_STRING=[0-9A-Z][0-9A-Z()]*
%%
// line starts
<LINE_START> {WS}+                  { return TokenType.WHITE_SPACE; }
<LINE_START> {LINE_NUMBER}          { yybegin(YYINITIAL); return CobolMiniTypes.LINE_NUMBER; }

// newline always brings us to LINE_START
{CRLF}+                             { yybegin(LINE_START); return TokenType.WHITE_SPACE; }

// normal whitespace
{WS}+                               { return TokenType.WHITE_SPACE; }

// handling PIC/PICTURE keyword properly
<AFTER_PIC> {WS}+            { return TokenType.WHITE_SPACE; }
<AFTER_PIC> {PICTURE_STRING} { yybegin(YYINITIAL); return CobolMiniTypes.PICTURE_STRING; }
<AFTER_PIC> {CRLF}+          { yybegin(LINE_START); return TokenType.WHITE_SPACE; }
<AFTER_PIC> {IDENTIFIER}     { yybegin(YYINITIAL); return TokenType.BAD_CHARACTER; }
<AFTER_PIC> [0-9]+           { yybegin(YYINITIAL); return TokenType.BAD_CHARACTER; }
<AFTER_PIC> .                { yybegin(YYINITIAL); return TokenType.BAD_CHARACTER; }

//punctuation/operators
"."                                 { return CobolMiniTypes.DOT; }
"="                                 { return CobolMiniTypes.EQ; }

// keywords (must be BEFORE IDENTIFIER)
"IDENTIFICATION"                    { return CobolMiniTypes.IDENTIFICATION; }
"ID"                                { return CobolMiniTypes.ID; }
"DIVISION"                          { return CobolMiniTypes.DIVISION; }

"PROGRAM-ID"                        { return CobolMiniTypes.PROGRAM_ID; }

"DATA"                              { return CobolMiniTypes.DATA; }
"WORKING-STORAGE"                   { return CobolMiniTypes.WORKING_STORAGE; }
"SECTION"                           { return CobolMiniTypes.SECTION; }

"PROCEDURE"                         { return CobolMiniTypes.PROCEDURE; }

"PIC"                               { yybegin(AFTER_PIC); return CobolMiniTypes.PIC; }
"PICTURE"                           { yybegin(AFTER_PIC); return CobolMiniTypes.PICTURE; }

"VALUE"                             { return CobolMiniTypes.VALUE; }
"IS"                                { return CobolMiniTypes.IS; }

"PERFORM"                           { return CobolMiniTypes.PERFORM; }
"VARYING"                           { return CobolMiniTypes.VARYING; }
"FROM"                              { return CobolMiniTypes.FROM; }
"BY"                                { return CobolMiniTypes.BY; }
"UNTIL"                             { return CobolMiniTypes.UNTIL; }

"STOP"                              { return CobolMiniTypes.STOP; }
"RUN"                               { return CobolMiniTypes.RUN; }

"DISPLAY"                           { return CobolMiniTypes.DISPLAY; }

"AUTHOR"                            { return CobolMiniTypes.AUTHOR; }
"INSTALLATION"                      { return CobolMiniTypes.INSTALLATION; }
"DATE-WRITTEN"                      { return CobolMiniTypes.DATE_WRITTEN; }
"DATE-COMPILED"                     { return CobolMiniTypes.DATE_COMPILED; }
"SECURITY"                          { return CobolMiniTypes.SECURITY; }

//literals/identifiers
{STRING}                            { return CobolMiniTypes.STRING; }
{LEVEL_NUMBER} / {WS}+{IDENTIFIER}  { return CobolMiniTypes.LEVEL_NUMBER; }
[0-9]+                              { return CobolMiniTypes.INTEGER; }
{IDENTIFIER}                        { return CobolMiniTypes.IDENTIFIER; }
[^]                                 { return TokenType.BAD_CHARACTER; }
