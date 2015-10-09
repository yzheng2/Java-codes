package programming;

import java.util.ArrayList;
import java.util.List;


public class Telephone_Number {
	public static void main(String[] args){
		solution x = new solution();
		List<String> r = new ArrayList<String>();
		int n = 5;
		r=x.telenumber(n);
		for(int i=0;i<r.size();i++){
			System.out.println(r.get(i));
		}
		
	}
	
	public static class solution{
		List<String> l = new ArrayList<String>();
		String row="";
		public List<String> telenumber(int n){
			helper(n,10);
			row="4";
			helper2(n-1,4);
			return l;
			
		}
		
		private void helper(int n,int before){
			if(n==0){
				l.add(new String(row));
				return;
			}
			else{
				for(int i=0;i<=9;i++){
					if(i!=before&&i!=7&&i!=2&&i!=9&&i!=4){	
					row=row+String.valueOf(i);
					helper(n-1,i);
					row=row.substring(0, row.length()-1);
					}
				}
			}
			return;
		}
		private void helper2(int n,int before){
			if(n==0){
				l.add(new String(row));
				return;
			}
			else{
				for(int i=0;i<=9;i++){
					if(i!=before&&i!=7&&i!=2&&i!=9){	
					row=row+String.valueOf(i);
					helper(n-1,i);
					row=row.substring(0, row.length()-1);
					}
				}
			}
			return;
		}
		
	}
	
}
