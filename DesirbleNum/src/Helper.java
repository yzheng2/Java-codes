import java.util.*;
public class Helper {
	public ArrayList<Integer> help(int n){
		ArrayList<Integer> ss = new ArrayList<>();
		int num = (int)Math.pow(10, n);
		for(int i = num-1; i > 0; i--){
			HashSet<Integer> h = new HashSet<>();
			int d = i;
			for(int j = 1; j <= n; j++){
				int c = d%10;
				d = d/10;
				h.add(c);
//				if(h.add(c)){
//					break;
//				}
			}
			if(h.size()==n){
			Iterator<Integer> ii = h.iterator();
			while(ii.hasNext()){
				Integer temp = (Integer)ii.next();
				ss.add(temp);
			}
			}
		}
		return ss;
	}
}