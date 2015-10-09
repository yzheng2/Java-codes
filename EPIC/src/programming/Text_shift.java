package programming;

public class Text_shift {
	public static void main(String[] args){
		Solution x = new Solution();
		String[] text = {"I","am","a","boy"};
		String[] s = x.shift(text);
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}
	}
	
	public static class Solution{
		public String[] shift(String[] text){
			if(text.length==0) return null;
			
			int len=0;
			for(int i=0;i<text.length;i++){
				len=Math.max(len, text[i].length());
			}
			String[] s = new String[len];
			for(int i=0;i<s.length;i++){
				s[i]="";
			}
			for(int i=0;i<text.length;i++){
				int k = 0;
				for(int j=0;j<text[i].length();j++){
						s[k]=text[i].charAt(j)+s[k];
						k++;
				}
				while(k<s.length){
					s[k]=" "+s[k];
					k++;
				}
			
			}
			return s;
		}
	}

}
