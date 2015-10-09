package programming;
//1 red, 0 black
public class Tic_Tac_Toe {
	
	public static void main(String[] args){
		Solution x = new Solution();
		int[][] board = {{1,1,1,0,0},
				         {1,0,0,1,1},
				         {1,0,1,1,1},
				         {1,0,0,0,0}};
		System.out.println(x.ttt(board));
		System.out.println(x.scoreb);
		System.out.println(x.scorer);
	}

	public static class Solution{
		int scorer=0;
		int scoreb=0;
		public String ttt(int[][] board){
			for(int i=0;i<board.length;i++){
				for(int j=0;j<board[0].length;j++){
					horizon(i,j,board,0);
					vertical(i,j,board,0);
					diagon1(i,j,board,0);
					diagon2(i,j,board,0);
				}
			}
			if(scorer==scoreb) return "Draw";
			return (scorer>scoreb)?"Red":"Black";
			
		}
		private void horizon(int i,int j,int[][] board,int count){
			//if(board[0].length-1-j<count) return;
			if(count==2) {
				if(board[i][j]==0) scoreb++;
				if(board[i][j]==1) scorer++;
				return;
			}
			else if(j+1<board[0].length&&board[i][j]==board[i][j+1]){
				horizon(i,j+1,board,count+1);
			}
			return;
		}
		private void vertical(int i,int j,int[][] board,int count){
			//if(board.length-1-i<count) return;
			if(count==2) {
				if(board[i][j]==0) {
					scoreb++;return;
				}
				else if(board[i][j]==1){
					scorer=(i+1<board.length&&board[i+1][j]==1)?scorer+2:scorer+1;
					return;
				}				
			}
			else if(i+1<board.length&&board[i][j]==board[i+1][j]){
				vertical(i+1,j,board,count+1);
			}
			return;
		}
		private void diagon1(int i,int j,int[][] board,int count){
			//if(board.length-1-i<count||board[0].length-1-j<count) return;
			if(count==2) {
				if(board[i][j]==0) scoreb++;
				if(board[i][j]==1) scorer++;
				return;
			}
			else if(i+1<board.length&&j+1<board[0].length&&board[i][j]==board[i+1][j+1]){
				diagon1(i+1,j+1,board,count+1);
			}	
			return;
		}
		private void diagon2(int i,int j,int[][] board,int count){
			//if(board.length-1-i<count||board[0].length-1-j<count) return;
			if(count==2) {
				if(board[i][j]==0) scoreb++;
				if(board[i][j]==1) scorer++;
				return;
			}
			else if(i+1<board.length&&j-1>=0&&board[i][j]==board[i+1][j-1]){
				diagon2(i+1,j-1,board,count+1);
			}	
			return;
		}
	}
}
