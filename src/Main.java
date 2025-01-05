import DesignCalculator.ArthematicExpression;
import DesignCalculator.Expression;
import DesignCalculator.Number;
import DesignCalculator.Operation;
import DesignFileSystem.Directory;
import DesignFileSystem.File;

public class Main {
    public static void main(String[] args) {

        Directory directory = new Directory("root");
        directory.addFile(new File("file1"));
        directory.addFile(new File("file2"));
        directory.addFile(new File("file3"));

        directory.ls();

        File file = new File("file4");
        file.ls();

        // Calculator
        ArthematicExpression arthematicExpression = new Number(10);
        Number number = new Number(10);
        Number number2 = new Number(5);
        Expression expression = new Expression(number,number2, Operation.ADDITION);
        System.out.println(expression.evaluate());

    }
}