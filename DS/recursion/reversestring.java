public class reversestring {
    public static void reverse(String s, int n) {
        if (n == -1) {
            return;
        }
        System.out.print(s.charAt(n));
        reverse(s, n-1);
    }

    public static void main(String args[]) {
        String s = "Jay";
        int n = s.length()-1;
        reverse(s, n);
    }
}
