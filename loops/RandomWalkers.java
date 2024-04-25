public class RandomWalkers {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("ERROR:Two argument are required");
            return;
        }
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double totalSteps = 0.0;

        for (int t = 0; t < trials; t++) {
            int x = 0, y = 0, steps = 0;
            while (Math.abs(x) + Math.abs(y) < r) {
                double random = Math.random();
                if (random < 0.25) x++;
                else if (random < 0.5) x--;
                else if (random < 0.75) y++;
                else y--;
                steps++;
            }
            totalSteps += steps;
        }
        double averageSteps = totalSteps / trials;
        System.out.println("average number of steps = " + averageSteps);
    }
}