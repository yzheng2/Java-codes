package programming;

import java.util.ArrayList;
import java.util.List;

public class Anagram {
	public static void main(String[] args){
		Solution x = new Solution();
		String s = "AbeH;()s";
		List <String> l = new ArrayList<String>();
		l = x.anagram(s);
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
	}

	public static class Solution{
		List <String> l = new ArrayList<String>();
		boolean[] isused;
		public List<String> anagram(String s){
			for(int i=0;i<s.length();i++){
				if(Character.isDigit(s.charAt(i))) {
					l.add("Not valid");
					return l;
				}
			}
		     isused= new boolean[s.length()];
		     String r = "";
		     helper(s,r,0,isused);
		     return l;
		}
		private void helper(String s,String r,int i,boolean[] isused){
			if(i==s.length()){
				l.add(new String(r));
				return;
			}
			if(s.charAt(i)-'a'<0||s.charAt(i)-'z'>0&&isused[i]!=true){
				r+=s.charAt(i);
				isused[i]=true;
				helper(s,r,i+1,isused);
				isused[i]=false;
				r=r.substring(0,r.length()-1);
			}
			else {
				for(int j=0;j<s.length();j++){
					if(s.charAt(j)-'a'>=0&&s.charAt(j)-'z'<=0&&isused[j]!=true){
						isused[j]=true;
						r+=s.charAt(j);
						helper(s,r,i+1,isused);
						isused[j]=false;
						r=r.substring(0, r.length()-1);
					}
				}
			}
			return;
		}
	}
}
