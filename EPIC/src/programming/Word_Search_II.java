package programming;

public class Word_Search_II {
	public static void main(String[] args){
		Solution x = new Solution();
		char[][] dict= {{'a','b','d','e','f'},
				        {'d','t','y','h','s'},
				        {'d','t','c','b','j'},
				        {'z','x','i','p','o'},
				        {'m','n','u','r','e'}};
		String s = "bybo";
		System.out.print(x.existed(dict, s));
	}

	public static class Solution{
		public boolean existed(char[][] dict,String s){
			for(int i=0;i<dict.length;i++){
				for(int j=0;j<dict[0].length;j++){
					if(dict[i][j]==s.charAt(0)){
						if(left(dict,s,i,j)||right(dict,s,i,j)||up(dict,s,i,j)||down(dict,s,i,j)||leftup(dict,s,i,j)||leftdown(dict,s,i,j)||rightup(dict,s,i,j)||rightdown(dict,s,i,j))
							return true;
					}
				}
			}
			return false;
		}
		private boolean left(char[][] dict,String s,int i,int j){
			if(s.length()>j+1) return false;
			int index = 0;
			while(index<s.length()&&j>=0){
				if(dict[i][j]!=s.charAt(index)) return false;
				if(index==s.length()-1) return true;
				j--;
				if(j<0) return false;
				index++;				
			}
			return false;
		}
		private boolean right(char[][] dict,String s,int i,int j){
			if(s.length()+j>dict[0].length) return false;
			int index = 0;
			while(index<s.length()&&j<dict[0].length){
				if(dict[i][j]!=s.charAt(index)) return false;
				if(index==s.length()-1) return true;
				j++;
				if(j==dict[0].length) return false;
				index++;				
			}
			return false;
		}
		private boolean up(char[][] dict,String s,int i,int j){
			if(s.length()>i+1) return false;
			int index = 0;
			while(index<s.length()&&i>=0){
				if(dict[i][j]!=s.charAt(index)) return false;
				if(index==s.length()-1) return true;
				i--;
				if(i<0) return false;
				index++;				
			}
			return false;
		}
		private boolean down(char[][] dict,String s,int i,int j){
			if(s.length()+i>dict.length) return false;
			int index = 0;
			while(index<s.length()&&i<dict.length){
				if(dict[i][j]!=s.charAt(index)) return false;
				if(index==s.length()-1) return true;
				i++;
				if(i==dict.length) return false;
				index++;				
			}
			return false;
		}
		private boolean leftup(char[][] dict,String s,int i,int j){
			if(s.length()>i+1||s.length()>j+1) return false;
			int index = 0;
			while(index<s.length()&&j>=0&&i>=0){
				if(dict[i][j]!=s.charAt(index)) return false;
				if(index==s.length()-1) return true;
				j--;i--;
				if(j<0||i<0) return false;
				index++;				
			}
			return false;
		}
		private boolean leftdown(char[][] dict,String s,int i,int j){
			if(s.length()>j+1||s.length()+i>dict.length) return false;
			int index = 0;
			while(index<s.length()&&j>=0&&i<dict.length){
				if(dict[i][j]!=s.charAt(index)) return false;
				if(index==s.length()-1) return true;
				j--;i++;
				if(j<0||i==dict.length) return false;
				index++;				
			}
			return false;
		}
		private boolean rightup(char[][] dict,String s,int i,int j){
			if(s.length()+j>dict[0].length||s.length()>i+1) return false;
			int index = 0;
			while(index<s.length()&&j<dict[0].length&&i>=0){
				if(dict[i][j]!=s.charAt(index)) return false;
				if(index==s.length()-1) return true;
				j++;i--;
				if(i<0||j==dict[0].length) return false;
				index++;				
			}
			return false;
		}
		private boolean rightdown(char[][] dict,String s,int i,int j){
			if(s.length()+i>dict.length||s.length()+j>dict[0].length) return false;
			int index = 0;
			while(index<s.length()&&j<dict[0].length&&i<dict.length){
				if(dict[i][j]!=s.charAt(index)) return false;
				if(index==s.length()-1) return true;
				j++;i++;
				if(i==dict.length||j==dict[0].length) return false;
				index++;				
			}
			return false;
		}
	}
}
