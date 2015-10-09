package programming;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {

	public class solution{
		List<Integer> l = new ArrayList<Integer>();
		public List<Integer> spiralOrder(int[][] matrix) {
			if(matrix.length==0) return l;
			int b = matrix[0].length-1;
	        helper(0,b,matrix,b+1);
	        return l;
	    }
		
		private void helper(int a,int b,int[][]matrix,int n){
			if(n<=0) return;
			if(n==1){
				l.add(matrix[a][b]);
				return;
			}
			for(int i=0;i<n;i++){
				l.add(matrix[a][b-i]);
			}
			for(int i=1;i<n;i++){
				l.add(matrix[a+i][b-n+1]);
			}
			for(int i=1;i<n;i++){
				l.add(matrix[a+n-1][b-n+1+i]);
			}
			for(int i=1;i<n-1;i++){
				l.add(matrix[a+n-1-i][b]);
			}
			helper(a+1,b-1,matrix,n-2);
			return;
		}
	}
}
