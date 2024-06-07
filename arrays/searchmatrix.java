public class searchmatrix {
    public static void reverse(int[][] numbers){
        int key = 10;
        int row = numbers.length-1;
        int col = 0;


        boolean flag = true;
        while (row >= 0 && col < numbers[0].length) {
            System.out.println("passed "+"("+row+","+col+")");

            if(numbers[row][col] == key){
                flag = false;
                System.out.println("Found at "+"("+row+","+col+")");
                break;
            }
            else if(key < numbers[row][col]){
                row--;
            }else{
                col++;
            }

        }
        if(flag)
        System.out.println("Not found");
    }
    public static void main(String[] args) {
        int[][] numbers = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        reverse(numbers);
        int key = 13;
        int row = 0;
        int col = numbers[0].length-1;

        boolean flag = true;
        while (row< numbers.length && col >= 0) {
            if(numbers[row][col] == key){
                flag = false;
                System.out.println("Found at "+"("+row+","+col+")");
                break;
            }
            else if(key < numbers[row][col]){
                col--;
            }else{
                row++;
            }
        }
        if(flag)
        System.out.println("Not found");
    }
}
