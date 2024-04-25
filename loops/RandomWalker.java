public class RandomWalker {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("ERROR:One argument is required");
            return;
        }
        int r = Integer.parseInt(args[0]); // マンハッタン距離
        int x = 0, y = 0;
        int steps = 0;

        System.out.println("(" + x + ", " + y + ")");

        while (Math.abs(x + y) < r) {
            if (Math.abs(x) == r || Math.abs(y) == r) break;

            double random = Math.random();
            if (random < 0.25) x++;
            else if (random < 0.5) x--;
            else if (random < 0.75) y++;
            else y--;
            steps++;
            System.out.println("(" + x + ", " + y + ")");
        }
        System.out.println("steps = " + steps);
    }
}