public class MyPolynomialTest {
    public static void main(String[] args) {
        MyPolynomial poly1 = new MyPolynomial(1, 2, 3);
        MyPolynomial poly2 = new MyPolynomial(4, 5);

        System.out.println(poly1); // In ra đa thức poly1
        System.out.println(poly2); // In ra đa thức poly2

        System.out.println(poly1.evaluate(2)); // Tính giá trị của poly1 tại x = 2
    }
}