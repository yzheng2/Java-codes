package programming;

import java.util.ArrayList;
import java.util.List;

public class Separate_the_number {
	
	public static void main(String[] args){
		Solution x = new Solution();
		String s = "1111223";
		List<String> l = new ArrayList<String>();
		l = x.seperatenum(s);
		for(int i=0;i<l.size();i++){
			System.out.print(l.get(i)+" ");
		}
	}
	
	public static class Solution{
		public List<String> seperatenum(String s){
			List<String> l = new ArrayList<String>();
			if(s.length()==1){
				l.add(s);
				return l;
			}
			if(s.length()==0){
				return l;
			}			
			int start = 0;
			int end = 1;
			int i=1;
			while(i<s.length()){
				if(s.charAt(i)-s.charAt(i-1)==1){
					end++;
				}else if(s.charAt(i)-s.charAt(i-1)!=1){
					l.add(s.substring(start,end));
					start = end;
					end = start+1;					
				}
				i++;
			}
			l.add(s.substring(start,end));
			return l;
			
		}
	}

}
