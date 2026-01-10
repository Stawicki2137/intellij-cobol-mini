package pl.mateusz.cobolmini.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import pl.mateusz.cobolmini.lang.CobolMiniLanguage;

public class CobolMiniElementType extends IElementType {
    public CobolMiniElementType(@NotNull @NonNls String debugName){
        super(debugName, CobolMiniLanguage.INSTANCE);
    }
}
