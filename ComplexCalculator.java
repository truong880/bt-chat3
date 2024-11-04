import java.util.Scanner; // Import Scanner for user input

public class ComplexCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the first complex number
        System.out.print("Nhập phần thực của số phức thứ nhất: ");
        double realPart1 = scanner.nextDouble();
        System.out.print("Nhập phần ảo của số phức thứ nhất: ");
        double imaginaryPart1 = scanner.nextDouble();

        // Input the second complex number
        System.out.print("Nhập phần thực của số phức thứ hai: ");
        double realPart2 = scanner.nextDouble();
        System.out.print("Nhập phần ảo của số phức thứ hai: ");
        double imaginaryPart2 = scanner.nextDouble();

        // Create MyComplex objects
        MyComplex c1 = new MyComplex(realPart1, imaginaryPart1);
        MyComplex c2 = new MyComplex(realPart2, imaginaryPart2);

        // Perform operations
        MyComplex sum = c1.add(c2);
        System.out.println("Tổng: " + sum.getReal() + " + " + sum.getImag() + "i");

        MyComplex difference = c1.subtract(c2);
        System.out.println("Hiệu: " + difference.getReal() + " + " + difference.getImag() + "i");

        MyComplex product = c1.multiply(c2);
        System.out.println("Tích: " + product.getReal() + " + " + product.getImag() + "i");

        MyComplex quotient = c1.divide(c2);
        System.out.println("Thương: " + quotient.getReal() + " + " + quotient.getImag() + "i");

        scanner.close(); // Close the scanner
    }
}