package programming;
//empty 0
//player1 1 player2 2 
public class Jump_Chess {
	
	public static void main(String[] args){
		int[][]board = {{1,1,2,1,0},
				        {2,0,1,0,1},
				        {0,2,0,1,0},
				        {0,2,2,0,1},
				        {0,1,0,1,0}};
		Solution x = new Solution();
		int len = x.maxlength(board, 2, 1);
		System.out.print(len);
		
	}
	
	
	public static class Solution{
	int max = 1;
	public int maxlength(int[][] board,int a,int b){
		boolean[][] isused = new boolean[board[0].length][board.length];
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				isused[i][j]=false;
			}
		}
		if(board.length==0) return 0;
		if(board[a][b]==1) helper1(board,a,b,isused,1);
		if(board[a][b]==2) helper2(board,a,b,isused,1);
		if(board[a][b]==0) return 0;
		return max;
		
	}
	private void helper1(int[][] board,int i,int j,boolean[][] isused,int maxnow){
    	if(maxnow>max) max = maxnow;
		if(i-2>=0&&board[i-1][j]==2&&isused[i-1][j]==false&&board[i-2][j]==0){
			 isused[i-1][j]=true;
			 helper1(board,i-2,j,isused,maxnow+2);
			 isused[i-1][j]=false;
		}
		if(i+2<board[0].length&&board[i+1][j]==2&&isused[i+1][j]==false&&board[i+2][j]==0){
			 isused[i+1][j]=true;
			 helper1(board,i+2,j,isused,maxnow+2);
			 isused[i+1][j]=false;
		}
		if(j-2>=0&&board[i][j-1]==2&&isused[i][j-1]==false&&board[i][j-2]==0){
			 isused[i][j-1]=true;
			 helper1(board,i,j-2,isused,maxnow+2);
			 isused[i][j-1]=false;
		}
        if(j+2<board.length&&board[i][j+1]==2&&isused[i][j+1]==false&&board[i][j+2]==0){
			 isused[i][j+1]=true;
			 helper1(board,i,j+2,isused,maxnow+2);
			 isused[i][j+1]=false;
		}
        return;    	
}
    private void helper2(int[][] board,int i,int j,boolean[][] isused,int maxnow){
    	if(maxnow>max) max = maxnow;
		if(i-2>=0&&board[i-1][j]==1&&isused[i-1][j]==false&&board[i-2][j]==0){
			 isused[i-1][j]=true;
			 helper2(board,i-2,j,isused,maxnow+2);
			 isused[i-1][j]=false;
		}
		if(i+2<board[0].length&&board[i+1][j]==1&&isused[i+1][j]==false&&board[i+2][j]==0){
			 isused[i+1][j]=true;
			 helper2(board,i+2,j,isused,maxnow+2);
			 isused[i+1][j]=false;
		}
		if(j-2>=0&&board[i][j-1]==1&&isused[i][j-1]==false&&board[i][j-2]==0){
			 isused[i][j-1]=true;
			 helper2(board,i,j-2,isused,maxnow+2);
			 isused[i][j-1]=false;
		}
        if(j+2<board.length&&board[i][j+1]==1&&isused[i][j+1]==false&&board[i][j+2]==0){
			 isused[i][j+1]=true;
			 helper2(board,i,j+2,isused,maxnow+2);
			 isused[i][j+1]=false;
		}
        return;    	
}
	}
}
