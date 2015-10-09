package programming;

import java.util.ArrayList;
import java.util.List;

public class Additive_Number {
	public static void main(String[] args){
		int start = 112, end = 12122436;
		List<Integer> l = new ArrayList<Integer>();
		l = additive(start,end);
		for(int i = 0;i<l.size();i++){
			System.out.println(l.get(i));
		}
	}
	
	public static List<Integer> additive(int start,int end){
		List<Integer> l = new ArrayList<Integer>();
		for(int i=start;i<=end;i++){
			String s = String.valueOf(i);
			if(valid(s)) l.add(i);
		}
		return l;
	}
    private static boolean valid(String s){
    	int st = 0;
    	for(int i=1;i<s.length();i++){
    		if(2*i-st<=s.length()&&(i-st)<=s.length()+st-2*i&&s.substring(st, i).equals(s.substring(i,2*i-st))){
    			if(validtemp(s.substring(st,i),s.substring(i, 2*i-st),s,2*i-st)){
    				return true;
    			}
    		}
    	}
    	return false;
    }
    private static boolean validtemp(String s1,String s2,String s,int index){
    	if(s1.length()>s.length()-index||s2.length()>s.length()-index) return false;
    	for(int i=1;i<=s.length()-index;i++){
    		int a = Integer.parseInt(s1);int b = Integer.parseInt(s2);
    		if(String.valueOf(a+b).equals(s.substring(index,index+i))){
    			if(index+i==s.length()) return true;
    			return validtemp(s2,s.substring(index, index+i),s,index+i);
    		}
    	}
    	return false;
    }
	
}
