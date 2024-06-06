import java.util.ArrayList;

public class subarrays {
    public static void printsubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void printsub(int[] a,int index,ArrayList<Integer> subset) {
        if (index == a.length) {
            printsubset(subset);
            return;
        }

        subset.add(a[index]);
        printsub(a, index + 1, subset);
        
        subset.remove(subset.size() - 1);
        printsub(a, index + 1, subset);
    }
    public static void main(String args[]) {
        int[] a = { 1, 2, 3 };
        ArrayList<Integer> subset = new ArrayList<>();
        printsub(a, 0,subset);
    }
}
