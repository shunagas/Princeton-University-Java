public class Kary {

    private static String convertToBaseK(long number, int base) {
        String result = "";
        while (number > 0) {
            long remainder = number % base;
            char digit;

            if (remainder < 10) {
                digit = (char) ('0' + remainder);
            } else {
                digit = (char)('A' + remainder - 10);
            }
            result = digit + result;
            number /= base;
        }
        return result;
    }
    public static void main(String[] args) {
        long i = Long.parseLong(args[0]);
        int k = Integer.parseInt(args[1]);

        if (k < 2 || k > 16) {
            System.out.println("Error: 2 <= k <= 16");
            return;
        }

        String converted = convertToBaseK(i, k);
        if (args.length != 2) {
            System.out.println("Error: args is 2");
            return;
        }

        System.out.println(converted);


    }
}