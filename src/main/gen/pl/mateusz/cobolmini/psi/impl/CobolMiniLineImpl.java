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

public class CobolMiniLineImpl extends ASTWrapperPsiElement implements CobolMiniLine {

  public CobolMiniLineImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolMiniVisitor visitor) {
    visitor.visitLine(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolMiniVisitor) accept((CobolMiniVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolMiniDataDivision getDataDivision() {
    return findChildByClass(CobolMiniDataDivision.class);
  }

  @Override
  @Nullable
  public CobolMiniDataItem getDataItem() {
    return findChildByClass(CobolMiniDataItem.class);
  }

  @Override
  @Nullable
  public CobolMiniDisplayStatement getDisplayStatement() {
    return findChildByClass(CobolMiniDisplayStatement.class);
  }

  @Override
  @Nullable
  public CobolMiniIdentificationDivision getIdentificationDivision() {
    return findChildByClass(CobolMiniIdentificationDivision.class);
  }

  @Override
  @Nullable
  public CobolMiniParagraphLabel getParagraphLabel() {
    return findChildByClass(CobolMiniParagraphLabel.class);
  }

  @Override
  @Nullable
  public CobolMiniPerformStatement getPerformStatement() {
    return findChildByClass(CobolMiniPerformStatement.class);
  }

  @Override
  @Nullable
  public CobolMiniProcedureDivision getProcedureDivision() {
    return findChildByClass(CobolMiniProcedureDivision.class);
  }

  @Override
  @Nullable
  public CobolMiniProgramIdStatement getProgramIdStatement() {
    return findChildByClass(CobolMiniProgramIdStatement.class);
  }

  @Override
  @Nullable
  public CobolMiniStopRunStatement getStopRunStatement() {
    return findChildByClass(CobolMiniStopRunStatement.class);
  }

  @Override
  @Nullable
  public CobolMiniWorkingStorageSection getWorkingStorageSection() {
    return findChildByClass(CobolMiniWorkingStorageSection.class);
  }

}
