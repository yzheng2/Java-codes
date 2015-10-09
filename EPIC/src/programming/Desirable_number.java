package programming;

import java.util.ArrayList;
import java.util.List;


public class Desirable_number {
	public static void main(String[] args){
		solution x = new solution();
		List<Integer> r = new ArrayList<Integer>();
		int n = 5;
		r=x.desirablenum(n);
		for(int i=0;i<r.size();i++){
			System.out.println(r.get(i));
		}
		
	}
	
	public static class solution{
		List<Integer> l = new ArrayList<Integer>();
		int row=0;
		public List<Integer> desirablenum(int n){
			helper(n,1);
			return l;
			
		}
		
		private void helper(int n,int from){
			if(n==0){
				l.add(new Integer(row));
				return;
			}
			else{
				for(int i=from;i<=9;i++){
				//	if(i+n<=10&&i>row%10){
					row=row*10+i;
					helper(n-1,i+1);
					row=row/10;
				//	}
				}
			}
			return;
		}
	}
}
