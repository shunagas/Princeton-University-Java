public class Mathmatics
{
    public static void main(String[] args) {
        random();
        ascendance(args);
    }
    public static void random()
    {
        double random1 = Math.random() * 10;
        double random2 = Math.random() * 10;
        double random3 = Math.random() * 10;
        double random4 = Math.random() * 10;
        double random5 = Math.random() * 10;
        double sum = random1 + random2 + random3 + random4 + random5;
        System.out.println("sum: " + sum);
        double ave = sum / 5;
        System.out.println("ave: " + ave);
        int max = (int) (Math.max(Math.max(Math.max(random1, random2), Math.max(random3, random4)), random5));
        int min = (int) (Math.min(Math.min(Math.min(random1, random2), Math.min(random3, random4)), random5));
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
    public static void ascendance(String[] args)
    {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int number3 = Integer.parseInt(args[2]);
        int max = Math.max(Math.max(number1, number2), number3);
        int min = Math.min(Math.min(number1, number2), number3);
        int mid = number1 + number2 + number3 - max - min;
        System.out.println("ascendance: " + min + ":" + mid + ":" + max);
    }
}