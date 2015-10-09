
public class FitOrNot {
	public boolean FitOrNot(int n){
		int i;
		int j;
		int k;
		for(i = 0; i<n ; i++){
			for(j = 0; j < n; j++){
				for(k = 0; k < n; k++){
					while(i*6+j*9+k*20 == n){
						System.out.print(i + " ");
						System.out.print(j + " ");
						System.out.print(k + " ");
						return true;
					}
				}
			}
		}
		return false;
	}
}
