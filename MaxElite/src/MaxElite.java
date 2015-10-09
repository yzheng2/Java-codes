import java.util.*;
public class MaxElite {
	
	public int MaxElite(int[] n){
		ArrayList<Integer> a = new ArrayList<>();
		for(int i = 0; i< n.length; i++){
			a.add(n[i]);
		}
		
		Collections.sort(a);
		
		int sum = 0;
		for(int j = 0; j < n.length-3; j++){
			sum += a.get(j);
		}
		int ave = sum/(n.length-3);
		return ave;
	}
}
