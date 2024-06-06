
public class re1 {

    public static int fact(int i) {
        if (i == 0 || i == 1) {
            return 1;
        }
        return i * fact(i - 1);
        
    }
    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);
        System.out.println(i); //this print will print after meeting base case or limit of the recursion
    }
    public static void main(String args[]) {
        System.out.println(fact(5));
    }
}