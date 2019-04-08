package knowledge.tree.arraybinarytree;
//数组进行二叉树遍历
public class ArrayBinaryTree {
	int[] data;

	public ArrayBinaryTree(int[] data){
		this.data = data;
	}

	public void frontShow(){
		frontShow(0);
	}

	//前序遍历
	public void frontShow(int index){
		if(data == null || data.length ==0){
			return;
		}
		//输出当前索引的数值
		System.out.println(data[index]);
		//输出左节点的数值
		if(2*index+1<data.length){
			frontShow(2*index+1);
		}
		//输出右节点的数值
		if(2*index+2<data.length){
			frontShow(2*index+2);
		}
	}


}
