
public class Helper {
	public boolean helper(int m){
		int i = 2;
		while(i*i <= m && i*i > 0){
			i++;
			for(int j = 2; j <= i; j++){
				if(m%j == 0){
					return false;
				}
			}
		}
		return true;
	}
}
