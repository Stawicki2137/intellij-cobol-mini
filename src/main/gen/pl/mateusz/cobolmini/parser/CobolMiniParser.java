// This is a generated file. Not intended for manual editing.
package pl.mateusz.cobolmini.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static pl.mateusz.cobolmini.psi.CobolMiniTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CobolMiniParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return cobolFile(b, l + 1);
  }

  /* ********************************************************** */
  // AUTHOR DOT? commentEntry*
  public static boolean authorClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "authorClause")) return false;
    if (!nextTokenIs(b, AUTHOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AUTHOR);
    r = r && authorClause_1(b, l + 1);
    r = r && authorClause_2(b, l + 1);
    exit_section_(b, m, AUTHOR_CLAUSE, r);
    return r;
  }

  // DOT?
  private static boolean authorClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "authorClause_1")) return false;
    consumeToken(b, DOT);
    return true;
  }

  // commentEntry*
  private static boolean authorClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "authorClause_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!commentEntry(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "authorClause_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // line*
  static boolean cobolFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cobolFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!line(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "cobolFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER | STRING | INTEGER
  public static boolean commentEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "commentEntry")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMENT_ENTRY, "<comment entry>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, INTEGER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier EQ literal
  public static boolean condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && literal(b, l + 1);
    exit_section_(b, m, CONDITION, r);
    return r;
  }

  /* ********************************************************** */
  // DATA DIVISION DOT
  public static boolean dataDivision(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDivision")) return false;
    if (!nextTokenIs(b, DATA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DATA, DIVISION, DOT);
    exit_section_(b, m, DATA_DIVISION, r);
    return r;
  }

  /* ********************************************************** */
  // levelNumber dataName pictureClause valueClause? DOT
  public static boolean dataItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataItem")) return false;
    if (!nextTokenIs(b, LEVEL_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = levelNumber(b, l + 1);
    r = r && dataName(b, l + 1);
    r = r && pictureClause(b, l + 1);
    r = r && dataItem_3(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, DATA_ITEM, r);
    return r;
  }

  // valueClause?
  private static boolean dataItem_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataItem_3")) return false;
    valueClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean dataName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, DATA_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // DATE_COMPILED DOT? commentEntry*
  public static boolean dateCompiledClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dateCompiledClause")) return false;
    if (!nextTokenIs(b, DATE_COMPILED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DATE_COMPILED);
    r = r && dateCompiledClause_1(b, l + 1);
    r = r && dateCompiledClause_2(b, l + 1);
    exit_section_(b, m, DATE_COMPILED_CLAUSE, r);
    return r;
  }

  // DOT?
  private static boolean dateCompiledClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dateCompiledClause_1")) return false;
    consumeToken(b, DOT);
    return true;
  }

  // commentEntry*
  private static boolean dateCompiledClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dateCompiledClause_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!commentEntry(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dateCompiledClause_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // DATE_WRITTEN DOT? commentEntry*
  public static boolean dateWrittenClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dateWrittenClause")) return false;
    if (!nextTokenIs(b, DATE_WRITTEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DATE_WRITTEN);
    r = r && dateWrittenClause_1(b, l + 1);
    r = r && dateWrittenClause_2(b, l + 1);
    exit_section_(b, m, DATE_WRITTEN_CLAUSE, r);
    return r;
  }

  // DOT?
  private static boolean dateWrittenClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dateWrittenClause_1")) return false;
    consumeToken(b, DOT);
    return true;
  }

  // commentEntry*
  private static boolean dateWrittenClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dateWrittenClause_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!commentEntry(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dateWrittenClause_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // DISPLAY (IDENTIFIER|literal)+ DOT?
  public static boolean displayStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "displayStatement")) return false;
    if (!nextTokenIs(b, DISPLAY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DISPLAY);
    r = r && displayStatement_1(b, l + 1);
    r = r && displayStatement_2(b, l + 1);
    exit_section_(b, m, DISPLAY_STATEMENT, r);
    return r;
  }

  // (IDENTIFIER|literal)+
  private static boolean displayStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "displayStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = displayStatement_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!displayStatement_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "displayStatement_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER|literal
  private static boolean displayStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "displayStatement_1_0")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = literal(b, l + 1);
    return r;
  }

  // DOT?
  private static boolean displayStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "displayStatement_2")) return false;
    consumeToken(b, DOT);
    return true;
  }

  /* ********************************************************** */
  // identificationKeyword DIVISION DOT identificationDivisionContent?
  public static boolean identificationDivision(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identificationDivision")) return false;
    if (!nextTokenIs(b, "<identification division>", ID, IDENTIFICATION)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFICATION_DIVISION, "<identification division>");
    r = identificationKeyword(b, l + 1);
    r = r && consumeTokens(b, 0, DIVISION, DOT);
    r = r && identificationDivision_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // identificationDivisionContent?
  private static boolean identificationDivision_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identificationDivision_3")) return false;
    identificationDivisionContent(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identificationEntry*
  public static boolean identificationDivisionContent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identificationDivisionContent")) return false;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFICATION_DIVISION_CONTENT, "<identification division content>");
    while (true) {
      int c = current_position_(b);
      if (!identificationEntry(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "identificationDivisionContent", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // authorClause
  //                       | installationClause
  //                       | dateWrittenClause
  //                       | dateCompiledClause
  //                       | securityClause
  public static boolean identificationEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identificationEntry")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFICATION_ENTRY, "<identification entry>");
    r = authorClause(b, l + 1);
    if (!r) r = installationClause(b, l + 1);
    if (!r) r = dateWrittenClause(b, l + 1);
    if (!r) r = dateCompiledClause(b, l + 1);
    if (!r) r = securityClause(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFICATION | ID
  public static boolean identificationKeyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identificationKeyword")) return false;
    if (!nextTokenIs(b, "<identification keyword>", ID, IDENTIFICATION)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFICATION_KEYWORD, "<identification keyword>");
    r = consumeToken(b, IDENTIFICATION);
    if (!r) r = consumeToken(b, ID);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  static boolean identifier(PsiBuilder b, int l) {
    return consumeToken(b, IDENTIFIER);
  }

  /* ********************************************************** */
  // INSTALLATION DOT? commentEntry*
  public static boolean installationClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "installationClause")) return false;
    if (!nextTokenIs(b, INSTALLATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INSTALLATION);
    r = r && installationClause_1(b, l + 1);
    r = r && installationClause_2(b, l + 1);
    exit_section_(b, m, INSTALLATION_CLAUSE, r);
    return r;
  }

  // DOT?
  private static boolean installationClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "installationClause_1")) return false;
    consumeToken(b, DOT);
    return true;
  }

  // commentEntry*
  private static boolean installationClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "installationClause_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!commentEntry(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "installationClause_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LEVEL_NUMBER
  static boolean levelNumber(PsiBuilder b, int l) {
    return consumeToken(b, LEVEL_NUMBER);
  }

  /* ********************************************************** */
  // lineNumber statement
  public static boolean line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "line")) return false;
    if (!nextTokenIs(b, LINE_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lineNumber(b, l + 1);
    r = r && statement(b, l + 1);
    exit_section_(b, m, LINE, r);
    return r;
  }

  /* ********************************************************** */
  // LINE_NUMBER
  static boolean lineNumber(PsiBuilder b, int l) {
    return consumeToken(b, LINE_NUMBER);
  }

  /* ********************************************************** */
  // INTEGER | STRING
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    if (!nextTokenIs(b, "<literal>", INTEGER, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // paragraphName DOT
  public static boolean paragraphLabel(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraphLabel")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = paragraphName(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, PARAGRAPH_LABEL, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean paragraphName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraphName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, PARAGRAPH_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // PERFORM paragraphName varyingClause?
  public static boolean performStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "performStatement")) return false;
    if (!nextTokenIs(b, PERFORM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERFORM);
    r = r && paragraphName(b, l + 1);
    r = r && performStatement_2(b, l + 1);
    exit_section_(b, m, PERFORM_STATEMENT, r);
    return r;
  }

  // varyingClause?
  private static boolean performStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "performStatement_2")) return false;
    varyingClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (PIC | PICTURE) IS? pictureString
  public static boolean pictureClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pictureClause")) return false;
    if (!nextTokenIs(b, "<picture clause>", PIC, PICTURE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PICTURE_CLAUSE, "<picture clause>");
    r = pictureClause_0(b, l + 1);
    r = r && pictureClause_1(b, l + 1);
    r = r && pictureString(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PIC | PICTURE
  private static boolean pictureClause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pictureClause_0")) return false;
    boolean r;
    r = consumeToken(b, PIC);
    if (!r) r = consumeToken(b, PICTURE);
    return r;
  }

  // IS?
  private static boolean pictureClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pictureClause_1")) return false;
    consumeToken(b, IS);
    return true;
  }

  /* ********************************************************** */
  // PICTURE_STRING
  static boolean pictureString(PsiBuilder b, int l) {
    return consumeToken(b, PICTURE_STRING);
  }

  /* ********************************************************** */
  // PROCEDURE DIVISION DOT
  public static boolean procedureDivision(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedureDivision")) return false;
    if (!nextTokenIs(b, PROCEDURE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PROCEDURE, DIVISION, DOT);
    exit_section_(b, m, PROCEDURE_DIVISION, r);
    return r;
  }

  /* ********************************************************** */
  // PROGRAM_ID DOT? programName DOT?
  public static boolean programIdStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "programIdStatement")) return false;
    if (!nextTokenIs(b, PROGRAM_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PROGRAM_ID);
    r = r && programIdStatement_1(b, l + 1);
    r = r && programName(b, l + 1);
    r = r && programIdStatement_3(b, l + 1);
    exit_section_(b, m, PROGRAM_ID_STATEMENT, r);
    return r;
  }

  // DOT?
  private static boolean programIdStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "programIdStatement_1")) return false;
    consumeToken(b, DOT);
    return true;
  }

  // DOT?
  private static boolean programIdStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "programIdStatement_3")) return false;
    consumeToken(b, DOT);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean programName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "programName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, PROGRAM_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // SECURITY DOT? commentEntry*
  public static boolean securityClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "securityClause")) return false;
    if (!nextTokenIs(b, SECURITY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SECURITY);
    r = r && securityClause_1(b, l + 1);
    r = r && securityClause_2(b, l + 1);
    exit_section_(b, m, SECURITY_CLAUSE, r);
    return r;
  }

  // DOT?
  private static boolean securityClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "securityClause_1")) return false;
    consumeToken(b, DOT);
    return true;
  }

  // commentEntry*
  private static boolean securityClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "securityClause_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!commentEntry(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "securityClause_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // identificationDivision
  // | programIdStatement
  // | dataDivision
  // | workingStorageSection
  // | dataItem
  // | procedureDivision
  // | paragraphLabel
  // | performStatement
  // | stopRunStatement
  // | displayStatement
  static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    r = identificationDivision(b, l + 1);
    if (!r) r = programIdStatement(b, l + 1);
    if (!r) r = dataDivision(b, l + 1);
    if (!r) r = workingStorageSection(b, l + 1);
    if (!r) r = dataItem(b, l + 1);
    if (!r) r = procedureDivision(b, l + 1);
    if (!r) r = paragraphLabel(b, l + 1);
    if (!r) r = performStatement(b, l + 1);
    if (!r) r = stopRunStatement(b, l + 1);
    if (!r) r = displayStatement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // STOP (RUN | literal) DOT?
  public static boolean stopRunStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stopRunStatement")) return false;
    if (!nextTokenIs(b, STOP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STOP);
    r = r && stopRunStatement_1(b, l + 1);
    r = r && stopRunStatement_2(b, l + 1);
    exit_section_(b, m, STOP_RUN_STATEMENT, r);
    return r;
  }

  // RUN | literal
  private static boolean stopRunStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stopRunStatement_1")) return false;
    boolean r;
    r = consumeToken(b, RUN);
    if (!r) r = literal(b, l + 1);
    return r;
  }

  // DOT?
  private static boolean stopRunStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stopRunStatement_2")) return false;
    consumeToken(b, DOT);
    return true;
  }

  /* ********************************************************** */
  // VALUE IS? literal
  public static boolean valueClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueClause")) return false;
    if (!nextTokenIs(b, VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VALUE);
    r = r && valueClause_1(b, l + 1);
    r = r && literal(b, l + 1);
    exit_section_(b, m, VALUE_CLAUSE, r);
    return r;
  }

  // IS?
  private static boolean valueClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueClause_1")) return false;
    consumeToken(b, IS);
    return true;
  }

  /* ********************************************************** */
  // VARYING identifier FROM literal BY literal UNTIL condition
  public static boolean varyingClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varyingClause")) return false;
    if (!nextTokenIs(b, VARYING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VARYING);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, FROM);
    r = r && literal(b, l + 1);
    r = r && consumeToken(b, BY);
    r = r && literal(b, l + 1);
    r = r && consumeToken(b, UNTIL);
    r = r && condition(b, l + 1);
    exit_section_(b, m, VARYING_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // WORKING_STORAGE SECTION DOT
  public static boolean workingStorageSection(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workingStorageSection")) return false;
    if (!nextTokenIs(b, WORKING_STORAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WORKING_STORAGE, SECTION, DOT);
    exit_section_(b, m, WORKING_STORAGE_SECTION, r);
    return r;
  }

}
