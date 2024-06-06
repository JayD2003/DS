public class sortedarray {
    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] < arr[i + 1]) {
            return isSorted(arr, i + 1);
        }
        else {
            return false;
        }
    }
    public static void main(String args[]) {
        int[] a = { 1, 2, 34, 144 };
        System.out.println(isSorted(a, 0));
    }
}
