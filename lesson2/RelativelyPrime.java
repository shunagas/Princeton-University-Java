public class RelativelyPrime {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                int r = gcd(i, j);
                if (r == 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}