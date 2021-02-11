package week1Arrays;

import java.util.HashSet;

public class ProductofArrayExceptSelf {
    // Time: O(N) --- Space: O(N)
    public static int[] productExceptSelf(int[] nums) {
        int N = nums.length;

        int[] L = new int[N];
        int[] R = new int[N];

        int[] answer = new int[N];


        L[0] = 1;
        for (int i = 1; i < N; i++) {
            L[i] = nums[i - 1] * L[i - 1];
        }

        R[N - 1] = 1;
        for (int i = N - 2; i >= 0; i--) {
            R[i] = nums[i + 1] * R[i + 1];
        }

        for (int i = 0; i < N; i++) {
            answer[i] = L[i] * R[i];
        }

        return answer;
    }
}
