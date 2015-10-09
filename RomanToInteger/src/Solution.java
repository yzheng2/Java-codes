import java.util.*;

public class Solution {
	public int romanToInt(String s){
		HashMap<Character, Integer> h = new HashMap<>();
		h.put('I', 1);
		h.put('V', 5);
		h.put('X', 10);
		h.put('L', 50);
		h.put('C', 100);
		h.put('D', 500);
		h.put('M', 1000);
		
		char[] ss = s.toCharArray();
		int len = ss.length;
		
		if(len == 1){
			return h.get(ss[0]);
		}
		
		if(len == 0){
			return 0;
		}
		
		int sum = h.get(ss[len-1]);
		for(int i = len - 2; i >= 0; i--){
			if(h.get(ss[i])<h.get(ss[i+1])){
				sum = sum - h.get(ss[i]);
			}else{
				sum = sum + h.get(ss[i]);
			}
		}
		return sum;
	}
}
