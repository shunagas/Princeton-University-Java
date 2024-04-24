public class RandomWalker {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java RandomWalker <n>");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int x = 0, y = 0;
        int steps = 0;

        while (Math.abs(x) <= n && Math.abs(y) <= n) {
            if (Math.abs(x) == n || Math.abs(y) == n) {
                break;
            }

            double random = Math.random();
            if (random < 0.25) {
                x++;
            } else if (random < 0.5) {
                x--;
            } else if (random < 0.75) {
                y++;
            } else {
                y--;
            }
            steps++;
        }

        System.out.println("Total steps taken: " + steps);
    }
}