package pl.mateusz.cobolmini.highlighter;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pl.mateusz.cobolmini.lang.CobolMiniIcons;

import javax.swing.*;
import java.util.Map;

public final class CobolMiniColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Keyword", CobolMiniSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("Identifier", CobolMiniSyntaxHighlighter.IDENTIFIER),
            new AttributesDescriptor("String", CobolMiniSyntaxHighlighter.STRING),
            new AttributesDescriptor("Number", CobolMiniSyntaxHighlighter.NUMBER),
            new AttributesDescriptor("Level number", CobolMiniSyntaxHighlighter.LEVEL_NUMBER),
            new AttributesDescriptor("Line number", CobolMiniSyntaxHighlighter.LINE_NUMBER),
            new AttributesDescriptor("Picture string", CobolMiniSyntaxHighlighter.PICTURE_STRING),
            new AttributesDescriptor("Operator", CobolMiniSyntaxHighlighter.OPERATOR),
            new AttributesDescriptor("Punctuation", CobolMiniSyntaxHighlighter.PUNCTUATION),
            new AttributesDescriptor("Bad character", CobolMiniSyntaxHighlighter.BAD_CHARACTER),
    };

    @Override
    public Icon getIcon() {
        return CobolMiniIcons.FILE;
    }

    @Override
    public @NotNull SyntaxHighlighter getHighlighter() {
        return new CobolMiniSyntaxHighlighter();
    }

    @Override
    public @NotNull String getDemoText() {
        return """
               01 IDENTIFICATION DIVISION.
               02 PROGRAM-ID. HELLO.
               03 DATA DIVISION.
               04 WORKING-STORAGE SECTION.
               05 01 WS-A PIC 9(2) VALUE 0.
               06 PROCEDURE DIVISION.
               07 A-PARA.
               08 PERFORM B-PARA VARYING WS-A FROM 2 BY 2 UNTIL WS-A=12
               09 STOP RUN.
               10 B-PARA.
               11 DISPLAY 'B-PARA ' WS-A.
               12 DISPLAY 'B-PARA'.
               """;
    }

    @Override
    public @Nullable Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @Override
    public @NotNull String getDisplayName() {
        return "CobolMini";
    }
}
