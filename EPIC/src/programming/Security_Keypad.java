package programming;

import java.util.Scanner;

public class Security_Keypad {
	public static void main(String[] args){
		Solution x =new Solution();
		int code = 1478;
		Scanner s = new Scanner(System.in);		
		int in = s.nextInt();
		System.out.print(x.securitykey(code, in));
	}

	public static class Solution{
		public boolean securitykey(int code,int in){
			
			int count = 0;
			while(code>0){
				int a = code%10;
				int b = in%10;
				if(a!=b){
				if(Math.abs(a-b)==1||Math.abs(a-b)==3){
					count++;
					if(count>1) return false;
				}else{
					return false;
				}
				}
				code/=10;
				in/=10;
				if((code==0&&in!=0)||(code!=0&&in==0)) return false;
			}
			return true;
		}

	}
}
