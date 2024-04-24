public class PrimeCounter {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java PrimeCounter <n>");
            return;
        }
        int n = Integer.parseInt(args[0]);
        int primeCount = 0;

        long startTime = System.currentTimeMillis();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primeCount++;
                //System.out.println(i);
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total primes up to " + n + ": " + primeCount);
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i+= 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}