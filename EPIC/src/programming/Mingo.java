package programming;

public class Mingo {
	
	int[][]matrix= new int[10][10]; 
	int[] r = new int[10];
	int[] c = new int[10]; 
	int rightdown = 0; int leftdown = 0;
	void initial(){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				matrix[i][j]=0;
			}
		}
		for(int i=0;i<10;i++){
			r[i]=0;c[i]=0;
		}
	}
	void generateMatrix(){
		for(int i=0;i<100;i++){
			int value = (int) (Math.random() * 100);
			int row = value / 10;
			int col = value - row * 10;
			while (matrix[row][col] != 0) {
				value = (int) (Math.random() * 100);
				row = value / 10;
				col = value - row * 10;
			}
			int data = (int) (Math.random() * 1000);
			matrix[row][col] = data;
			mingle(row, col);
		}
	}
	void printMingle() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "    ");
			}
			System.out.println();
		}
	}  
	   
	void mingle(int row,int col){
		r[row]++;c[col]++;
	    if(r[row]==10) System.out.println("Mingo:"+"row"+row);
	    if(c[col]==10) System.out.println("Mingo:"+"col"+col);
	    if(row==col) rightdown++;
	    if(rightdown==10) {
	    	System.out.println("Mingo:rightdown diagon");
	    	rightdown=0;
	    }
	    if(row==9-col) leftdown++;
	    if(leftdown==10) {
	    	System.out.println("Mingo:leftdown diagon");
	    	leftdown=0;
	    }
	}
	public static void main(String[] args){
		Mingo m = new Mingo();
		m.initial();
		m.generateMatrix();
		m.printMingle();
	}

}
