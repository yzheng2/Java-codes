package programming;

public class Magic_square {
	public static void main(String[] args){
		int n = 7;
		int[][] x = createMS(n);
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[0].length;j++){
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static int[][] createMS(int n) {
	    if (n <= 0) return null;
	    int[][] res = new int[n][n];
	    // initial position of 1
	    int x = 0;
	    int y = n / 2; // n is odd
	    res[x][y] = 1;
	    for (int i = 2; i <= n * n; i++) {
	        int newX = (x + n - 1) % n;    // use (x - 1 + n) instead of (x - 1) 
	                                    // to avoid overflow 
	        int newY = (y + 1) % n;
	        if (res[newX][newY] == 0) {
	            res[newX][newY] = i;
	        } else {
	            newX = (x + 1) % n;
	            newY = y;
	            if (res[newX][newY] != 0) {    // error
	                System.out.println("invalid");
	                return null;
	            }
	            res[newX][newY] = i;
	        }
	        x = newX;
	        y = newY;
	    }
	    return res;
	}
}
