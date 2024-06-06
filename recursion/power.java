public class power {
    //stack height = n
    public static int calpower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        if (a == 0) {
            return 0;
        }
        int b = calpower(a, n - 1);
        int x = a * b;
        return x;
    }
    
    //stackheight = log(n)
    public static int calcpower(int a,int n){
        if(n==0){
            return 1;
        }
        if (a == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return calcpower(a, n / 2) * calcpower(a, n / 2);
        } else {
            return calcpower(a, n / 2) * calcpower(a, n / 2) * a;
        }
    }
    public static void main(String args[]) {
        int a = 2, n = 5;
        System.out.println(calpower(a, n));
        System.out.println(calcpower(a, n));
    }
}
