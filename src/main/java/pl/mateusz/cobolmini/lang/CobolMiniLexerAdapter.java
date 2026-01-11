package pl.mateusz.cobolmini.lang;

import com.intellij.lexer.FlexAdapter;

public class CobolMiniLexerAdapter extends FlexAdapter {
    public CobolMiniLexerAdapter() {
        super(new CobolMiniLexer(null));
    }
}
