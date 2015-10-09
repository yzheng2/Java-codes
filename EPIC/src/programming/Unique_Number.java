package programming;

import java.util.ArrayList;
import java.util.List;

public class Unique_Number {
	
	public static void main(String[] args){
		int[]num = {1,1,1,2,3,4,4,5,5,5,6,7};
		List<Integer> l = uniquenum(num);
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
	}
	
	public static List<Integer> uniquenum(int[] num){
		List<Integer> l = new ArrayList<Integer>();
		if(num.length==0) return l;
		int f = num[0];
		l.add(num[0]);
		for(int i=1;i<num.length;i++){
			if(num[i]!=f){
				l.add(num[i]);
				f=num[i];
			}
		}
		return l;
	}

}
