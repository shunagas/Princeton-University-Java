public class Birthday {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Error");
            return;
        }
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int[] counts = new int[n + 1];

        for (int trial = 0; trial < trials; trial++) {
            boolean[] hasBirthday = new boolean[n];
            int people = 0;

            while (true) {
                int birthday = (int) (Math.random() * n);
                people++;
                if (hasBirthday[birthday]) {
                    counts[people]++;
                    break;
                }
                hasBirthday[birthday] = true;
            }
        }
        int cumulative = 0;
        for (int i = 1; i <= n; i++) {
            if (counts[i] >= 0) {
                cumulative += counts[i];
                double fraction = (double) cumulative / trials;
                System.out.printf("%d\t%d\t%.6f\n", i, counts[i], fraction);
                if (fraction >= 0.5) {
                    break;
                }
            }
        }
    }
}