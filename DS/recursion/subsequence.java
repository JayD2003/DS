import java.util.ArrayList;

public class subsequence {

    public static void subsequences(String s, int index, ArrayList<Character> a) {
        if (index == s.length()) {
            System.out.println(a);
            return;
        }

        char c = s.charAt(index);

        a.add(c);
        //to add character
        subsequences(s, index + 1, a);

        
        a.remove(a.size() - 1);
        //to not add character of string
        subsequences(s, index+1, a);
    }
    public static void main(String args[]) {
        String s = "abc";
        ArrayList<Character> a = new ArrayList<>();
        subsequences(s, 0, a);
    }
}

//"" starting - add"a"
//ab a b  2nd level  -  add all   no"b"   no"a"
//abc ac bc c - add all  no"b",add"c"  no"a",add"c"  no"a""b"  no"a""b""c"