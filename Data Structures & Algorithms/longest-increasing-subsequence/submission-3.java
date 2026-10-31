class Solution {
    public int lengthOfLIS(int[] arr1) {
        int maxLength = 0;
        if(arr1.length<=1) return 1;

        int dp[] = new int[arr1.length];
        for(int i=0;i<arr1.length;i++) {
            dp[i] = 1;
            for(int j=0;j<i;j++) {
                if(arr1[j]<arr1[i]) {
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
                maxLength = Math.max(dp[i],maxLength);
            }
        }

        return maxLength;
    }
}
