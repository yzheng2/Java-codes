
public class Helper2 {
	public int production(int val){
		int product = 1;
		while(val > 0){
			product = product*(val%10);
			val = val/10;
		}
		return product;
	}
}
