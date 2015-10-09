import java.util.*;
public class Helper {
	public boolean help(String s){
		HashSet<Character> c = new HashSet<>();
		int count = 0;
		for(int i = 0; i<s.length(); i++){
			if(c.add(s.charAt(i))){
				count ++;
			}
		}
			ArrayList<Integer> map = new ArrayList<>();
//			int temp = Integer.valueOf(s);
//			while(temp>0){
//				int num = temp%10;
//				map.add(num);
//				temp = temp/10;
//			}
			for(int j = 0; j<s.length(); j++){
				for(int k = j+1; k<= s.length(); k++){
					String tem = s.substring(j, k);
					int val = Integer.valueOf(tem);
					Helper2 h = new Helper2();
					int product = h.production(val);
					if(map.contains(product)){
						return false;
					}else{
						map.add(product);
					}
				}
			}
			return true;
		}
	}