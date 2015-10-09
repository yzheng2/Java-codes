package programming;

import java.util.ArrayList;
import java.util.List;

public class Well_ordered_String {
	
	public static void main(String[] args){
		solution x = new solution();
		List<String> r = new ArrayList<String>();
		int length = 26;
		r = x.wellorderedstring(length);
		for(int i=0;i<r.size();i++){
			System.out.print(r.get(i));
		}
	}

	public static class solution{
		List<String> r = new ArrayList<String>();
		StringBuilder s =new StringBuilder();
		public List<String> wellorderedstring(int length){
			helper(length,'a');
		    return r;
			
		}
		private void helper(int length,char from){
			if(length==0){
				r.add(new String(s.toString()));
				return;
			}
			else{
			for(char i=from;i<='z';i++){
				s.append(i);
				helper(length-1,(char) (i+1));
				s.deleteCharAt(s.length()-1);
			}
			}
			return;
		}
	}
}
