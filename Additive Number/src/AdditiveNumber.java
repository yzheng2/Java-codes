
public class AdditiveNumber {
	
	public void AD(int start, int end, long num){
		for(int i = 1; i <= 9; i++){
			for(int j = 0; j <= 9; j++){
				int test = i + j;
				if(i + j <= 9){
					num = i*100 + j*10 + test;
				}else if(i + j <= 18){
					num = i*1000 + j*100 + test;
				}
				if(num > end){
					return;
				}
				if(num >= start && num > 0){
					System.out.println(num + " ");
				}
			}
		}
	}
}
