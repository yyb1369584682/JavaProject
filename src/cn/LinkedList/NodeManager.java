package cn.LinkedList;
/**
 * 链表节点管理
 * 链表：一种常见的基础数据结构，是一种线性表，但是并不会按
 * 线性的顺序存储数据，而是在每一个节点里存到是下一个节点的指针（Pointer）
 *
 * 链表与数组：线性数据结构
 *
 * 数组适合查找，遍历，固定长度
 * 链表适合插入，删除，不宜过长，否则会导致遍历性能下降
 */
public class NodeManager {
	private Node root;    //根节点
	private int pos; //节点位置

	//添加
	public void add(int data){
		if(root == null){
			root = new Node(data);
		}else {
			root.addNode(data);
		}

	}
	//删除
	public void delete(int data){
		if(root == null){
			System.out.println("链表为空");
		}else {
			if(root.getData() == data){
				root = root.next;
			}
			root.delNode(data);
		}

	}
	//修改
	public void update(int oldData,int newData){
		if(root == null){
			System.out.println("链表为空");
		}else {
			if(root.getData() == oldData){
				root.setData(newData);
			}else {
				root.updateNode(oldData,newData);
			}
		}
	}
	//查找
	public boolean find(int data){
		if(root != null){
			if(root.getData() == data){
				return true;
			}else {
				root.findNode(data);
			}
		}
		return false;
	}
	//插入
	public void insert(int index,int data){
		if(index<0) return;
		pos = 0;
		if(index == pos){
			Node newNode = new Node(data);
			newNode.next = root;
			root = newNode;
		}else {
			root.insertNode(index,data);
		}

	}
	//打印
	public void print(){
		if(root == null){
			System.out.println("链表为空");
		}else {
			System.out.print(root.getData()+"->");
			root.printNode();
		}
		System.out.println();
	}
	//节点结构
	private class Node{
		private int data;   //节点数据
		private Node next;   //节点指针

		//构造方法
		public Node(int data){
			this.data = data;
		}
		public void setData(int data){
			this.data = data;
		}
		public int getData(){
			return data;
		}

		public void setNext(Node next){
			this.next = next;
		}
		public Node getNext(){
			return next;
		}

		//节点操作方法
		//添加节点
		public void addNode(int data){
			if(this.next == null){
				this.next = new Node(data);
			}else {
				this.next.addNode(data);
			}

		}
		//删除节点
		public boolean delNode(int data){
			if(this.next == null) return false;
			if(this.next != null){
				if(this.next.data == data){
					this.next = this.next.next;
				}else {
					return this.next.delNode(data);
				}
			}
			return false;
		}
		//修改节点
		public void updateNode(int oldData,int newData){
			if(this.next!= null){
				if (this.next.data == oldData){
					this.next.setData(newData);
				}else {
					this.next.updateNode(oldData,newData);
				}
			}

		}
		//查找节点
		public boolean findNode(int data){
			if(this.next != null){
				if(this.next.data == data){
					return true;
				}else {
					this.next.findNode(data);
				}
			}
			return false;
		}
		//打印节点
		public void printNode(){
			if(this.next != null){
				System.out.print(this.next.data+"->");
				this.next.printNode();
			}
		}
		//插入节点(在索引前面插入)
		public void insertNode(int index,int data){
			pos++;
			if(pos == index){
				Node newNode = new Node(data);
				newNode.next = this.next;
				this.next = newNode;
			}else {
				if(this.next != null) {
					this.next.insertNode(index, data);
				}else {
					System.out.println("已经到达链表尾部");
				}
			}
		}
	}
}
