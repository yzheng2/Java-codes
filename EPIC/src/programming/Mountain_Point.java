package programming;

import java.util.ArrayList;
import java.util.List;


public class Mountain_Point {
	public static void main(String[] args){
		int[][]num = {{1, 3, 2, 6, 8}, 
				     {-9, 7, 1, -1, 2}, 
				      {1, 5, 0, 1, 9}}; 
		Solution x = new Solution();
		List<Integer> l = new ArrayList<Integer>();
		l=x.mountain(num);
		for(int i=0;i<l.size();i++){			
				System.out.print(l.get(i));
			
		}

	}

	public static class Solution {
		public List<Integer> mountain(int[][] num){
			List<Integer> l = new ArrayList<Integer>();
			if(num.length<3||num[0].length<3) return l;
			for(int i=1;i<num.length-1;i++){
				for(int j=1;j<num[0].length-1;j++){
					if(num[i][j]>num[i-1][j]&&num[i][j]>num[i+1][j]&&num[i][j]>num[i][j-1]&&num[i][j]>num[i][j+1]&&num[i][j]>num[i-1][j-1]&&num[i][j]>num[i-1][j+1]&&num[i][j]>num[i+1][j-1]&&num[i][j]>num[i+1][j+1]){
						l.add(num[i][j]);
					}
				}
			}
			return l;
		}
	}

}
