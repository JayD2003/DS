public class towerofhanoi {
    public static void changetower(int n, String src, String help, String dest) {
        //last disk
        if (n == 1) {
            System.out.println("transfer of " + n + " from " + src + " to " + dest);
            return;
        }
        //top disk
        changetower(n - 1, src, dest, help);
        System.out.println("transfer of " + n + " from " + src + " to " + dest);
        //second disk
        changetower(n - 1, help, src, dest);
    }
    public static void main(String args[]) {
        int n = 3;
        changetower(n, "s", "h", "d");
    }
}
