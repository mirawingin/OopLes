package complexcalculator.model;

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
        if (imaginary >= 0) {
            return String.format("%.2f + %.2fi", real, imaginary);
        } else {
            return String.format("%.2f - %.2fi", real, Math.abs(imaginary));
        }
    }

    public static ComplexNumber fromString(String input) {
        String[] parts = input.split("\\s*[+-]\\s*");
        double real = Double.parseDouble(parts[0]);
        double imaginary = Double.parseDouble(parts[1].replace("i", ""));
        if (input.contains("-") && parts.length > 1) {
            imaginary = -imaginary;
        }
        return new ComplexNumber(real, imaginary);
    }
}