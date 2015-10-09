package test;

public class PoolPuzzleOne {

	public static void main(String[] args) {
		int x = 0;
		
		while (x < 4){
			x = x-1;
			if(x<1){
				System.out.print("a");
				System.out.print(" ");
				System.out.print("noise");
			}
			if(x>1){
				System.out.print("an");
				System.out.print(" oyster");
			}
			if(x==1){
				System.out.print("annoys");
			}
			if(x>2){
				x=x+1;
			}
			System.out.println("");
			x=x+2;
		}
		// TODO Auto-generated method stub

	}

}
