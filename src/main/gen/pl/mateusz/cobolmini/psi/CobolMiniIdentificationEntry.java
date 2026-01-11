// This is a generated file. Not intended for manual editing.
package pl.mateusz.cobolmini.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolMiniIdentificationEntry extends PsiElement {

  @Nullable
  CobolMiniAuthorClause getAuthorClause();

  @Nullable
  CobolMiniDateCompiledClause getDateCompiledClause();

  @Nullable
  CobolMiniDateWrittenClause getDateWrittenClause();

  @Nullable
  CobolMiniInstallationClause getInstallationClause();

  @Nullable
  CobolMiniSecurityClause getSecurityClause();

}
