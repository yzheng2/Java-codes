
public class TestMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = {{1,2,3,4},{2,3,4,5},{3,4,5,2},{1,5,3,1}};
		testhelper(matrix);
	}
	
	public static void testhelper(int[][] matrix){
		int m = matrix.length;
		int n = matrix.length;
		int [][] dp = new int[m][n];
		for(int i = 0; i<m; i++){
			for(int j = 0; j<matrix[i].length; j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
	}
		System.out.println(matrix[0].length);

}
}
