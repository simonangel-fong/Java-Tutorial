# Tutorial: Java in VS Code

[TOC]

link: https://code.visualstudio.com/docs/java/java-tutorial

## Setting up VS Code for Java development

### Install Coding Pack for Java

**Coding Pack for Java** includes _VS Code_, the _Java Development Kit (JDK)_, and essential _Java extensions_.

### Installing extensions

- Language Support for Java™ by Red Hat
- Debugger for Java
- Test Runner for Java
- Maven for Java
- Project Manager for Java
- Visual Studio IntelliCode

### 查看java版本

CMD: `java -version`

***

## Java file

### Creating a source code file

- Command Palette (Ctrl+Shift+P): `Java: Create Java Project`

### Editing source code

- Search for symbols in the workspace: `Ctrl+T`
- Search for symbols in current file: `Ctrl+P` + `@`

- Peek Definition速览定义: `Alt+F12`
- Go to Definition: `F12`
- 转到父类实现: 右键Go to Super Implementation

- Smart Selection: 
    - To expand the selection, use `Shift+Alt+Right`.
    - To shrink the selection, use `Shift+Alt+Left`.

- Editing formatter settings: `Java: Open Java Formatter Settings with Preview`

### Running and debugging your program

- Either press `F5` on your keyboard or use the `Run > Start Debugging` menu item

## Configure Runtime for Projects

设置项目运行时的环境,即JDK

1. `Ctrl+Shift+P`
2. `Java: Configure Java Runtime in Command Palette`
3. 可以下载并安装: Manage Java runtime for your projects. If you don't have a valid Java runtime, you can download one.