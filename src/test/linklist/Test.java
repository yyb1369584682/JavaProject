package test.linklist;




public class Test implements Cloneable{

	public static void main(String[] args) {

		//头节点
		ListNode headNode = new ListNode(-1);
		headNode.next = null;

		ListNode curNode = headNode;
		//初始化链表
		for (int i = 0; i < 10; i++) {
			curNode.next = new ListNode(i);
			curNode =curNode.next;
		}
		//遍历打印链表值
		curNode = headNode;
		while(curNode !=null){
			System.out.print(curNode.val+" ");
			curNode = curNode.next;
		}
		System.out.println();

	}






}
