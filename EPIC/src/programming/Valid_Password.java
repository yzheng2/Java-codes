package programming;

public class Valid_Password {

	/*public static boolean valid(String ex,String in){
		int len1 = ex.length(); int len2 = in.length();
		if(len2>len1) return false;
		for(int i=0,j=0;i<len1)
	}*/
	public static void main(String[] args){
		String expect = "881886488";
		String actual = "1648";
		System.out.print(validPassword(expect,actual));
	}
	public static boolean validPassword(String expect, String actual) {
		if(actual.length()>expect.length()) return false;
	    char faultKey = '\0'; //initial fault key
	    int i=0, j=0;    //two pointer for each string
	    for(; i<actual.length() && j<expect.length(); j++) {
	        if(actual.charAt(i) != expect.charAt(j)) {
	            if(faultKey == '\0')    faultKey = expect.charAt(j);    //record fault key
	            else if(faultKey != expect.charAt(j))    return false;    //found second fault key
	            i--;
	        }
	        i++;
	    }
	    for(int k=0;k<actual.length();k++){
	    	if(faultKey==actual.charAt(k)) return false;
	    }
	    //fault key may require press many times after that
	    while(j<expect.length())    {
	    	if(expect.charAt(j)!=faultKey) {
	    		if(faultKey=='\0') faultKey = expect.charAt(j); 
	    		else{return false;}
	    	}
	    	j++;
	    }
	    
	    return true;
	}
}
