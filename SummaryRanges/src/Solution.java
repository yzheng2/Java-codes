import java.util.*;

public class Solution {
	public List<String> summaryRanges(int[] nums){
		ArrayList<String> a = new ArrayList<>();
		
		int len = nums.length;
		
		if(len == 0){
			return a;
		}
				
		int fir = nums[0]; 
		int tai = fir;
		
		if(len == 1){
			a.add(Integer.toString(fir));
			return a;
		}
		
		String res;		
		int[] nums2 = new int[len+1];
		
		for(int j = 0; j < len; j++){
			nums2[j] = nums[j];
			if(j == len-1){
				nums2[j+1] = 0;
			}
		}
		
		for(int i = 0; i < len ; i++){			
			if(nums2[i] == nums2[i+1] || nums2[i] + 1 == nums2[i+1] && i != (len-1)){
				tai = nums2[i+1];
			}else if(tai == fir){
				res = Integer.toString(tai);
				a.add(res);
				fir = nums2[i+1];
				tai = fir;
			}else{
				res = Integer.toString(fir) + "->" + Integer.toString(tai);
				a.add(res);
				fir = nums2[i+1];
				tai = fir;
			}	
		}
		return a;
	}
}
