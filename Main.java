import java.util.Scanner; // Add this line to use Scanner
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imag1 = scanner.nextDouble();

        System.out.print("Enter the real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        double imag2 = scanner.nextDouble();

        MyComplex complex1 = new MyComplex(real1, imag1);
        MyComplex complex2 = new MyComplex(real2, imag2);

        MyComplex sum = complex1.add(complex2);
        MyComplex difference = complex1.subtract(complex2);

        System.out.println("Sum: " + sum.getReal() + " + " + sum.getImag() + "i");
        System.out.println("Difference: " + difference.getReal() + " + " + difference.getImag() + "i");

        scanner.close();
    }
}
