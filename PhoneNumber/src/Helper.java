import java.util.*;
public class Helper {
	public String helper(String digi){
		StringBuffer s = new StringBuffer();
		if(digi == null){
			return s.toString();
		}
		HashMap<Character, char[]> map = new HashMap<>();
		map.put('0', new char[]{' '});
		map.put('1', new char[]{});
		map.put('2', new char[]{'2', 'a', 'b', 'c'});
		map.put('3', new char[]{'3', 'd', 'e', 'f'});
		map.put('4', new char[]{'4', 'g', 'h', 'i'});
		map.put('5', new char[]{'5', 'j', 'k', 'l'});
		map.put('6', new char[]{'6', 'm', 'n', 'o'});
		map.put('7', new char[]{'7', 'p', 'q', 'r', 's'});
		map.put('8', new char[]{'8', 't', 'u', 'v'});
		map.put('9', new char[]{'9', 'w', 'x', 'y','z'});
		map.put('0', new char[]{});
		
		char prev = digi.charAt(0);
		int count  = 0;
		int i = 0;
		while(i<digi.length()){
			if(digi.charAt(i)==prev){
				count ++;
			}
			else{s.append(map.get(prev)[(count%map.get(prev).length)-1]);
			if(i+1>digi.length()){
				break;
			}
			prev = digi.charAt(++i);
			count = 1;
			}
		i++;
		}
		return s.toString();
	}
}

