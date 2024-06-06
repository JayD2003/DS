import java.util.*;

//time complexity = O(n^2)
public class bubblesort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[]{5,4,1,3,2};

        //for (int i = 0; i < n; i++) {
        //    a[i] = sc.nextInt();
        //}

        //outer loop - with 1 less than n - to cover every element
        for (int i = 0; i < n - 1; i++) {
            //inner loop - with less range 
            for (int j = 0; j < n-i-1; j++) {
                if (a[j] > a[j + 1]) {
                    //swap
                    int c = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = c;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}