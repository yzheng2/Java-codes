package programming;

import java.util.ArrayList;
import java.util.List;

public class Continuous_Alphabets {
	public static void main(String[] args){
		Solution x = new Solution();
		String s = "abcDeHijKmnOPqacd";
		List<String> l = new ArrayList<String>();
		l = x.conalp(s);
		for(int i=0;i<l.size();i++){
			System.out.print(l.get(i)+" ");
		}
	}

	public static class Solution{
		public List<String> conalp(String s){
			int dif = 'A'-'a';	
			List<String> l = new ArrayList<String>();
			if(s.length()==0) return l;
			if(s.length()==1) {
				l.add(s);
				return l;
			}
			int start  = 0;
			for(int i=1;i<s.length();i++){
				if(s.charAt(i)-s.charAt(i-1)!=1&&s.charAt(i)+dif-s.charAt(i-1)!=1&&s.charAt(i)-dif-s.charAt(i-1)!=1) {
					l.add(s.substring(start,i));
					start=i;
				}			
			}
			l.add(s.substring(start,s.length()));
			return l;
		}
	}
}
