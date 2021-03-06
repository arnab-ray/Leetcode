package dynamicprogramming.medium;

public class LIS {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0)
            return 0;

        int[] lis = new int[nums.length];

        for(int i = 0; i < nums.length; i++)
            lis[i] = 1;

        for(int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;
            }
        }

        int length = Integer.MIN_VALUE;
        for(int i = 0; i < lis.length; i++) {
            if(lis[i] > length) {
                length = lis[i];
            }
        }

        return length;
    }
}
