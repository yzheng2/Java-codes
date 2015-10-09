package programming;

import java.util.ArrayList;
import java.util.List;

public class Palindromes {
	public static void main(String[] args){
		List<String> l = new ArrayList<String>();
		String s = "abaaaacdilili";
		l = palindromes(s);
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
	}

	public static List<String> palindromes(String s){
		List<String> l = new ArrayList<String>();
		for(int i=0;i<s.length();i++){
			int count =1;
			for(int a=i-1,b=i+1;a>=0&&b<s.length()&&s.charAt(a)==s.charAt(b);a--,b++){
				count=count+2;
				if(count>=3&&!l.contains(s.substring(a, b+1))) l.add(s.substring(a,b+1)); 
			}
			count = 0;
			for(int a=i,b=i+1;a>=0&&b<s.length()&&s.charAt(a)==s.charAt(b);a--,b++){
				count=count+2;
				if(count>=3&&!l.contains(s.substring(a, b+1))) l.add(s.substring(a,b+1));
			}
		}
		return l;
	}
}
