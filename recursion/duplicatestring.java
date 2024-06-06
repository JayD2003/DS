public class duplicatestring {
    //time complexity = O(n)
    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String s,int i,String n){
        if(i==s.length()){
            System.out.println(n);
            return;
        }
        char c = s.charAt(i);
        if(map[c-'a']){
            removeDuplicates(s, i+1,n);
        }else{
            n += c;
            map[c - 'a'] = true;
            removeDuplicates(s, i+1,n);
        }
    }

    public static void main(String args[]) {
        String s = "aabbccdd";
        removeDuplicates(s, 0,"");
    }
}
