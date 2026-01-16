public class challenge2_balanced_scales {
    public static Boolean can_balance_scales(int[] arr){
        int total_sum = 0;
        int n = arr.length;
        for (int i = 0; i< n; i++){
            total_sum += arr[i];
        }

        if(total_sum % 2 == 1) return false;
        int target = total_sum / 2;

        boolean[][] dp = new boolean[n + 1][target + 1];

        for(int i = 0; i<=n; i++){
            dp[i][0] = true;
        }
        for(int i = 1; i<= n; i++){
            for(int t = 1; t<= target; t++){
                if(arr[i-1] <= t){
                    dp[i][t] = dp[i - 1][t] || dp[i - 1][t - arr[i - 1]];
                }
                else{
                    dp[i][t] = dp[i - 1][t];
                }
            }
        } return dp[n][target];
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 11, 5};
        int[] arr2 = {1, 3, 5};

        System.out.println(can_balance_scales(arr1));
        System.out.println(can_balance_scales(arr2));
    }
}
