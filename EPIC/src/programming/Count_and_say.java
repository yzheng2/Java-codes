package programming;

import java.util.ArrayList;
import java.util.List;

public class Count_and_say {
	public static void main(String[] args){
		Count_and_say x = new Count_and_say();
		int n = 10;
		List<String> l = x.countandsay(n);
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
	}
	
	public List<String> countandsay(int n){
		List<String> l = new ArrayList<String>();
		if(n<=0) return l;
		int i=1;
		l.add("1");
		if(n==1) return l;
		while(i<10){
			StringBuilder s = new StringBuilder();
			String tem = l.get(l.size()-1);
			int count = 1;
			if(tem.length()==1){
				s.append(count).append(tem.charAt(0));
				l.add(s.toString());
			}
			else{
			for(int j=1;j<tem.length();j++){
				if(tem.charAt(j)==tem.charAt(j-1)){
					count++;
				}
				else if(tem.charAt(j)!=tem.charAt(j-1)){
					s.append(count).append(tem.charAt(j-1));
					count=1;
				}
			}
			s.append(count).append(tem.charAt(tem.length()-1));
			l.add(s.toString());
			}
			i++;
		}
		return l;
	}
}
