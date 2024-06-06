public class buyandsellstock {

    public static void myintution(int[] stocks){
        int bp = stocks[0];
        int sp = 0;
        int pr = 0;
        int start = 0, end = 0;
        for(int i=1;i<stocks.length;i++){
            if(i==1){
                sp = stocks[i];
                pr = sp - bp;
                if(pr < 0){
                    bp = sp;
                    start = i;
                }
                System.out.println(bp+" "+sp+" "+pr+" "+ start);
            }else{
                sp = stocks[i];
                int c = sp - bp;
                System.out.println(bp+" "+sp+" "+c);
                if(pr < c){
                    pr = c; 
                    end = i;
                }else{
                    bp = Math.min(bp,sp);
                    start = Math.min(start,i);
                }
            }
        }
        System.out.println(pr+" "+ start+" "+ end);
    }

    public static void buyandsell(int[] stocks){
        int MaxProfit = 0;
        int BuyPrice = Integer.MAX_VALUE;

        for(int i=0;i<stocks.length;i++){
            if(BuyPrice<stocks[i]){
                int c =stocks[i] - BuyPrice;
                MaxProfit = Math.max(MaxProfit, c);
            }else{
                BuyPrice = stocks[i];
            }
        }
        System.out.println(MaxProfit);
    }
    public static void main(String[] args) {
        int stocks[] = {7,1,5,3,6,4};
        myintution(stocks);
        buyandsell(stocks);
    }   
}
