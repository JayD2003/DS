public class permutationstring {
    public static void printPerm(String s, String perm) {
        if (s.length() == 0) {
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String n = s.substring(0, i) + s.substring(i + 1);
            printPerm(n, perm+c);
        }
    }
    public static void main(String args[]) {
        String s = "abcd";
        printPerm(s, "");
    }
}

