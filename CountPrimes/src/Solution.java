import java.util.*;
public class Solution {
	public int countPrimes(int n){
		if(n < 3){
			return 0;
		}
		
		int count = 0;
		double nn = Math.sqrt(n);
		HashSet<Integer> h = new HashSet<>();
		for(int i = 2; i < nn+1; i++){
			for(int j = i; j < n; j++){
				if(i*j<n && h.add(i*j)){
					count ++;
				}
			}
		}
		return n-count-2;
	}
}
	