package knowledge;
//&与&&的区别于联系

public class Yu {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		//&两边都为true，结果才为true
		if(a == 1 & b == 2){
			System.out.println(a);
			System.out.println(b);
		}
		System.out.println("==========");
		//&&两边都为true，结果才为true
		if(a == 1 && b == 2){
			System.out.println(a);
			System.out.println(b);
		}
		System.out.println("==========");
		//&一边为false，则结果就为false
		//但左边为false的时候，右边还需要继续执行
		if(a != 1 & b++ == 2){
			System.out.println(a);
			System.out.println(b);
		}else {
			System.out.println(a+"===");
			System.out.println(b+"===");
		}
		System.out.println("==========");
		b = 2;
		//&&一边为false，则结果就为false
		//当左边为false的时候，右边不需要继续执行
		if(a != 1 && b++ == 2){
			System.out.println(a);
			System.out.println(b);
		}else {
			System.out.println(a+"===");
			System.out.println(b+"===");
		}
		System.out.println("==========");
		//当&两边不是Boolean类型的时候，&是位运算符，进行与操作
		System.out.println(a&b);

	}

}

