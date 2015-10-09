package programming;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci_Number {
	public static void main(String[] args){
		Solution x = new Solution();
		List<Integer> r = x.fib(1,100);
		for(int i=0;i<r.size();i++){
			System.out.println(r.get(i));
		}
	}
	
	public static class Solution{
		public List<Integer> fib(int start,int end){
			List<Integer> r = new ArrayList<Integer>();			 
			int a =1,b=2;
			if(a>=start&&a<=end) r.add(a);
			if(b>=start&&b<=end) r.add(b);
			while(a+b<=end){
				int c= a+b;
				if(c>=start) r.add(c);
				a=b;
				b=c;
			}
			return r;
		}
	}

}
