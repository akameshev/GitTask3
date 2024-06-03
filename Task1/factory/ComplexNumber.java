package Task1.factory;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(real);
        builder.append(", ");
        builder.append(imaginary);
        String result = builder.toString();
        return result;
    }
}