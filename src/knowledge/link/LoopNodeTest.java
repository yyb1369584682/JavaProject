package knowledge.link;

public class LoopNodeTest {
	public static void main(String[] args) {
		LoopNode n1 = new LoopNode(1);
		LoopNode n2 = new LoopNode(2);
		LoopNode n3 = new LoopNode(3);
		LoopNode n4 = new LoopNode(4);

		n1.insert(n2);
		n2.insert(n3);
		n3.insert(n4);

		System.out.println(n1.next.data);
		System.out.println(n2.next.data);
		System.out.println(n3.next.data);
		System.out.println(n4.next.data);
	}
}
