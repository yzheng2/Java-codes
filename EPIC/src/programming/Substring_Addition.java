package programming;


public class Substring_Addition {

	public static void main(String[] args){
		//String s = "1763589";
		String s="1567843246862";
		System.out.print(substringadd(s,16));
	}
	public static String substringadd(String s,int sum){
		if(s.length()==0) return "";
		int left = 0;		
		while(left<s.length()){
			int res = s.charAt(left)-'0';
			if(res==sum) return s.substring(left,left+1);
		for(int i=left+1;i<s.length();i++){
			res+=s.charAt(i)-'0';
			if(res==sum) return s.substring(left, i+1);
			if(res<sum) continue;
			if(res>sum) break;
		}
		left++;
	}
		return "";
	}

}
