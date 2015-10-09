package programming;

import java.util.ArrayList;
import java.util.List;

//6,9,20
public class Three_baskets {
	public static void main(String[] args){
		Solution x = new Solution();
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		int n = 1080;
		l = x.combination(n);
		for(int i=0;i<l.size();i++){
			for(int j=0;j<l.get(i).size();j++){
			System.out.print(l.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
	public static class Solution{
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		List<Integer> row = new ArrayList<Integer>();
		public List<List<Integer>> combination(int n){
			helper(n,20);
			return l;
		}
		private void helper(int dif,int now){
			int i=0;
			while(now*i<=dif){
				if(now==6&&dif==0){
					row.add(i);
					l.add(new ArrayList<Integer>(row));
					row.remove(row.size()-1);
					return;
				}else{
					row.add(i);
					if(now==20) helper(dif-now*i,9);
					else if(now==9) helper(dif-now*i,6);
					row.remove(row.size()-1);
				}
				i++;
			}
			return;
		}
	}

}
