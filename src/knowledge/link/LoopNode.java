package knowledge.link;

//循环链表操作
public class LoopNode {
	//节点内容
	int data;
	//下一个节点
	LoopNode next =  this;

	public LoopNode(int data){
		this.data = data;
	}
	public LoopNode next(){
		return this.next;
	}




	//删除链表中的节点
	public void delete(){
		//取出下下一个节点
		LoopNode newNode = next.next;
		this.next = newNode;
	}

	//插入节点
	public void insert(LoopNode node){
		//当前节点
		LoopNode currentNode = this;
		//保存下一个节点
		LoopNode nextNode = currentNode.next;
		//当前节点的下一个节点指向新增节点
		currentNode.next = node;
		//新增节点的下一个节点指向刚保存的下一个节点
		node.next = nextNode;
	}




}
