
public class Solution {
	public String solution(String[] strs){
		String[] comm;
		int i = 0;
		String temp = "";
		for(i = 0; i < strs.length; i++){
			if(strs[i].isEmpty()){
				return "";
			}
			if(temp.isEmpty()&& i == 0){
				temp = strs[i];
				continue;
			}
			int count = 0;
			for(int j = 1; j <= Math.min(temp.length(), strs[i].length()); j++){
				if(strs[i].substring(0,j).equals(temp.substring(0, j))){
					count = j;
				}else{
					break;
				}
			}
			temp = strs[i].substring(0, count);
		}
		return temp;
	}
}
