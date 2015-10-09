public class Solution {
	public String Solutions(StringBuffer ss){
		int i = 0;
		while(i<ss.length()){
			while(ss.charAt(i) == ' '){
				i++;
			}
			int j = i;
			
			while(i<ss.length() && Character.isLetter(ss.charAt(i))){
				j++;
			}
			StringBuilder tem = new StringBuilder(ss.substring(i, j));
			if(j>=4 && tem.length()%2 == 0){
				int mid = (j+i)/2;
				ss.insert(mid, ' ');
				i = j+1;
			}
			else{
				i = j;
			}
		}
		return ss.toString();
	}
}