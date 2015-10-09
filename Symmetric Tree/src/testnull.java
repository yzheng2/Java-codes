
public class testnull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(A==B);
	}
	

	public static TreeNode A  = new TreeNode(0);
	public static TreeNode B  = new TreeNode(1);
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}


}
