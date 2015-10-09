package programming;

public class Replace_AEIOU {
	public static void main(String[] args){
		Solution x = new Solution();
		//String s = "shdauiorewqiurbkfvcbnajkhdaihqk";
		String s = "aaaaa";
		System.out.print(x.replaceaeiou(s));
	}

	public static class Solution{
		public String replaceaeiou(String s){
			if(s.length()<=3) return s;
			int count =0;
			for(int i =0;i<s.length();i++){
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
					count++;
				}
			}
			if(count<=3) return s;
			else if(count>3&&count<7){
				char [] c = s.toCharArray();
				int tempcount = 7-count;
				for(int i=c.length-1;i>=0;i--){
					if(tempcount<=0) break;
					if(c[i]=='a') {
						c[i]='A';
						tempcount--;
					}
					else if(c[i]=='e') {
						c[i]='E';
						tempcount--;
					}
					else if(c[i]=='i') {
						c[i]='I';
						tempcount--;
					}
					else if(c[i]=='o') {
						c[i]='O';
						tempcount--;
					}
					else if(c[i]=='u') {
						c[i]='U';
						tempcount--;
					}
					
				}
				s=new String(c);
				return s;
			}
			else if(count>=7){
				char [] c = s.toCharArray();
				int tempcount = count-4;
				for(int i=c.length-1;i>=0;i--){
					if(tempcount<=0) break;
					if(c[i]=='a') {
						c[i]='A';
						tempcount--;
					}
					else if(c[i]=='e') {
						c[i]='E';
						tempcount--;
					}
					else if(c[i]=='i') {
						c[i]='I';
						tempcount--;
					}
					else if(c[i]=='o') {
						c[i]='O';
						tempcount--;
					}
					else if(c[i]=='u') {
						c[i]='U';
						tempcount--;
					}
					
				}
				s=new String(c);
				return s;
			}
			return s;
			
		}
	}
}
