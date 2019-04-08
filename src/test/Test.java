package test;
/*
输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
	public static void main(String[] args) {
		LinkedList<Integer> link = new LinkedList<>();
		ArrayList<Integer> array = new ArrayList<>();
		ListNode listNode = new ListNode(1);


		array= printListFromTailToHead(listNode);
		System.out.println(array);

	}
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList list = new ArrayList();
		if (listNode != null) {
			printListFromTailToHead(listNode.next);
			list.add(listNode.val);
		}
		return list;
	}
	
}
class ListNode {
	int val;//节点值
	ListNode next = null;//下一个节点地址
	ListNode(int val) {//有参构造
		this.val = val;
	}
}
