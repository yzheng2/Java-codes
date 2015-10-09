import java.util.*;
public class Answer {
    public String FindLargest(int[] nums) {
    	int len = nums.length;
        Helper[] n = new Helper[len];
        if(len==0){
        	return "";
        }
        if(len==1){
        	return Integer.toString(nums[0]);
        }
        for(int i=0; i<nums.length; i++){
            n[i]=new Helper(nums[i]);
        }
        Arrays.sort(n);
        if(n[0].number.equals("0"))return "0";
        StringBuffer res = new StringBuffer();
        for(int i=0; i<n.length; i++){
            res.append(n[i].number);
        }
        return res.toString();
    }
}

