import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        double realSum = this.real + other.real;
        double imaginarySum = this.imaginary + other.imaginary;
        return new Complex(realSum, imaginarySum);
    }

    public Complex sub(Complex other) {
        double realsub = this.real - other.real;
        double imaginarysub = this.imaginary - other.imaginary;
        return new Complex(realsub, imaginarysub);
    }

    public Complex mul(Complex other) {
        double realProduct = (this.real * other.real) - (this.imaginary * other.imaginary);
        double imaginaryProduct = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(realProduct, imaginaryProduct);
    }

    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + (-imaginary) + "i";
        }
    }
}

public class ComplexOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the real and imaginary parts of the first complex number:");
        System.out.print("Real Part: ");
        double real1 = scanner.nextDouble();
        System.out.print("Imaginary Part: ");
        double imaginary1 = scanner.nextDouble();
        Complex complex1 = new Complex(real1, imaginary1);

        System.out.println("Enter the real and imaginary parts of the second complex number:");
        System.out.print("Real Part: ");
        double real2 = scanner.nextDouble();
        System.out.print("Imaginary Part: ");
        double imaginary2 = scanner.nextDouble();
        Complex complex2 = new Complex(real2, imaginary2);

        Complex sum = complex1.add(complex2);
        Complex Subraction = complex1.sub(complex2);
        Complex product = complex1.mul(complex2);

        System.out.println("Addition " + sum);
        System.out.println("Subraction: " + Subraction);
        System.out.println("Product: " + product);

        scanner.close();
    }
}