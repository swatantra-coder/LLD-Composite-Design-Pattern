# LLD-Composite-Design-Pattern

# Design Calculator and File System
Overview
This project consists of two main components: a simple calculator for arithmetic expressions and a basic file system simulation. The calculator supports basic arithmetic operations, while the file system allows for the creation and listing of directories and files.  
Calculator
The calculator component is designed to evaluate arithmetic expressions. It includes the following classes:  
Number
Represents a numeric value in an arithmetic expression.

### UML Diagram

Here is the UML diagram for the project:

```plaintext
+-------------------+
|   ArthematicExpression  |
+-------------------+
| + evaluate(): int |
+-------------------+
          ^
          |
+-------------------+          +-------------------+
|      Number       |          |    Expression     |
+-------------------+          +-------------------+
| - number: int     |          | - left: ArthematicExpression |
| + Number(int)     |          | - right: ArthematicExpression|
| + evaluate(): int |          | - operation: Operation       |
+-------------------+          | + Expression(ArthematicExpression, ArthematicExpression, Operation) |
                               | + evaluate(): int             |
                               +-------------------+
                                        ^
                                        |
                               +-------------------+
                               |    Operation      |
                               +-------------------+
                               | + ADDITION        |
                               | + SUBTRACTION     |
                               | + MULTIPLICATION  |
                               | + DIVISION        |
                               +-------------------+

+-------------------+
|     Directory     |
+-------------------+
| - name: String    |
| - files: List<File> |
| + Directory(String) |
| + addFile(File): void |
| + ls(): void      |
+-------------------+
          ^
          |
+-------------------+
|       File        |
+-------------------+
| - name: String    |
| + File(String)    |
| + ls(): void      |
+-------------------+
```

![image](https://github.com/user-attachments/assets/554fa206-f30d-4df0-8c61-853f277f21b3)
