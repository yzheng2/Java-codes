
public class Solution {
	public int countPrimes(int n){
		Helper h = new Helper();
		int count = 0;
		for(int m = 2; m<n; m++){
			if(h.helper(m)){
			count ++;
			}
		}
		return count;
	}
}
