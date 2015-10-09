import java.util.*;
public class Helper {
	public char[] help(String s){
		char[] c = s.toCharArray();
		ArrayList<Character> a = new ArrayList<>();
		for(int i = 0; i < s.length(); i++){
			if(c[i]-'A'>26 && Character.isAlphabetic(c[i])){
				a.add(c[i]);
				c[i] = (char) (c[i]-32);
			}
		}
		Arrays.sort(c);
		for(int j = 0; j<s.length(); j++){
			System.out.print(a);
			System.out.print((char)(c[j]+32));
			if(a.contains((char)(c[j]+32))){
				c[j] = (char)(c[j]+32);
			}
		}
		return c;
	}
}
