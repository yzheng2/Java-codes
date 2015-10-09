package programming;

import java.util.HashSet;

public class Colorful_number {
	public static void main(String[] args){
		int num = 12536;
		System.out.print(iscolorful(num));
		
	}

	public static boolean iscolorful(int num){
		HashSet<Integer> st = new HashSet<Integer>();
		String s = String.valueOf(num);
		int len = s.length();
		if(len==1) return true;
		for(int i=1;i<len;i++){
			for(int j=0;j<len;j++){
				if(i+j<=len){
				String temp = s.substring(j, j+i);
				int pro = helper(temp);
				if(st.contains(pro)) return false;
				else{
					st.add(pro);
				}
				}
			}
		}
		return true;
		
	}
	private static int helper(String s){
		int r = 1;
		for(int i=0;i<s.length();i++){
			r*=s.charAt(i)-'0';
		}
		return r;
	}
}
