package pl.mateusz.cobolmini.psi;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.TokenSet;

public interface CobolMiniTokenSets {

    TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);

    TokenSet STRINGS = TokenSet.create(CobolMiniTypes.STRING);

    TokenSet IDENTIFIERS = TokenSet.create(CobolMiniTypes.IDENTIFIER);
    TokenSet LINE_NUMBERS = TokenSet.create(CobolMiniTypes.LINE_NUMBER);
    TokenSet NUMBERS = TokenSet.create(
            CobolMiniTypes.INTEGER,
            CobolMiniTypes.LEVEL_NUMBER
    );

    TokenSet PICTURE_STRINGS = TokenSet.create(CobolMiniTypes.PICTURE_STRING);

    TokenSet KEYWORDS = TokenSet.create(
            CobolMiniTypes.IDENTIFICATION,
            CobolMiniTypes.ID,
            CobolMiniTypes.DIVISION,

            CobolMiniTypes.PROGRAM_ID,

            CobolMiniTypes.DATA,
            CobolMiniTypes.WORKING_STORAGE,
            CobolMiniTypes.SECTION,

            CobolMiniTypes.PROCEDURE,

            CobolMiniTypes.PIC,
            CobolMiniTypes.PICTURE,
            CobolMiniTypes.VALUE,
            CobolMiniTypes.IS,

            CobolMiniTypes.PERFORM,
            CobolMiniTypes.VARYING,
            CobolMiniTypes.FROM,
            CobolMiniTypes.BY,
            CobolMiniTypes.UNTIL,

            CobolMiniTypes.STOP,
            CobolMiniTypes.RUN,
            CobolMiniTypes.DISPLAY,

            CobolMiniTypes.AUTHOR,
            CobolMiniTypes.INSTALLATION,
            CobolMiniTypes.DATE_WRITTEN,
            CobolMiniTypes.DATE_COMPILED,
            CobolMiniTypes.SECURITY
    );

    TokenSet OPERATORS = TokenSet.create(CobolMiniTypes.EQ);
    TokenSet PUNCTUATION = TokenSet.create(CobolMiniTypes.DOT);
}
