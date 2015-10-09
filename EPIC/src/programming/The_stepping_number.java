package programming;

import java.util.ArrayList;
import java.util.List;


public class The_stepping_number {
	
	
	public static void main(String[] args){
		solution x = new solution();
		List<Integer> l = new ArrayList<Integer>();;
		l=x.steppingnum(5,1000);
		for(int i=0;i<l.size();i++){			
				System.out.println(l.get(i));			
		}
		
		
	}
	
	public static class solution{

		public List<Integer> steppingnum(int start,int end){
			List<Integer> l = new ArrayList<Integer>();
			for(int i=start;i<=end;i++){
				if(helper(i)) l.add(i);
			}
			return l;
			
		}
		private boolean helper(int number){
			int last = number%10;
			int temp=number/10;
			while(temp>0){
				if(Math.abs(temp%10-last)!=1) return false;
				else{
					last=temp%10;
					temp=temp/10;
				}
			}
			return true;
		}

}
}
