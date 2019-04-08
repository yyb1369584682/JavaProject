package knowledge.link;
//双向循环链表
public class DoubleNode {
	//上一个节点
	DoubleNode pre = this;
	//下一个节点
	DoubleNode next = this;
	//节点数据
	int data;
	public DoubleNode(int data){
		this.data = data;
	}

	//增加节点
	public void insert(DoubleNode node){
		//当前节点
//		DoubleNode currentNode = this;
//		//下一个节点
//		DoubleNode nextNode = currentNode.next;
//		//把新节点作为当前节点的下一个节点
//		nextNode = node;
//		//把当前节点作为新节点的前一个节点
//		node.pre = currentNode;
//		//让原来节点的下一个节点作为新节点的下一个节点
//		node.next = nextNode;
//		//让原来的下一个节点的上一个节点为新节点
//		nextNode.pre = node;


		DoubleNode nextNode = this.next;
		this.next = node;
		node.pre = this;
		node .next = nextNode;
		nextNode.pre = node;

	}
	//下一个节点
	public DoubleNode next(){
		return this.next;
	}
	//上一个节点
	public DoubleNode pre(){
		return this.pre;
	}

	//获取数据
	public int getData(){
		return this.data;
	}


}
