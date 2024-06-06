import java.util.*;

public class function {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void printname(String n) {
        System.out.println(n);
        return;
    }
    public static void main(String args[]) {
        printname("Jay");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        System.out.println(sum(n, x));
        sc.close();
    }
}
