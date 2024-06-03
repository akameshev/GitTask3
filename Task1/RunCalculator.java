package Task1;

import Task1.factory.ComplexNumber;
import Task1.strategy.AdditionOperation;
import Task1.strategy.ComplexOperation;
import Task1.strategy.DivisionOperation;
import Task1.strategy.MultiplicationOperation;

public class RunCalculator {
    public static void main(String[] args) {
        ComplexCalculator calculator = new ComplexCalculator();
        ComplexNumber a = new ComplexNumber(1, 2);
        ComplexNumber b = new ComplexNumber(3, 4);
        AdditionOperation operation = new AdditionOperation();
        calculator.setOperation((ComplexOperation) new AdditionOperation());
        System.out.println("Addition: " + calculator.calculate(a, b));
        calculator.setOperation(new MultiplicationOperation());
        System.out.println("Multiplication: " + calculator.calculate(a, b));
        calculator.setOperation(new DivisionOperation());
        System.out.println("Division: " + calculator.calculate(a, b));
    }
}