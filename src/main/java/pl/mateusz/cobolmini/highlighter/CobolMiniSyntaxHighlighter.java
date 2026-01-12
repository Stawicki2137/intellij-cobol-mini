package pl.mateusz.cobolmini.highlighter;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import pl.mateusz.cobolmini.lang.CobolMiniLexerAdapter;
import pl.mateusz.cobolmini.psi.CobolMiniTokenSets;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public final class CobolMiniSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("COBOLMINI_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);

    public static final TextAttributesKey IDENTIFIER =
            createTextAttributesKey("COBOLMINI_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);

    public static final TextAttributesKey STRING =
            createTextAttributesKey("COBOLMINI_STRING", DefaultLanguageHighlighterColors.STRING);

    public static final TextAttributesKey NUMBER =
            createTextAttributesKey("COBOLMINI_NUMBER", DefaultLanguageHighlighterColors.NUMBER);

    public static final TextAttributesKey LEVEL_NUMBER =
            createTextAttributesKey("COBOLMINI_LEVEL_NUMBER", DefaultLanguageHighlighterColors.INSTANCE_FIELD);

    public static final TextAttributesKey PICTURE_STRING =
            createTextAttributesKey("COBOLMINI_PICTURE_STRING", DefaultLanguageHighlighterColors.MARKUP_ENTITY);

    public static final TextAttributesKey LINE_NUMBER =
            createTextAttributesKey("COBOLMINI_LINE_NUMBER", DefaultLanguageHighlighterColors.METADATA);
    

    public static final TextAttributesKey OPERATOR =
            createTextAttributesKey("COBOLMINI_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);

    public static final TextAttributesKey PUNCTUATION =
            createTextAttributesKey("COBOLMINI_PUNCTUATION", DefaultLanguageHighlighterColors.DOT);

    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("COBOLMINI_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] LEVEL_NUMBER_KEYS = new TextAttributesKey[]{LEVEL_NUMBER};

    private static final TextAttributesKey[] LINE_NUMBER_KEYS = new TextAttributesKey[]{LINE_NUMBER};
    private static final TextAttributesKey[] PICTURE_STRING_KEYS = new TextAttributesKey[]{PICTURE_STRING};
    private static final TextAttributesKey[] OPERATOR_KEYS = new TextAttributesKey[]{OPERATOR};
    private static final TextAttributesKey[] PUNCTUATION_KEYS = new TextAttributesKey[]{PUNCTUATION};
    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] EMPTY_KEYS = TextAttributesKey.EMPTY_ARRAY;

    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new CobolMiniLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType == TokenType.BAD_CHARACTER) return BAD_CHAR_KEYS;

        if (CobolMiniTokenSets.KEYWORDS.contains(tokenType)) return KEYWORD_KEYS;
        if (CobolMiniTokenSets.IDENTIFIERS.contains(tokenType)) return IDENTIFIER_KEYS;

        if (CobolMiniTokenSets.STRINGS.contains(tokenType)) return STRING_KEYS;
        if (CobolMiniTokenSets.PICTURE_STRINGS.contains(tokenType)) return PICTURE_STRING_KEYS;


        if (CobolMiniTokenSets.LINE_NUMBERS.contains(tokenType)) return LINE_NUMBER_KEYS;
        if (CobolMiniTokenSets.LEVEL_NUMBERS.contains(tokenType)) return LEVEL_NUMBER_KEYS;
        if (CobolMiniTokenSets.INTEGERS.contains(tokenType)) return NUMBER_KEYS;


        if (CobolMiniTokenSets.OPERATORS.contains(tokenType)) return OPERATOR_KEYS;
        if (CobolMiniTokenSets.PUNCTUATION.contains(tokenType)) return PUNCTUATION_KEYS;

        return EMPTY_KEYS;
    }
}
