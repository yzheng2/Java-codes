import java.util.*;
import java.io.*;
public class Helper {
	public String helper(String s){
		char[] a = s.toCharArray();
		HashSet<Character> h = new HashSet<>();
		for(int i = 0; i < a.length; i++){
			if(!h.add(a[i])){
				continue;
			}
		}
		StringBuffer ss = new StringBuffer();
		Iterator<Character> it = h.iterator();
		while(it.hasNext()){
			ss.append(it.next());
		}
		System.out.println(ss);
		return "aa";
	}
}