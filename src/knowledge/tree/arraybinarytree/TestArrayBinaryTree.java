package knowledge.tree.arraybinarytree;

//顺序存储的二叉树的遍历
public class TestArrayBinaryTree {
	public static void main(String[] args) {
		int[] data = new int[]{1,2,3,4,5,6,7};
		ArrayBinaryTree tree = new ArrayBinaryTree(data);
		tree.frontShow();
	}

}
