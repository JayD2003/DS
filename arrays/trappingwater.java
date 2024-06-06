public class trappingwater {
    public static int trap(int[] h) {
        int n = h.length - 1, s = 0;
        int[] l = new int[h.length]; // for left - side max height
        int[] r = new int[h.length]; // for right - side max height
        l[0] = h[0];
        r[n] = h[n];
        for (int i = 1; i < h.length - 1; i++) {
            if (l[i - 1] > h[i]) {
                l[i] = l[i - 1];
            } else {
                l[i] = h[i];
            }

            if (r[n - i + 1] > h[n - i]) {
                r[n - i] = r[n - i + 1];
            } else {
                r[n - i] = h[n - i];
            }
        }
        for (int i = 1; i < n; i++) {
            s += (Math.min(l[i], r[i]) - h[i]); //min height of both left and right - height of the bar
        }
        return s;
    }
    public static void main(String[] args) {
        int[] h = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trap(h));
    }
}
