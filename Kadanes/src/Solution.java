
public class Solution {
	public int MaxSubArray(int[] nums){
		int len = nums.length;
		int max = Integer.MIN_VALUE;
		
		for(int n = 0; n < nums.length; n++){
			for(int i = 0; i<len; i++){
				int sum = 0;
				for(int j = i; j<len; j++){
					sum += nums[nums.length-1-Math.abs(n-j)];
					if(sum > max){
						max = sum;
					}
				}
			}
		}
		
		return max;
	}
}
