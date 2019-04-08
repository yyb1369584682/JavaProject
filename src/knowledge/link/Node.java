package knowledge.link;

//单链表操作
public class Node {
	//节点内容
	int data;
	//下一个节点
	Node next;

	public Node(int data){
		this.data = data;
	}
	public Node next(){
		return this.next;
	}

	//追加节点（在当前节点后追加一个）
	public void append(Node node){
		this.next = node;
	}
	//追加节点（在链表尾部追加一个）
	public void appends(Node node){
		//当前节点
		Node currentNode = this;
		//循环向后找(先遍历到节点的尾部)
		while(true){
			//下一个节点
			Node nextNode = currentNode.next;
			if(nextNode == null){
				break;
			}
			//把尾节点赋给当前节点
			currentNode = nextNode;
		}
		//把需要追加的节点追加到当前节点的下一个节点
		currentNode.next = node;

	}

	//查看节点
	public void show(){
		Node currentNode = this;
		while(currentNode != null){
			System.out.print(currentNode.data+"   ");
			//取出下一个节点
			currentNode = currentNode.next;
			if(currentNode == null){
				break;
			}
		}
		System.out.println();
	}
	//查看当前节点是否为最后一个节点
	public boolean isLast(){
		return this.next == null;
	}

	//删除链表中的节点
	public void delete(){
		//取出下下一个节点
		Node newNode = next.next;
		this.next = newNode;
	}

	//插入节点
	public void insert(Node node){
		//当前节点
		Node currentNode = this;
		//保存下一个节点
		Node nextNode = currentNode.next;
		//当前节点的下一个节点指向新增节点
		currentNode.next = node;
		//新增节点的下一个节点指向刚保存的下一个节点
		node.next = nextNode;
	}




}
