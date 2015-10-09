package programming;

public class Verify_Password {
	public static void main(String[] args){
		String s = "abcd1";
		System.out.print(valid(s));
	}

	public static boolean valid(String s){
		if(s.length()<5||s.length()>12) return false;
		int low = 0,num=0;
		for(int i=0;i<s.length();i++){
			int j=i+1;
			while(2*j-i<=s.length()){
				if(s.substring(i, j).equals(s.substring(j,2*j-i))) return false;
				j++;
			}
			if(Character.isDigit(s.charAt(i))) num++;
			if(s.charAt(i)-'a'>=0&&s.charAt(i)-'z'<=0) low++;
		}
		if(low==0||num==0) return false;
		return true;
	}
}
