public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;

        System.out.println("Prime numbers from 1 to 500:");

        for (int num = 2; num <= 500; num++) {
            boolean isPrime = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }

        System.out.println("\n\nTotal number of primes: " + count);
    }
}
