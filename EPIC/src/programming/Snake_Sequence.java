package programming;

import java.util.ArrayList;
import java.util.List;

public class Snake_Sequence {
	public static void main(String[] args){
		int[][]num = {{1, 3, 2, 6, 8}, 
				     {-9, 7, 1, -1, 2}, 
				      {1, 5, 0, 1, 9}}; 
		Solution x = new Solution();
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		l=x.snake(num);
		for(int i=0;i<l.size();i++){
			for(int j=0;j<l.get(i).size();j++){
				System.out.print(l.get(i).get(j));
			}
			System.out.println();
		}
		System.out.println(l.get(0).size());

	}

	
	public static class Solution{
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		List<Integer> row = new ArrayList<Integer>();
		int max= 0;
		public List<List<Integer>> snake(int[][] num){
			if(num.length==0) return l;
			boolean[][] isused = new boolean[num.length][num[0].length];
			for(int i=0;i<isused.length;i++){
				for(int j=0;j<isused[0].length;j++){
					isused[i][j]=false;
				}
			}
			for(int i=0;i<num.length;i++){
				for(int j=0;j<num[0].length;j++){
					helper(num,isused,i,j,1);
				}
			}
			return l;
			
		}
		private void helper(int[][] num,boolean[][] isused,int i,int j,int maxtem){
			if(i<0||i>=num.length||j<0||j>num[0].length||isused[i][j]==true) return;
			row.add(num[i][j]);
			isused[i][j]=true;
			if(i+1<num.length&&Math.abs(num[i+1][j]-num[i][j])==1){
				helper(num,isused,i+1,j,maxtem+1);
			}
			if(j+1<num[0].length&&Math.abs(num[i][j+1]-num[i][j])==1){
				helper(num,isused,i,j+1,maxtem+1);
			}else {
				if(maxtem==max){
					l.add(new ArrayList<Integer>(row));}
				else if(maxtem>max){
					max=maxtem;
					l.clear();
					l.add(new ArrayList<Integer>(row));
					}
				}
			row.remove(row.size()-1);
			isused[i][j]=false;
			return;
			}
		}
		}
	
		

