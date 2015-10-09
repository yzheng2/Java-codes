
public class Solution {
	public String countAndSay(int n){
		StringBuilder last = new StringBuilder();
		StringBuilder cur = new StringBuilder();
		int i = 0;
		int hh = 1;
		String hehe = Integer.toString(hh); 
		while(i<n){
			if(i == 0){
				System.out.print(hehe);
			}
			if(i == 1){
				last.append('1');
				last.append('1');
				i++;
				System.out.println(last.toString());
				continue;
			}
			int index = 0;
			cur = new StringBuilder();
			while(index+1<last.length()){
				int count = 1;
				char c = last.charAt(index);
				while(index + 1 < last.length() && c == last.charAt(index+1)){
					count ++;
					index ++;
				}
					index++;
				cur.append(count);
				cur.append(c);
			}
			if(index + 1 == last.length() && last.charAt(index -1 ) != last.charAt(index)){
				cur.append(1);
				cur.append(last.charAt(index));
			}
			last = cur;
			System.out.println(cur.toString());
			i++;
		}
		return cur.toString();
	}
}
