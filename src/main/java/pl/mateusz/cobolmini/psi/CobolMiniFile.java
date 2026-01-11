package pl.mateusz.cobolmini.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;
import pl.mateusz.cobolmini.lang.CobolMiniFileType;
import pl.mateusz.cobolmini.lang.CobolMiniLanguage;

public class CobolMiniFile extends PsiFileBase {

    public CobolMiniFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, CobolMiniLanguage.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return CobolMiniFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "CobolMini File";
    }
}
