// This is a generated file. Not intended for manual editing.
package pl.mateusz.cobolmini.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static pl.mateusz.cobolmini.psi.CobolMiniTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import pl.mateusz.cobolmini.psi.*;

public class CobolMiniDataItemImpl extends ASTWrapperPsiElement implements CobolMiniDataItem {

  public CobolMiniDataItemImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolMiniVisitor visitor) {
    visitor.visitDataItem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolMiniVisitor) accept((CobolMiniVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CobolMiniDataName getDataName() {
    return findNotNullChildByClass(CobolMiniDataName.class);
  }

  @Override
  @NotNull
  public CobolMiniPictureClause getPictureClause() {
    return findNotNullChildByClass(CobolMiniPictureClause.class);
  }

  @Override
  @Nullable
  public CobolMiniValueClause getValueClause() {
    return findChildByClass(CobolMiniValueClause.class);
  }

}
