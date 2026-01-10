package pl.mateusz.cobolmini.lang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public final class CobolMiniFileType extends LanguageFileType {
    public static final CobolMiniFileType INSTANCE = new CobolMiniFileType();

    private CobolMiniFileType() {
        super(CobolMiniLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "CobolMini";
    }

    @NotNull
    @Override
    public  String getDescription() {
        return "Minimal COBOL subset";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "cob";
    }

    @Override
    public Icon getIcon() {
        return CobolMiniIcons.FILE;
    }
}
