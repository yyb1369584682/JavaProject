package knowledge;

//==与equals的区别
public class EqualsDemon {
	public static void main(String[] args) {
		//==专门用来比较两个变量的值是否相同，也就是用来比较变量在内存中存储的数值是否相同
		int a = 1;
		int b = 1;
		String  c = new String("abc");
		String  d = new String("abc");
		System.out.println(a == b);
		System.out.println(c == d);
		//equals用于对比两个独立对象的内容是否相同
		System.out.println(c.equals(d));

	}
}
