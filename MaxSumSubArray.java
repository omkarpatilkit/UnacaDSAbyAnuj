public class MaxSumSubArray {

    public static void maxSumSubArray(int a[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            currSum += a[i];
            if (maxSum < currSum)
                maxSum = currSum;
            if (currSum < 0)
                currSum = 0;
        }

        System.out.println(maxSum);

    }

    public static void main(String[] args) {

        int a[] = { 6, -7, 4, -2, 1, 5, -4 };
        maxSumSubArray(a);

    }

}
