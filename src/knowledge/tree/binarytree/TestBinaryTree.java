package knowledge.tree.binarytree;

public class TestBinaryTree {
	public static void main(String[] args) {
		//创建一个树
		BinaryTree binTree = new BinaryTree();
		//为树创建一个根节点
		TreeNode root = new TreeNode(1);
		//为树设置根节点
		binTree.setRoot(root);
		//创建根节点的左节点
		TreeNode rootL = new TreeNode(2);
		//为根节点设置左节点
		root.setLeftNode(rootL);
		//创建根节点的右节点
		TreeNode rootR = new TreeNode(3);
		//为根节点设置右节点
		root.setRightNode(rootR);
		//添加第二层左节点的子节点
		rootL.setLeftNode(new TreeNode(4));
		rootL.setRightNode(new TreeNode(5));
		//添加第二层右节点的子节点
		rootR.setLeftNode(new TreeNode(6));
		rootR.setRightNode(new TreeNode(7));
		//前序遍历binTree
		binTree.frontShow();
		System.out.println();
		//中序遍历binTree
		binTree.midShow();
		System.out.println();
		//后序遍历binTree
		binTree.afterShow();
		System.out.println();
		//前序遍历查找
		TreeNode result = binTree.frontSearch(5);
		System.out.println(result);
		//中序遍历查找
		result = binTree.midSearch(5);
		System.out.println(result);
		//后序遍历查找
		result = binTree.afterSearch(5);
		System.out.println(result);
		//删除子树
		binTree.delete(3);
		binTree.afterShow();


	}
}
