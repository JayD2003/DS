import java.util.Scanner;

public class averagefunc {

    public static void average(int a, int b, int c) {
        int x = (a + b + c) / 3;
        System.out.println(x);
    }

    public static void sumofodd(int n) {
        int s = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                s += i;
            }
        }
        System.out.println(s);
    }

    // public static void userloop() {
        
    // }
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();
         sc.close();
         average(a, b, c);
         sumofodd(10);

    }
}
