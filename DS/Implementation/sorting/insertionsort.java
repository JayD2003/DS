import java.util.*;

//Idea: Take an element from the unsorted array, 
//place it in its corresponding position in the sorted part,
//and shift the elements accordingly. 

//time complexity = O(n^2)
public class insertionsort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        for (int i = 1; i < n; i++) {
            int x = a[i];
            int j = i - 1;

            while (j >= 0 && x < a[j]) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = x;
        }
        
        for (int i : a) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
