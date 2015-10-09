package programming;

public class Swapping_String {
	public static void main(String[] args){
		s1 = "abhduajeoadnm";
		s2 = "djlandakhroan";
		swap();
		System.out.println(s1);
		System.out.print(s2);
	}
    static String s1;
	static String s2;
	public static void swap(){
		for(int i=1,j=1;i<s1.length()&&j<s2.length();i++,j++){
			if(Character.isAlphabetic(s1.charAt(i))&&Character.isAlphabetic(s2.charAt(i))&&s1.charAt(i)-1==s1.charAt(i-1)||s1.charAt(i)+1==s1.charAt(i-1)){ 
				String temp1 = s1.substring(i-1, i+1);
				String temp2 = s2.substring(i-1, i+1);
				s1 = s1.substring(0, i-1)+temp2+s1.substring(i+1, s1.length());
				s2 = s2.substring(0, i-1)+temp1+s2.substring(i+1, s2.length());
			}
		}
		return;
	}
}
