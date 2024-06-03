package Task1.strategy;

import Task1.factory.ComplexNumber;

public interface ComplexOperation {
    ComplexNumber execute(ComplexNumber a, ComplexNumber b);
}