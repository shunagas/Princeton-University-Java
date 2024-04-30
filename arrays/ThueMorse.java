public class ThueMorse {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Error");
            return;
        }
        int n = Integer.parseInt(args[0]);
        boolean[] sequence = new boolean[n * n];
        sequence[0] = false;

        for (int i = 1; i < n * n; i *= 2) {
            for (int j = 0; j < i && i + j < n * n; j++) {
                sequence[i + j] = !sequence[j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sequence[i] == sequence[j]) {
                    System.out.print("+  ");
                } else {
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
    }
}