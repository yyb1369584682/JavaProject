package cn.LinkedList;


public class Test {
	public static void main(String[] args) {
		NodeManager nm = new NodeManager();
		System.out.println("----------add----------");
		nm.add(5);
		nm.add(4);
		nm.add(3);
		nm.add(2);
		nm.add(1);
		nm.print();
		System.out.println("----------del----------");
		nm.delete(5);
		nm.print();
		System.out.println("----------update----------");
		nm.update(1,10);
		nm.print();
		System.out.println("----------find----------");
		System.out.println(nm.find(4));
		System.out.println("----------insert----------");
		nm.insert(5,8);
		nm.print();
	}
}
