package Task1.strategy;

import Task1.factory.ComplexNumber;

public class AdditionOperation implements ComplexOperation {
    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
    }
}

