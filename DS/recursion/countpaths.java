public class countpaths {
    public static int countpath(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 || j == m - 1) {
            return 1;
        }

        int downwards = countpath(i + 1, j, n, m);

        int rightwards = countpath(i, j + 1, n, m);

        return downwards + rightwards;
    }
    public static void main(String args[]) {
        int n = 5,m = 5;
        System.out.println(countpath(0, 0, n, m));
    }
    
}
