public class reversearray {
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14};
        int start = 0, end = numbers.length-1;
        while(start< end){
            int c = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = c;

            start++;
            end--;
        }

        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
