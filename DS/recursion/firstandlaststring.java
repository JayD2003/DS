public class firstandlaststring {
    //if initialized in recursion value may change every single time
    public static int first = -1, last = -1;
    public static void findOccurences(String s, int index, char element) {
        if (index == s.length() - 1) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curr = s.charAt(index);
        if (curr == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        findOccurences(s, index+1, element);
    }
    public static void main(String args[]) {
        String s = "jayasai";
        findOccurences(s,0, 'a');
    }
}
