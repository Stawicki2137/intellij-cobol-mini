// This is a generated file. Not intended for manual editing.
package pl.mateusz.cobolmini.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolMiniLine extends PsiElement {

  @Nullable
  CobolMiniDataDivision getDataDivision();

  @Nullable
  CobolMiniDataItem getDataItem();

  @Nullable
  CobolMiniDisplayStatement getDisplayStatement();

  @Nullable
  CobolMiniIdentificationDivision getIdentificationDivision();

  @Nullable
  CobolMiniParagraphLabel getParagraphLabel();

  @Nullable
  CobolMiniPerformStatement getPerformStatement();

  @Nullable
  CobolMiniProcedureDivision getProcedureDivision();

  @Nullable
  CobolMiniProgramIdStatement getProgramIdStatement();

  @Nullable
  CobolMiniStopRunStatement getStopRunStatement();

  @Nullable
  CobolMiniWorkingStorageSection getWorkingStorageSection();

}
