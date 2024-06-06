import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14};
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();
        int start = 0, end = numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(numbers[mid] > search){
                end = mid-1;
            }else if(numbers[mid] < search){
                start = mid+1;
            }else{
                System.out.println("element found at"+" "+mid);
                break;
            }
        }
    }
}
