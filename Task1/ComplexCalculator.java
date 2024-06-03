package Task1;

import Task1.factory.ComplexNumber;
import Task1.singleton.LoggerSingleton;
import Task1.strategy.ComplexOperation;

import java.util.logging.Logger;

public class ComplexCalculator {
    private ComplexOperation operation;

    public void setOperation(ComplexOperation operation) {
        this.operation = operation;
    }

    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        Logger logger = LoggerSingleton.getInstance();
        logger.info("Calculating: " + a + " and " + b);
        ComplexNumber result = operation.execute(a, b);
        logger.info("Result: " + result);
        return result;
    }
}