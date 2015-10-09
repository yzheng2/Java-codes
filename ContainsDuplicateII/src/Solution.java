import java.util.*;
public class Solution {
	public boolean containsNearbyDuplicate(int[] nums, int k){
		int len = nums.length;
		HashMap<Integer, Integer> h = new HashMap<>();
		
		for(int i = 0; i < len; i++){
			if(!h.containsKey(nums[i])){
				h.put(nums[i], i);
				}else if(h.containsKey(nums[i]) && i - h.get(nums[i])>k){
				h.remove(nums[i]);
				h.put(nums[i], i);
				continue;
			}else if(h.containsKey(nums[i]) && i - h.get(nums[i])<=k){
				return true;
			}
		}
		return false;
	}
}