package knowledge.tree.threadbinarytree;

public class TestThreadBinaryTree {
	public static void main(String[] args) {
		//创建一个树
		ThreadBinaryTree binTree = new ThreadBinaryTree();
		//为树创建一个根节点
		ThreadTreeNode root = new ThreadTreeNode(1);
		//为树设置根节点
		binTree.setRoot(root);
		//创建根节点的左节点
		ThreadTreeNode rootL = new ThreadTreeNode(2);
		//为根节点设置左节点
		root.setLeftNode(rootL);
		//创建根节点的右节点
		ThreadTreeNode rootR = new ThreadTreeNode(3);
		//为根节点设置右节点
		root.setRightNode(rootR);
		//添加第二层左节点的子节点
		rootL.setLeftNode(new ThreadTreeNode(4));
		rootL.setRightNode(new ThreadTreeNode(5));
		//添加第二层右节点的子节点
		rootR.setLeftNode(new ThreadTreeNode(6));
		rootR.setRightNode(new ThreadTreeNode(7));
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
		ThreadTreeNode result = binTree.frontSearch(5);
		System.out.println(result);
		//中序遍历查找
		result = binTree.midSearch(5);
		System.out.println(result);
		//后序遍历查找
		result = binTree.afterSearch(5);
		System.out.println(result);
		//删除子树
//		binTree.delete(3);
		binTree.midShow();
		System.out.println("===========");
		ThreadTreeNode fiveNode = new ThreadTreeNode(5);
		rootL.setRightNode(fiveNode);
		//中序线索化二叉树
		binTree.threadNodes();
		//获取5节点的后继节点
//		ThreadTreeNode afterFive = fiveNode.rightNode;
//		System.out.println(afterFive.value);
		System.out.println("===========");
		//遍历中序线索化二叉树
		binTree.threadIterate();

	}
}
