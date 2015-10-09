
public class Solution {
    public boolean exist(char[][] board, String word) {
        if(board.length < 0 || board[0].length < 0 || board == null){
        	return false;
        }
        
        if(word.length() == 0){
        	return true;
        }
        for(int i = 0; i<=board.length-word.length(); i++){
        	for(int j = 0; j <= board[0].length - word.length(); j++){
        		boolean res = VecHelper(word, board, i, j, 0) || HorHelper(word, board, i, j, 0);
        		if(res){
        			return true;
        		}
        	}
        }
        return false;
    }
    
    public boolean VecHelper(String word, char[][] board, int i, int j, int index){
    	if(index == word.length()){
    		return true;
    	}
    	
    	if(board[i][j] != word.charAt(index) || i < 0 || i > board.length || j < 0 || j > board[0].length){
    		return false;
    	}
    	
    	boolean res = VecHelper(word, board, i+1, j, index+1);
    	return res;
    }
    
    public boolean HorHelper(String word, char[][] board, int i, int j, int index){
    	if(index == word.length()){
    		return true;
    	}
    	
    	if(board[i][j] != word.charAt(index) || i < 0 || i > board.length || j < 0 || j > board[0].length){
    		return false;
    	}
    	
    	boolean res = VecHelper(word, board, i, j+1, index+1);
    	return res;
    }
}
