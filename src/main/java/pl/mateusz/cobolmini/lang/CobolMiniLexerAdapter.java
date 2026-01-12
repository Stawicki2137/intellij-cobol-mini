package pl.mateusz.cobolmini.lang;

import com.intellij.lexer.FlexAdapter;
import org.jetbrains.annotations.NotNull;

public final class CobolMiniLexerAdapter extends FlexAdapter {

    private final CobolMiniLexer flex;

    public CobolMiniLexerAdapter() {
        this(new CobolMiniLexer(null));
    }

    private CobolMiniLexerAdapter(CobolMiniLexer flex) {
        super(flex);
        this.flex = flex;
    }
    @Override
    public void start(@NotNull CharSequence buffer, int startOffset, int endOffset, int initialState) {
        boolean atLineStart =
                startOffset == 0 ||
                        (startOffset > 0 && (buffer.charAt(startOffset - 1) == '\n' || buffer.charAt(startOffset - 1) == '\r'));

        int state = atLineStart ? CobolMiniLexer.LINE_START : initialState;

        super.start(buffer, startOffset, endOffset, state);

        if (atLineStart) {
            flex.yybegin(CobolMiniLexer.LINE_START);
        }
    }
}
