package programming;

public class Replace_String {
	
	public static void main(String[] args){
		Solution x =new Solution();
		String s = "Aa a's A boy aba a";
		System.out.print(x.replacea(s));
	}

	
	public static class Solution{
		public String replacea(String s){
			if(s.length()==1){
				if(s=="a") return "one";
				else if(s=="A") return "ONE";
				else return s;
			}
			if(s.length()==0) return s;
			
			for(int i=0;i<s.length();i++){
				if(i==0&&s.charAt(i)=='a'&&s.charAt(i+1)==' '){
					s = "one"+s.substring(1, s.length());
				}else if(i==0&&s.charAt(i)=='A'&&s.charAt(i+1)==' '){
					s = "ONE"+s.substring(1,s.length());
				}else if(i==s.length()-1&&s.charAt(s.length()-1)=='a'&&s.charAt(i-1)==' '){
					s = s.substring(0,s.length()-1)+"one";
				}else if(i==s.length()-1&&s.charAt(s.length()-1)=='A'&&s.charAt(i-1)==' '){
					s = s.substring(0,s.length()-1)+"ONE";
				}else if(i-1>=0&&i+1<s.length()&&s.charAt(i)=='a'&&s.charAt(i-1)==' '&&s.charAt(i+1)==' '){
					s = s.substring(0, i)+"one"+s.substring(i+1, s.length());
				}else if(i-1>=0&&i+1<s.length()&&s.charAt(i)=='A'&&s.charAt(i-1)==' '&&s.charAt(i+1)==' '){
					s = s.substring(0, i)+"ONE"+s.substring(i+1, s.length());
				}
			}
			return s;
		}
	}
}
