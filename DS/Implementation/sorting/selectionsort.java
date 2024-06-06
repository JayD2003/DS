import java.util.*;

//Idea: The inner loop selects the minimum element in the unsorted array 
//and places the elements in increasing order.

//time complexity = O(n^2)
public class selectionsort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        //outerloop
        for (int i = 0; i < n - 1; i++) {
            int c = i;//to swap
            for (int j = i + 1; j < n; j++) {
                //to find smallest number
                if (a[c] > a[j]) {
                    c = j;
                }
            }
            //swapping 
            int x = a[c];
            a[c] = a[i];
            a[i] = x;

            for (int k = 0; k < n; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}


