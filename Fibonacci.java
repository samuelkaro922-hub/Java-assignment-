import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] args) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        System.out.println("First 100 Fibonacci numbers:");

        for (int i = 1; i <= 100; i++) {
            System.out.println(i + ": " + a);
            BigInteger next = a.add(b);
            a = b;
            b = next;
        }
    }
}
