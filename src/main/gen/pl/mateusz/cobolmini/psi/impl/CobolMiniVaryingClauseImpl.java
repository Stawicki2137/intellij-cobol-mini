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

public class CobolMiniVaryingClauseImpl extends ASTWrapperPsiElement implements CobolMiniVaryingClause {

  public CobolMiniVaryingClauseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolMiniVisitor visitor) {
    visitor.visitVaryingClause(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolMiniVisitor) accept((CobolMiniVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CobolMiniCondition getCondition() {
    return findNotNullChildByClass(CobolMiniCondition.class);
  }

  @Override
  @NotNull
  public List<CobolMiniLiteral> getLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolMiniLiteral.class);
  }

}
