public class BandMatrix {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("ERROR:Two arguments are required");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(j - i) > width) {
                    System.out.print("0  ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }
}