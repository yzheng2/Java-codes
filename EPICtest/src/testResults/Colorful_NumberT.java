package testResults;

import java.util.*;

public class Colorful_NumberT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {1,2,3,4};
		int i = 0;
		Colorful_NumberT a = new Colorful_NumberT();
		System.out.println(a.isColorful(3245));
	}
	
	public static boolean isColorful(int number){
		if(number < 10) return true;
		
		String colorString = String.valueOf(number);
		int length = colorString.length();
		
		List<Integer> colorMap = new ArrayList<Integer>();
		
		for(int i =  1; i < length; i++){
			for (int j = 0;  j+i <= length; j++){
				String sub = colorString.substring(j, j+i);
				int product = getProduct(Integer.parseInt(sub));
				if(colorMap.contains(product)) return false;
				else{
					colorMap.add(product);
				}
			}
		}
		return true;
	}

	private static int getProduct(int digits) {
		if(digits < 10) return digits;
		int num = digits;
		int product = 1;
		while(num > 0){
			product = product * (num % 10);
			num = num / 10;
		}
		return product;
	}

}
