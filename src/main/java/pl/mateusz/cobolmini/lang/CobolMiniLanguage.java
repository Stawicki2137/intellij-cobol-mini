package pl.mateusz.cobolmini.lang;

import com.intellij.lang.Language;

public final class CobolMiniLanguage extends Language {
    public static final CobolMiniLanguage INSTANCE = new CobolMiniLanguage();

    private CobolMiniLanguage() {
        super("CobolMini");
    }
}
