package knowledge.link;

public class DoubleNodeTest {
	public static void main(String[] args) {
		DoubleNode n1 = new DoubleNode(1);
		DoubleNode n2 = new DoubleNode(2);
		DoubleNode n3 = new DoubleNode(3);

		//追加节点
		n1.insert(n2);
		n2.insert(n3);

		System.out.println(n2.pre.getData());
		System.out.println(n2.getData());
		System.out.println(n2.next.getData());
		System.out.println(n3.pre.getData());

	}
}
