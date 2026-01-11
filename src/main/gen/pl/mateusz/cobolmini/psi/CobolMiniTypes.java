// This is a generated file. Not intended for manual editing.
package pl.mateusz.cobolmini.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import pl.mateusz.cobolmini.psi.impl.*;

public interface CobolMiniTypes {

  IElementType AUTHOR_CLAUSE = new CobolMiniElementType("AUTHOR_CLAUSE");
  IElementType COMMENT_ENTRY = new CobolMiniElementType("COMMENT_ENTRY");
  IElementType CONDITION = new CobolMiniElementType("CONDITION");
  IElementType DATA_DIVISION = new CobolMiniElementType("DATA_DIVISION");
  IElementType DATA_ITEM = new CobolMiniElementType("DATA_ITEM");
  IElementType DATA_NAME = new CobolMiniElementType("DATA_NAME");
  IElementType DATE_COMPILED_CLAUSE = new CobolMiniElementType("DATE_COMPILED_CLAUSE");
  IElementType DATE_WRITTEN_CLAUSE = new CobolMiniElementType("DATE_WRITTEN_CLAUSE");
  IElementType DISPLAY_STATEMENT = new CobolMiniElementType("DISPLAY_STATEMENT");
  IElementType IDENTIFICATION_DIVISION = new CobolMiniElementType("IDENTIFICATION_DIVISION");
  IElementType IDENTIFICATION_DIVISION_CONTENT = new CobolMiniElementType("IDENTIFICATION_DIVISION_CONTENT");
  IElementType IDENTIFICATION_ENTRY = new CobolMiniElementType("IDENTIFICATION_ENTRY");
  IElementType IDENTIFICATION_KEYWORD = new CobolMiniElementType("IDENTIFICATION_KEYWORD");
  IElementType INSTALLATION_CLAUSE = new CobolMiniElementType("INSTALLATION_CLAUSE");
  IElementType LINE = new CobolMiniElementType("LINE");
  IElementType LITERAL = new CobolMiniElementType("LITERAL");
  IElementType PARAGRAPH_LABEL = new CobolMiniElementType("PARAGRAPH_LABEL");
  IElementType PARAGRAPH_NAME = new CobolMiniElementType("PARAGRAPH_NAME");
  IElementType PERFORM_STATEMENT = new CobolMiniElementType("PERFORM_STATEMENT");
  IElementType PICTURE_CLAUSE = new CobolMiniElementType("PICTURE_CLAUSE");
  IElementType PROCEDURE_DIVISION = new CobolMiniElementType("PROCEDURE_DIVISION");
  IElementType PROGRAM_ID_STATEMENT = new CobolMiniElementType("PROGRAM_ID_STATEMENT");
  IElementType PROGRAM_NAME = new CobolMiniElementType("PROGRAM_NAME");
  IElementType SECURITY_CLAUSE = new CobolMiniElementType("SECURITY_CLAUSE");
  IElementType STOP_RUN_STATEMENT = new CobolMiniElementType("STOP_RUN_STATEMENT");
  IElementType VALUE_CLAUSE = new CobolMiniElementType("VALUE_CLAUSE");
  IElementType VARYING_CLAUSE = new CobolMiniElementType("VARYING_CLAUSE");
  IElementType WORKING_STORAGE_SECTION = new CobolMiniElementType("WORKING_STORAGE_SECTION");

  IElementType AUTHOR = new CobolMiniTokenType("AUTHOR");
  IElementType BY = new CobolMiniTokenType("BY");
  IElementType DATA = new CobolMiniTokenType("DATA");
  IElementType DATE_COMPILED = new CobolMiniTokenType("DATE_COMPILED");
  IElementType DATE_WRITTEN = new CobolMiniTokenType("DATE_WRITTEN");
  IElementType DISPLAY = new CobolMiniTokenType("DISPLAY");
  IElementType DIVISION = new CobolMiniTokenType("DIVISION");
  IElementType DOT = new CobolMiniTokenType("DOT");
  IElementType EQ = new CobolMiniTokenType("EQ");
  IElementType FROM = new CobolMiniTokenType("FROM");
  IElementType ID = new CobolMiniTokenType("ID");
  IElementType IDENTIFICATION = new CobolMiniTokenType("IDENTIFICATION");
  IElementType IDENTIFIER = new CobolMiniTokenType("IDENTIFIER");
  IElementType INSTALLATION = new CobolMiniTokenType("INSTALLATION");
  IElementType INTEGER = new CobolMiniTokenType("INTEGER");
  IElementType IS = new CobolMiniTokenType("IS");
  IElementType LEVEL_NUMBER = new CobolMiniTokenType("LEVEL_NUMBER");
  IElementType LINE_NUMBER = new CobolMiniTokenType("LINE_NUMBER");
  IElementType PERFORM = new CobolMiniTokenType("PERFORM");
  IElementType PIC = new CobolMiniTokenType("PIC");
  IElementType PICTURE = new CobolMiniTokenType("PICTURE");
  IElementType PICTURE_STRING = new CobolMiniTokenType("PICTURE_STRING");
  IElementType PROCEDURE = new CobolMiniTokenType("PROCEDURE");
  IElementType PROGRAM_ID = new CobolMiniTokenType("PROGRAM_ID");
  IElementType RUN = new CobolMiniTokenType("RUN");
  IElementType SECTION = new CobolMiniTokenType("SECTION");
  IElementType SECURITY = new CobolMiniTokenType("SECURITY");
  IElementType STOP = new CobolMiniTokenType("STOP");
  IElementType STRING = new CobolMiniTokenType("STRING");
  IElementType UNTIL = new CobolMiniTokenType("UNTIL");
  IElementType VALUE = new CobolMiniTokenType("VALUE");
  IElementType VARYING = new CobolMiniTokenType("VARYING");
  IElementType WORKING_STORAGE = new CobolMiniTokenType("WORKING_STORAGE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == AUTHOR_CLAUSE) {
        return new CobolMiniAuthorClauseImpl(node);
      }
      else if (type == COMMENT_ENTRY) {
        return new CobolMiniCommentEntryImpl(node);
      }
      else if (type == CONDITION) {
        return new CobolMiniConditionImpl(node);
      }
      else if (type == DATA_DIVISION) {
        return new CobolMiniDataDivisionImpl(node);
      }
      else if (type == DATA_ITEM) {
        return new CobolMiniDataItemImpl(node);
      }
      else if (type == DATA_NAME) {
        return new CobolMiniDataNameImpl(node);
      }
      else if (type == DATE_COMPILED_CLAUSE) {
        return new CobolMiniDateCompiledClauseImpl(node);
      }
      else if (type == DATE_WRITTEN_CLAUSE) {
        return new CobolMiniDateWrittenClauseImpl(node);
      }
      else if (type == DISPLAY_STATEMENT) {
        return new CobolMiniDisplayStatementImpl(node);
      }
      else if (type == IDENTIFICATION_DIVISION) {
        return new CobolMiniIdentificationDivisionImpl(node);
      }
      else if (type == IDENTIFICATION_DIVISION_CONTENT) {
        return new CobolMiniIdentificationDivisionContentImpl(node);
      }
      else if (type == IDENTIFICATION_ENTRY) {
        return new CobolMiniIdentificationEntryImpl(node);
      }
      else if (type == IDENTIFICATION_KEYWORD) {
        return new CobolMiniIdentificationKeywordImpl(node);
      }
      else if (type == INSTALLATION_CLAUSE) {
        return new CobolMiniInstallationClauseImpl(node);
      }
      else if (type == LINE) {
        return new CobolMiniLineImpl(node);
      }
      else if (type == LITERAL) {
        return new CobolMiniLiteralImpl(node);
      }
      else if (type == PARAGRAPH_LABEL) {
        return new CobolMiniParagraphLabelImpl(node);
      }
      else if (type == PARAGRAPH_NAME) {
        return new CobolMiniParagraphNameImpl(node);
      }
      else if (type == PERFORM_STATEMENT) {
        return new CobolMiniPerformStatementImpl(node);
      }
      else if (type == PICTURE_CLAUSE) {
        return new CobolMiniPictureClauseImpl(node);
      }
      else if (type == PROCEDURE_DIVISION) {
        return new CobolMiniProcedureDivisionImpl(node);
      }
      else if (type == PROGRAM_ID_STATEMENT) {
        return new CobolMiniProgramIdStatementImpl(node);
      }
      else if (type == PROGRAM_NAME) {
        return new CobolMiniProgramNameImpl(node);
      }
      else if (type == SECURITY_CLAUSE) {
        return new CobolMiniSecurityClauseImpl(node);
      }
      else if (type == STOP_RUN_STATEMENT) {
        return new CobolMiniStopRunStatementImpl(node);
      }
      else if (type == VALUE_CLAUSE) {
        return new CobolMiniValueClauseImpl(node);
      }
      else if (type == VARYING_CLAUSE) {
        return new CobolMiniVaryingClauseImpl(node);
      }
      else if (type == WORKING_STORAGE_SECTION) {
        return new CobolMiniWorkingStorageSectionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
