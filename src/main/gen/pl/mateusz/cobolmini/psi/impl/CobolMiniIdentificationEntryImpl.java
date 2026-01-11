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

public class CobolMiniIdentificationEntryImpl extends ASTWrapperPsiElement implements CobolMiniIdentificationEntry {

  public CobolMiniIdentificationEntryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolMiniVisitor visitor) {
    visitor.visitIdentificationEntry(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolMiniVisitor) accept((CobolMiniVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolMiniAuthorClause getAuthorClause() {
    return findChildByClass(CobolMiniAuthorClause.class);
  }

  @Override
  @Nullable
  public CobolMiniDateCompiledClause getDateCompiledClause() {
    return findChildByClass(CobolMiniDateCompiledClause.class);
  }

  @Override
  @Nullable
  public CobolMiniDateWrittenClause getDateWrittenClause() {
    return findChildByClass(CobolMiniDateWrittenClause.class);
  }

  @Override
  @Nullable
  public CobolMiniInstallationClause getInstallationClause() {
    return findChildByClass(CobolMiniInstallationClause.class);
  }

  @Override
  @Nullable
  public CobolMiniSecurityClause getSecurityClause() {
    return findChildByClass(CobolMiniSecurityClause.class);
  }

}
