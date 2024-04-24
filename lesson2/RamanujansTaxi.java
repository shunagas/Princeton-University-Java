public class RamanujansTaxi {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) break;

            for (int b = a; b <= n; b++) {
                int ab3 = a3 + b * b * b;
                if (ab3 > n) break;

                for (int c = a + 1; c <= n; c++) {
                    int c3 = c * c * c;
                    if (c3 > n) break;

                    for (int d = c; d <= n; d++) {
                        int cd3 = c3 + d * d * d;
                        if (cd3 > n) break;

                        if ((d != a && d != b && a != c && b != c) && (cd3 == ab3)) {
                            System.out.println(ab3 + " can be expressed as " +
                                    a + "^3 + " + b + "^3 and " +
                                    c + "^3 + " + d + "^3");
                        }
                    }
                }
            }
        }
    }
}