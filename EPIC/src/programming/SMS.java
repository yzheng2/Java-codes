package programming;

import java.util.Scanner;

public class SMS {
	public static void main(String[] args) {
		Solution x = new Solution();
		//String input = "**111*#*5##*7777#52222";
		//String input = "11*2232311";
		Scanner in =new Scanner(System.in);
		String input=in.next();
		System.out.print(x.SMS(input));
	}

	public static class Solution {

		public String SMS(String input) {
			if(input.length()==0) return "";
			if(input.length()==1&&input.charAt(0)=='*') return " "; 			
			String s = "";
			int count;
			int temp;
			if (Character.isDigit(input.charAt(0))) {
				count = 1;
				temp = input.charAt(0) - '0' + 1;
			} else {
				count = 0;
				temp = 0;
			}
			String[] ref = { "", "0", "1", "ABC2", "DEF3", "GHI4", "JKL5",
					"MNO6", "PQRS7", "TUV8", "WXYZ9" };

			for (int i = 1; i < input.length(); i++) {
				if (Character.isDigit(input.charAt(i))) {
					if (input.charAt(i) != input.charAt(i - 1)) {
						if (temp == 0) {
							temp = input.charAt(i) - '0' + 1;
							count = 1;
						} else if (temp == 1 || temp == 2) {
							s = s + ref[temp];
							temp = input.charAt(i) - '0' + 1;
							count = 1;
						} else if (temp == 8 || temp == 10) {
							s = s + ref[temp].charAt((count - 1) % 5);
							temp = input.charAt(i) - '0' + 1;
							count = 1;
						} else {
							s = s + ref[temp].charAt((count - 1) % 4);
							temp = input.charAt(i) - '0' + 1;
							count = 1;
						}
					} else {
						count++;
					}
				} else if (input.charAt(i) == '*') {
					if (count != 0) {
						if (temp == 1 || temp == 2) {
							s = s + ref[temp];
						} else if (temp == 8 || temp == 10) {
							s = s + ref[temp].charAt((count - 1) % 5);
						} else {
							s = s + ref[temp].charAt((count - 1) % 4);
						}
					}
					s = s + " ";
					count = 0;
					temp = 0;
				} else if (input.charAt(i) == '#') {
					if (count != 0) {
						if (temp == 1 || temp == 2) {
							s = s + ref[temp];
						} else if (temp == 8 || temp == 10) {
							s = s + ref[temp].charAt((count - 1) % 5);
						} else {
							s = s + ref[temp].charAt((count - 1) % 4);
						}
					}
					count = 0;
					temp = 0;
				}
			}
			if (count != 0) {
				if (temp == 1 || temp == 2) {
					s = s + ref[temp];
				} else if (temp == 8 || temp == 10) {
					s = s + ref[temp].charAt((count - 1) % 5);
				} else {
					s = s + ref[temp].charAt((count - 1) % 4);
				}

			}
			return s;
		}
	}

}
