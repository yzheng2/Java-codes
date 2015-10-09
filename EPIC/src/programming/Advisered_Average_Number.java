package programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Advisered_Average_Number {
	public static void main(String[] args){
		List<Integer> l = new ArrayList<Integer>();
		l.add(3);l.add(6);l.add(12);l.add(55);l.add(289);l.add(600);l.add(534);l.add(900);l.add(172);
		System.out.print(avg(l));
	}
	
	public static int avg(List<Integer> l){
		List<Integer> r = new ArrayList<Integer>();
		r=l;
		if(r.size()<=3) return 0;
		int[] la = new int[3];
		la[0] = r.get(0);la[1] = r.get(1);la[2] = r.get(2);
		Arrays.sort(la);
		int sum = 0;
		for(int i=3;i<r.size();i++){
			if(r.get(i)<=la[0]){
				sum+=r.get(i);
			}else if(r.get(i)>la[0]&&r.get(i)<=la[1]){
				sum+=la[0];
				la[0]=r.get(i);
			}else if(r.get(i)>la[1]&&r.get(i)<=la[2]){
				sum+=la[0];
				la[0]=la[1];
				la[1]=r.get(i);
			}else if(r.get(i)>la[2]){
				sum+=la[0];
				la[0]=la[1];la[1]=la[2];la[2]=r.get(i);
			}
		}
		int avg = sum/(r.size()-3);
		return avg;
	}

}
