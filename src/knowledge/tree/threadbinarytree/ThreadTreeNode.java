package knowledge.tree.threadbinarytree;

//树节点结构
public class ThreadTreeNode {
	//节点的权
	int value;
	//节点的左节点
	ThreadTreeNode leftNode;
	//节点的右节点
	ThreadTreeNode rightNode;
	//标识指针类型
	int leftType;
	int rightType;

	public ThreadTreeNode(int value){
		this.value = value;
	}

	//设置左节点
	public void setLeftNode(ThreadTreeNode leftNode) {
		this.leftNode = leftNode;
	}

	//设置右节点
	public void setRightNode(ThreadTreeNode rightNode) {
		this.rightNode = rightNode;
	}

	//前序遍历
	public void frontShow() {
		System.out.print(value+"  ");
		if(leftNode != null){
			leftNode.frontShow();
		}
		if(rightNode != null){
			rightNode.frontShow();
		}
	}

	//中序遍历
	public void midShow() {
		if(leftNode != null){
			leftNode.midShow();
		}
		System.out.print(value+"  ");
		if(rightNode != null){
			rightNode.midShow();
		}
	}

	//后序遍历
	public void afterShow() {
		if(leftNode != null){
			leftNode.afterShow();
		}
		if(rightNode != null){
			rightNode.afterShow();
		}
		System.out.print(value+"  ");
	}

	//前序遍历查找
	public ThreadTreeNode frontSearch(int i) {
		ThreadTreeNode target = null;
		//先比较当前节点是否相同
		if(this.value == i){
			return this;
		//当前节点的值不是要查找的
		}else {
			//比较当前节点的左节点
			if(leftNode != null){
				target = leftNode.frontSearch(i);
				}
			//如果不为null，说明在左节点中已经找到
			if(target != null){
				return target;
			}
			//查找右节点
			if(rightNode != null){
				target = rightNode.frontSearch(i);
			}
		}
		return target;
	}

	//中序遍历查找
	public ThreadTreeNode midSearch(int i) {
		ThreadTreeNode target = null;
		if(leftNode != null){
			target = leftNode.midSearch(i);
		}
		if (target != null){
			return target;
		}{
			if(this.value == i){
				return this;
			}else {
				if(rightNode != null){
					target = rightNode.midSearch(i);
				}
			}
		}
		return target;
	}

	//后序遍历查找
	public ThreadTreeNode afterSearch(int i) {
		ThreadTreeNode target = null;
		if (leftNode != null){
			target = leftNode.afterSearch(i);
		}
		if(target != null){
			return target;
		}else {
			if (rightNode != null){
				target = rightNode.afterSearch(i);
			}
			if(target != null){
				return target;
			}else {
				if(this.value == i){
					return this;
				}
			}

		}
		return target;
	}

	public void delete(int i) {
		ThreadTreeNode parent = this;
		//判断左节点
		if(parent.leftNode != null && parent.leftNode.value == i){
			parent.leftNode = null;
			return;
		}
		//判断右节点
		if(parent.rightNode != null && parent.rightNode.value == i){
			parent.rightNode = null;
		}
		//递归检查并删除左节点
		parent = leftNode;
		if(parent != null){
			parent.delete(i);
		}
		parent = rightNode;
		if(parent != null){
			parent.delete(i);
		}
	}


}
