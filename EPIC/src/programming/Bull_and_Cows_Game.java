package programming;

import java.util.HashMap;

public class Bull_and_Cows_Game {
	public static void main(String[] args){
		String ex = "ability";
		String in = "appleby";
		int [] res = bullandcows(ex,in);
		System.out.print("bull="+res[0]+" "+"bows="+res[1]);
	}
	
	public static int[] bullandcows(String ex,String guess){
		HashMap<Integer,Character> map = new HashMap<Integer,Character>();
		for(int i=0;i<ex.length();i++){
			map.put(i, ex.charAt(i));
		}
		int bull = 0;
		int bows = 0;
		for(int i=0;i<guess.length();i++){
			if(map.get(i)==guess.charAt(i)) bull++;
			if(map.containsValue(guess.charAt(i))&&map.get(i)!=guess.charAt(i)) bows++;
		}
		int [] res = new int[2];
		res[0] = bull;res[1]=bows;
		return res;
	}

}
