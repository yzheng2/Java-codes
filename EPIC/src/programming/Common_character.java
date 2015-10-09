package programming;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Common_character {
	public static void main(String[] args){
		String s ="aaabbcdddddddi";
		System.out.print(switchcc(s));
	}

	public static String switchcc(String s){
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		int maxnum=1,minnum=s.length();
		char maxchar = s.charAt(0),minchar=s.charAt(0);
		for(int i=0;i<s.length();i++){
			if(!map.containsKey(s.charAt(i))){
			map.put(s.charAt(i), 1);	
			}else {
				int temp = map.get(s.charAt(i))+1;
				map.put(s.charAt(i), temp);
				}
			}
		Set<Character> set = map.keySet();
		Iterator<Character> it = set.iterator();
		while(it.hasNext()){
			char c = it.next();
			int temp = map.get(c);
			if(temp<minnum) {
				minnum = temp; minchar = c;
			}
			if(temp>maxnum){
				maxnum = temp; maxchar = c;
			}
		}
		char [] res = s.toCharArray();
		for(int i=0;i<s.length();i++){
			if(res[i]==maxchar) res[i]=minchar;
			else if(res[i]==minchar) res[i]=maxchar;
		}
		return new String(res);
		}
	}
