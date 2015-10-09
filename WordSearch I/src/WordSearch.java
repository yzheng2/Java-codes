
public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String[][] b = {{"aa"},{"bb"}};
		char[][] board = new char[100][100];
		for(int i = 0; i<b.length; i++){
			for(int j = 0; j<b[0].length; j++){
				board[i]= b[i][j].toCharArray();
		}
		}
		String word = "bb";
		boolean sol = s.exist(board, word);
		System.out.println(sol);
	}

}


