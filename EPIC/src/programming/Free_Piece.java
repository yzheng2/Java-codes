package programming;

public class Free_Piece {
	
	public static void main(String[] args){
		Solution x = new Solution();
		int[][] board={{1,0,0,2,1},
		               {2,0,0,2,1},
		               {2,1,1,2,1},
		               {2,0,2,1,1}};
		int[][] b ={{1}};
		int [] r  =x.bestpos(board);
		System.out.print(r[0]+" "+r[1]);
	}
	
	public static class Solution{
		int max = 0;
		int[] pos = new int[2];
		int count=0;
		public int[] bestpos(int[][] board){
			if(board.length==0) return null;
			for(int i=0;i<board.length;i++){
				for(int j=0;j<board[0].length;j++){
					if(board[i][j]==0){
						count++;
						int temp=max;
						helper(board,i,j,0);
						if(max>temp){
							pos[0]=i;pos[1]=j;
						}
					}
				}				
			}
			if(count==0) return null;
			return pos;
		}
		private void helper(int[][] board,int i,int j,int lennow){
			if(lennow>max){
				max = lennow;			
			}
			if(i-1>=0&&board[i-1][j]==2) {
				board[i-1][j]=1;
				helper(board,i-1,j,lennow+1);
				board[i-1][j]=2;
			}
			if(i+1<board.length&&board[i+1][j]==2){
				board[i+1][j]=1;
				helper(board,i+1,j,lennow+1);
				board[i+1][j]=2;
			}
			if(j-1>=0&&board[i][j-1]==2){
				board[i][j-1]=1;
				helper(board,i,j-1,lennow+1);
				board[i][j-1]=2;
			}
			if(j+1<board[0].length&&board[i][j+1]==2){
				board[i][j+1]=1;
				helper(board,i,j+1,lennow+1);
				board[i][j+1]=2;
			}
			return;
		}
	
	}

}
