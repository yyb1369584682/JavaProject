package test.linklist;

/**
 * 实现链表的各种方法
 */
public class LinkList {
	public ListNode first; //定义一个头节点
	public int pos = 0;  //定义节点位置
	public LinkList(){
		this.first = null;
	}
	//插入一个头节点
	public void addFirstNode(int data){
		ListNode node = new ListNode(data);
		node.next = first;
		first = node;
	}
	//删除头节点,并返回
	public ListNode deleteNode(){
		ListNode temNode = first;
		first = temNode.next;
		return temNode;
	}
	//在任意位置插入节点，在index后面进行插入
	public void insertNode(){

	}



}
