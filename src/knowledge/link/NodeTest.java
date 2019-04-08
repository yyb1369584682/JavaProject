package knowledge.link;

public class NodeTest {
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);

		n1.appends(n2);
		n2.append(n3);
		System.out.println(n1.next.next.data);
		n1.appends(n4);
		n2.insert(new Node(8));


		n1.show();
//		n1.next.delete();
//		n1.show();
//		System.out.println(n1.next.next.next.isLast());




	}
}
