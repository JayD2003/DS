import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14};
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();
        for(int i=0; i < numbers.length; i++){
            if(search == numbers[i]){
                System.out.println("element found at"+" "+i);
            }
        }
    }
}
