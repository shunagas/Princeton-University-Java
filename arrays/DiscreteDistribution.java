public class DiscreteDistribution {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error: More two argument are required.");
            return;
        }
        int m = Integer.parseInt(args[0]);

        int totalWeight = 0;

        int[] weights = new int[args.length - 1];

        for (int i = 1; i < args.length; i++) {
            weights[i - 1] = Integer.parseInt(args[i]);
            totalWeight += weights[i - 1];
        }

        for (int j = 0; j < m; j++) {
            int r = (int) (Math.random() * totalWeight);
            int sum = 0;

            for (int k = 0; k < weights.length; k++) {
                sum += weights[k];
                if (r < sum) {
                    System.out.print((k + 1) + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}