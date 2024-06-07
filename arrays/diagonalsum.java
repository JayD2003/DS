public class diagonalsum {
    public static void main(String[] args) {
        int[][] numbers = {
            {1,2,3},
            {5,6,7},
            {9,10,11},
        };
        int s=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[0].length;j++){
                if(i==j){
                    s+=numbers[i][j];
                    System.out.print(numbers[i][j]+" ");
                }else if(i+j == numbers.length-1 && i!=j){
                    s+=numbers[i][j];
                    System.out.print(numbers[i][j]+" ");
                }
            }
        }
        System.out.println();
        System.out.println("Sum is "+s);
    }
}
