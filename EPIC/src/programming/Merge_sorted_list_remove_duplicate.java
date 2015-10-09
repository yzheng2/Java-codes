package programming;

public class Merge_sorted_list_remove_duplicate {

	public static void main(String[] args){
		Solution x = new Solution();
		int[] n = {1,2,2,4,5,7,9};
		int[] m = {2,3,4,4,5,6,7};
		
		int [] r = x.merge(n, m);
		for(int i=0;i<r.length;i++){
			System.out.print(r[i]+" ");
		}
	}
	public static class Solution{
		public int[] merge(int[] n,int[] m){
			int n1 = 0;
			int m1 = 0;
			int [] res = new int[14];
			res[0]=(n[0]<=m[0])?n[0]:m[0];
			if(n[0]>m[0]) m1++;
			else n1++;
			int count = 0;
			int i=1;
			while(n1<7&&m1<7){
				if(n[n1]>=m[m1]){
					if(m[m1]!=res[i-1]) {
						res[i]=m[m1];i++;
					}
					else if(m[m1]==res[i-1]) count++;
					m1++;					
				}else if(n[n1]<m[m1]){
					if(n[n1]!=res[i-1]) {
						res[i]=n[n1];i++;
					}
					else if(n[n1]==res[i-1]) count++;
					n1++;
				}
				
			}
			if(i==n1){
				for(int j=m1;j<7;j++){
					if(res[i-1]!=m[j]){
						res[i]=m[j];i++;
					}
					else if(res[i-1]==m[j]) count++;
				}
			}
			else if(i==m1){
				for(int j=n1;j<7;j++){
					if(res[i-1]!=n[j]){
					res[i]=n[j];i++;					
					}
					else if(res[i-1]==n[j]) count++;
				}
			}
			int [] r = new int[14-count];
			for(int j=0;j<14-count;j++){
				r[j]=res[j];
			}
			return r;
		}
	}
}
