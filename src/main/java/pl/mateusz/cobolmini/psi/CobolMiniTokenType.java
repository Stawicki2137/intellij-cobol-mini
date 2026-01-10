package pl.mateusz.cobolmini.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import pl.mateusz.cobolmini.lang.CobolMiniLanguage;

public class CobolMiniTokenType extends IElementType {
    public CobolMiniTokenType(@NotNull @NonNls String debugName){
        super(debugName, CobolMiniLanguage.INSTANCE);
    }
    @Override
    public String toString() {
        return "CobolMiniTokenType." + super.toString();
    }
}
