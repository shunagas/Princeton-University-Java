public class GeneralizedHarmonic {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("ERROR:Two arguments are required");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);

        double harmonicNumber = 0.0;

        for (int i = 1; i <= n; i++) {
            harmonicNumber += 1 / Math.pow(i, r); // i^rを表す
        }
        System.out.println(harmonicNumber);
    }
}