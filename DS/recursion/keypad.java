public class keypad {
    public static String[] key = { ".", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz" };
    
    public static void printcomb(String s, int index, String n) {
        if (index == s.length()) {
            System.out.println(n);
            return;
        }
        char m = s.charAt(index);
        String maap = key[m-'0'];
        for (int i = 0; i < maap.length(); i++) {
            printcomb(s, index+1, n+maap.charAt(i));
        }
    }

    public static void main(String args[]) {
        String s = "0";
        printcomb(s, 0, "");
    }
}
