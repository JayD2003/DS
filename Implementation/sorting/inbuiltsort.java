import java.util.*;

public class inbuiltsort {

    public static void main(String[] args) {
        Integer[] n = new Integer[]{5,4,2,1,3};

        Arrays.sort(n, Collections.reverseOrder());

        for(int i: n){
            System.out.print(i+" ");
        }
    }
}
