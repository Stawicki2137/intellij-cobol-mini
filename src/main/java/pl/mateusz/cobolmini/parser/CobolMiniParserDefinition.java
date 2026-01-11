package pl.mateusz.cobolmini.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;
import pl.mateusz.cobolmini.lang.CobolMiniLanguage;
import pl.mateusz.cobolmini.lang.CobolMiniLexerAdapter;
import pl.mateusz.cobolmini.psi.CobolMiniFile;
import pl.mateusz.cobolmini.psi.CobolMiniTokenSets;
import pl.mateusz.cobolmini.psi.CobolMiniTypes;

public final class CobolMiniParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(CobolMiniLanguage.INSTANCE);

    @Override
    public @NotNull Lexer createLexer(Project project) {
        return new CobolMiniLexerAdapter();
    }

    @Override
    public @NotNull TokenSet getCommentTokens() {
        return TokenSet.EMPTY;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements() {
        return CobolMiniTokenSets.STRINGS;
    }

    @Override
    public @NotNull PsiParser createParser(final Project project) {
        return new CobolMiniParser();
    }

    @Override
    public @NotNull IFileElementType getFileNodeType() {
        return FILE;
    }

    @Override
    public @NotNull PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new CobolMiniFile(viewProvider);
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode node) {
        return CobolMiniTypes.Factory.createElement(node);
    }

    @Override
    public @NotNull TokenSet getWhitespaceTokens() {
        return CobolMiniTokenSets.WHITE_SPACES;
    }
}
