public class DuplicateFinder {
    private static boolean hasDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0) {
                return true;
            }
            arr[index] = -arr[index];
        }
        return false;
    }
    public static void main(String[] args) {
        int[] testArray = {3, 1, 3, 4, 2};
        System.out.println(hasDuplicate(testArray));
    }
}