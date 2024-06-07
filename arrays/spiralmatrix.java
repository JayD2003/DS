public class spiralmatrix {
    public static void main(String[] args) {
        int[][] numbers = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        int startRow = 0;
        int startCol = 0;
        int endRow = numbers.length-1;
        int endCol = numbers[0].length-1;

        while(startCol<=endCol && startRow <= endRow){

            //top 
            for(int i=startCol;i<=endCol;i++){
                System.out.print(numbers[startRow][i]+" ");
            }

            //right
            startRow++;
            for(int i=startRow;i<=endRow;i++){
                System.out.print(numbers[i][endCol]+" ");
            }

            //bottom
            endCol--;
            for(int i = endCol;i>=startCol;i--){
                System.out.print(numbers[endRow][i]+" ");
            }

            //left
            endRow--;
            for(int i=endRow;i>=startRow;i--){
                System.out.print(numbers[i][startCol]+" ");
            }

            startCol++;
        }
    }   
}
