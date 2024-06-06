public class maxsubarraysum {

    public static void sum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += numbers[k];
                }
                maxSum = maxSum < currSum ? currSum : maxSum;
            }
        }
        System.out.println(maxSum);
    }

    public static void prefixSum(int[] numbers) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int[] prefixArr = new int[numbers.length];
        prefixArr[0] = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            prefixArr[i] = prefixArr[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                currSum = i == 0 ? prefixArr[j] : prefixArr[j] - prefixArr[i - 1];
                maxSum = maxSum < currSum ? currSum : maxSum;
            }
        }
        System.out.println(maxSum);

    }

    public static void kadaneAlgo(int[] numbers) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0, end = 0, x = 0;
        for (int i = 0; i < numbers.length; i++) {
            currSum += numbers[i];
            if (currSum < 0) {
                maxSum = maxSum < currSum ? currSum : maxSum;
                currSum = 0;
                x = i + 1;
            } else {
                maxSum = maxSum < currSum ? currSum : maxSum;
                start = x;
                end = i;
            }
        }
        System.out.println(maxSum+" "+start+" "+end);
    }
    public static void main(String[] args) {
        int[] numbers = { -2, -3, 4, -1, -2, 1, 5, -3 };
        sum(numbers);
        prefixSum(numbers);
        int[] num = new int[]{ -2, -3, 4, -1, -2, 1, 5, -3 };
        kadaneAlgo(num);
    }
}
