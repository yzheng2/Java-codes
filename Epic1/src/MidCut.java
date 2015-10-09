
public class MidCut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer("aidssjf weioj soiwoeid dooiqiw qw ");
		int i = 0;
		while(i < s.length()){
			while(i < s.length() && s.charAt(i)== ' '){
				i++;
			}
			
			int j = i;
			
			while(j < s.length() && Character.isLetter(j)){
				j++;
			}
			if((j-i) >= 4 && (j-i)%2 == 0){
				int mid = (j-i)/2;
				s.insert(mid, " ");
				i = j + 1;
			}else{
				i = j;
			}
		}
		System.out.print(s);
	}

}
