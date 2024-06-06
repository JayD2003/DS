import java.util.HashSet;

public class uniquesubsequences {
    //uses hashset to store the unique subsequences
    public static void subsequences(String s, int index, String n,HashSet<String> st) {
        if (index == s.length()) {
            if (st.contains(n)) {
                return;
            } else {
                System.out.println(n);
                st.add(n);
                return;
            }
        }

        char c = s.charAt(index);

        //to add character
        subsequences(s, index + 1, n + c,st);
        
        //to not add character of string
        subsequences(s, index+1, n,st);
    }

    public static void main(String args[]) {
        String s = "aaa";
        HashSet<String> st = new HashSet<>();
        subsequences(s, 0, "", st);
    }
}
