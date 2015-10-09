
public class Helper implements Comparable<Helper>{
	    String number;
	    public Helper(int n){
	        this.number=Integer.toString(n);
	    }
	    @Override
	    public int compareTo(Helper n){
	        String s1=n.number+this.number;
	        String s2=this.number+n.number;
	        for(int i=0; i<s1.length(); i++){
	            if(s1.charAt(i)>s2.charAt(i))return 1;
	            else if(s1.charAt(i)<s2.charAt(i))return -1;
	        }
	        return 0;
	    }
	}
