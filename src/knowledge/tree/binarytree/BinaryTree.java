package knowledge.tree.binarytree;
//二叉树结构
public class BinaryTree {
	//创建root节点
	TreeNode root;
	//为树设置根节点
	public void setRoot(TreeNode root) {
		this.root = root;
	}
	//获取根节点
	public TreeNode getRoot() {
		return root;
	}

	//前序遍历
	public void frontShow() {
		if(root != null){
			root.frontShow();
		}
	}

	//中序遍历
	public void midShow() {
		if(root != null){
			root.midShow();
		}
	}

	//后序遍历
	public void afterShow() {
		if(root != null){
			root.afterShow();
		}
	}

	//前序遍历查找
	public TreeNode frontSearch(int i) {
		return root.frontSearch(i);
	}

	//中序遍历查找
	public TreeNode midSearch(int i) {
		return root.midSearch(i);
	}

	//后序遍历查找
	public TreeNode afterSearch(int i) {
		return root.afterSearch(i);
	}


	public void delete(int i) {
		if(root.value == i){
			root = null;
		}else {
			root.delete(i);
		}
	}
}
