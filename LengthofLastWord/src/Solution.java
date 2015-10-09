
public class Solution {
	public int lengthOfLastWord(String s){
		int len = s.length();
		int count = 0;
		int tem = 0;
		char[] c = s.toCharArray();
		
		for(int i = 0; i < len; i++){
			if(s.charAt(i) != ' '){
				count++;
			}
			if(s.charAt(i) == ' ' && count != 0){
				tem = count;
				count = 0;
			}
		}
		if(count != 0){
			return count;
		}else{
			return tem;
		}
	}
}
		