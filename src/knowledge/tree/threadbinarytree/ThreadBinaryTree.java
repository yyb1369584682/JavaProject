package knowledge.tree.threadbinarytree;

//二叉树结构
public class ThreadBinaryTree {
	//创建root节点
	ThreadTreeNode root;
	//用于临时存储前驱节点
	ThreadTreeNode pre;
	//遍历线索二叉树
	public void threadIterate(){
		//用于临时存储当前遍历的节点
		ThreadTreeNode node = root;
		while(node != null){
			//循环找到最开始的节点
			while(node.leftType == 0){
				node = node.leftNode;
			}
			//打印当前值
			System.out.print(node.value+"  ");
			//打印当前节点的右指针指向的是后继节点，可能后继节点还有后继节点
			while(node.rightType == 1){
				node = node.rightNode;
				System.out.print(node.value+"  ");
			}
			//替换遍历的节点
			node = node.rightNode;
		}
	}
	//为树设置根节点
	public void setRoot(ThreadTreeNode root) {
		this.root = root;
	}
	//获取根节点
	public ThreadTreeNode getRoot() {
		return root;
	}

	//中序线索化二叉树
	public void threadNodes(){
		threadNodes(root);
	}
	public void threadNodes(ThreadTreeNode node){
		//当前节点如果为null，直接返回
		if(node == null){
			return;
		}
		//处理左子树
		threadNodes(node.leftNode);
		//处理前驱节点
		if(node.leftNode == null){
			//让当前节点的左指针指向前驱节点
			node.leftNode = pre;
			//改变当前节点的左指针类型
			node.leftType = 1;
		}
		//处理前驱的右指针，如果前驱节点的右指针是null（没有指向右子树）
		if(pre != null && pre.rightNode == null){
			//让前驱节点的右指针指向当前节点
			pre.rightNode = node;
			//改变当前节点的右指针类型
			pre.rightType = 1;
		}
		//每处理一个节点，当前节点是下一个节点的前驱节点
		pre = node;
		//处理右子树
		threadNodes(node.rightNode);
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
	public ThreadTreeNode frontSearch(int i) {
		return root.frontSearch(i);
	}

	//中序遍历查找
	public ThreadTreeNode midSearch(int i) {
		return root.midSearch(i);
	}

	//后序遍历查找
	public ThreadTreeNode afterSearch(int i) {
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
