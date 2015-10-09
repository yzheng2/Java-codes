package programming;

import java.util.Scanner;

public class Find_MaxMin_Number {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String[] s = in.nextLine().split(",");
		int[] res = new int[s.length];
		for(int i=0;i<res.length;i++){
			res[i]=Integer.parseInt(s[i]);
		}
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<res.length;i++){
			if(res[i]==0) {
				break;
			}
			if(res[i]%2==0) min = Math.min(min, res[i]);
			if(res[i]%2==1) max = Math.max(max, res[i]);
		}
		System.out.println(max);
		System.out.println(min);
	}

}
