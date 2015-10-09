
public class Solution {
	public boolean isSymmetric(TreeNode root){
		if(root == null || isSymmetric2(root.left, root.right)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isSymmetric2(TreeNode left, TreeNode right){
		if(left == null && right == null){
			return true;
		}
		if(left.val != right.val){
			return false;
		}
		return isSymmetric2(left.left, right.right) && isSymmetric2(left.right, right.left);
	}
}
