import java.util.*;
public class Helper {
	public String helper(String digi){
		ArrayList<Character> s = new ArrayList<>();
//		StringBuffer ss = new StringBuffer();
		if(digi == null){
			return s.toString();
		}		
		HashMap<Character, char[]> map = new HashMap<>();
		map.put('0', new char[]{'0'});
		map.put('1', new char[]{'1'});
		map.put('2', new char[]{'2', 'a', 'b', 'c'});
		map.put('3', new char[]{'3', 'd', 'e', 'f'});
		map.put('4', new char[]{'4', 'g', 'h', 'i'});
		map.put('5', new char[]{'5', 'j', 'k', 'l'});
		map.put('6', new char[]{'6', 'm', 'n', 'o'});
		map.put('7', new char[]{'7', 'p', 'q', 'r', 's'});
		map.put('8', new char[]{'8', 't', 'u', 'v'});
		map.put('9', new char[]{'9', 'w', 'x', 'y','z'});
		int i = 0;
		char com;
		int count = 1;
		while(i<digi.length()){
			com = digi.charAt(i);
			i++;
			if(digi.charAt(i-1)=='0' || digi.charAt(i-1) == '1'){
				s.add(digi.charAt(i-1));
				continue;
			}
			if(i<digi.length()){
				if(digi.charAt(i)==com){
					count ++;
				}else{
					s.add(map.get(digi.charAt(i-1))[(count%map.get(digi.charAt(i-1)).length)-1]);
					count = 1;
				}
			}else{
				s.add(map.get(digi.charAt(i-1))[(count%map.get(digi.charAt(i-1)).length)-1]);
			}
				}
		return s.toString();
			}
		}