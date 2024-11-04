import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("11111111111111111111111111111111111111111111111111");
        BigInteger num2 = new BigInteger("22222222222222222222222222222222222222222222222222");

        BigInteger sum = num1.add(num2);
        BigInteger product = num1.multiply(num2);

        System.out.println("Tổng: " + sum);
        System.out.println("Tích: " + product);
    }
}
