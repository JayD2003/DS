public class coutingsort {
    public static void main(String[] args) {
        int[] n = new int[]{5,4,1,2,3};

        int maxNum = Integer.MIN_VALUE;

        for(int i=0;i<n.length;i++){
            maxNum = maxNum < n[i] ? n[i] : maxNum;
        }

        System.out.println(maxNum);

        int[] count = new int[maxNum+1];

        for(int i=0;i<n.length;i++){
            count[n[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                n[j] = i;
                j++;
                count[i]--;
            }
        }

        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }
}
