package programming;

public class Replace_Words {
	
	public static void main(String[] args){
		Solution x = new Solution();
		String s= "A person can't walk in this street n'''':asd";
		System.out.print(x.replacew(s));
	}

	public static class Solution{
		public String replacew(String s){
			if(s.length()<4) return s;
			int count = 0;
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)==' ') {
					if(count>=4&&count%2==0){
						int mid = helper(s,count,i-1);
						s=s.substring(0, mid+1)+" "+s.substring(mid+1, s.length());
					}
					count=0;
				}
				else if(s.charAt(i)!=' ') {
					if(Character.isAlphabetic(s.charAt(i))) count++;
				}
			}
			if(count>=4&&count%2==0){
				int mid = helper(s,count,s.length()-1);
				s=s.substring(0, mid+1)+" "+s.substring(mid+1, s.length());
			}
			return s;
			
		}
		
		private int helper(String s,int count,int i){
			int temp = count/2;
			while(temp>0){
				if(Character.isAlphabetic(s.charAt(i))) temp--;
				i--;
			}
			return i;
		}
	}
}
