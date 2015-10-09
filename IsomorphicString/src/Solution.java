import java.util.*;
public class Solution {
	public boolean isIsomorphic(String s, String t){
		HashMap<Character,Integer> h1 = new HashMap<>();
		HashMap<Character,Integer> h2 = new HashMap<>();
		ArrayList<Integer> a1 = new ArrayList<>();
		ArrayList<Integer> a2 = new ArrayList<>();
		int len = s.length();		
		
		for(int i = 0; i < len; i++){
			if(!h1.containsKey(s.charAt(i))){
				h1.put(s.charAt(i), i);
			}else if(h1.containsKey(s.charAt(i))){
				a1.add(h1.get(s.charAt(i)));
				a1.add(i);
			}
		}
		for(int i = 0; i < len; i++){
			if(!h2.containsKey(t.charAt(i))){
				h2.put(t.charAt(i), i);
			}else if(h2.containsKey(t.charAt(i))){
				a2.add(h2.get(t.charAt(i)));
				a2.add(i);
			}
		}
		
		if(a1.equals(a2)){
			return true;
		}
		
		return false;
	}
}
