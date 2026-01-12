# CobolMini (IntelliJ Platform Plugin)

**CobolMini** is an IntelliJ Platform plugin that provides basic language support for a small COBOL-like language.

## Features
- File type support for `*.cob`
- Lexer (JFlex) + adapter
- Parser/PSI integration
- Syntax highlighting (SyntaxHighlighter + factory)
- Color settings page (Editor → Color Scheme → CobolMini)

## Requirements
- JDK version matching the project/Gradle configuration
- IntelliJ-based IDE (tested via `runIde`)

## Build
```bash
./gradlew clean build
```
## Run the IDE with the plugin
```bash
./gradlew runIde
```
