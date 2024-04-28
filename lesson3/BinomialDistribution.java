public class BinomialDistribution {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error");
            return;
        }
        int n = Integer.parseInt(args[0]);

        double[][] binomial = new double[n + 1][];

        for (int i = 0; i <= n; i++) {
            binomial[i] = new double[i + 1];
            binomial[i][0] = Math.pow(0.5, i);
            for (int k = 1; k < i; k++) {
                binomial[i][k] = (binomial[i - 1][k - 1] + binomial[i - 1][k]) / 2.0;
            }
            if (i > 0) {
                binomial[i][i] = Math.pow(0.5, i);
            }
        }

        for (int i = 0; i <= n; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.printf("%.5f ", binomial[i][k]);
            }
            System.out.println();
        }
    }
}