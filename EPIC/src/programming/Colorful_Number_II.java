package programming;

import java.util.HashSet;
import java.util.Iterator;

public class Colorful_Number_II {
	public static void main(String[] args){
		Solution x = new Solution();
		int [] n ={5,2,3};
		System.out.println(x.iscolorful(n));
        Iterator<Integer> it = x.set.iterator();
        while(it.hasNext()){
        	int a = it.next();
        	System.out.println(a);
        }
		
	}

	public static class Solution{
		HashSet<Integer> set = new HashSet<Integer>(); 
		boolean res=true;
		public boolean iscolorful(int[] n){
			if(n.length==0) return false;
			if(n.length<=2) return true;
			for(int i=2;i<=n.length-1;i++){
				//for(int j=0;j<n.length;j++){
					helper(n,0,i,1);
				if(res==false) return false;
				//}			
			}
			return res;
		}
		private void helper(int[] n,int j,int x,int m){
			if(x==0){
				if(set.contains(m)) res=false;
				else set.add(m);
				return;
			}
			for(int i=j;i<n.length&&i+x<=n.length;i++){
                m=m*n[i];
                helper(n,i+1,x-1,m);
                m/=n[i];
				}
			return;
			}
		}
	}

