package Arrays;

public class ProductofArrayExceptSelf {
    // Time: O(N) --- Space: O(1)
    public static int[] productExceptSelfOPTIMAL(int[] nums) {
        int N = nums.length;

        int[] answer = new int[N];

        answer[0] = 1;
        for (int i = 1; i < N; i++) {
            answer[i] = nums[i - 1] * answer[i - 1];
        }

        int R = 1;
        for (int i = N - 1; i >= 0; i--) {
            answer[i] *= R;
            R *= answer[i];
        }

        return answer;
    }

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
