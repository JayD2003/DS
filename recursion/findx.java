public class findx {

    public static String rearrange(String s, int i,int c,String s1) {
        if (i == s.length()) {
            for (int k = 0; k < c; k++) {
                s1 += 'x';
            }
            return s1;
        }
        char curr = s.charAt(i);
        if (curr == 'x') { 
            c++;
            return rearrange(s, i + 1, c, s1);
        } else {
            s1 += curr;
            return rearrange(s, i + 1, c, s1);
        }
    }

    public static void main(String args[]) {
        String s = "jayxxxsai";
        System.out.println(rearrange(s, 0, 0, ""));
    }
}
