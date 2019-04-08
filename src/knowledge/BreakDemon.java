package knowledge;
//如何跳出当前的多重循环
public class BreakDemon {
	public static void main(String[] args) {
		/**
		 * 在要跳出的外循环前面定义一个标号，然后在内循环中使用带有标号的break语句
		 * 即可跳出外循环
		 */
		ok:
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			for (int j = 0; j < 10; j++) {
				System.out.println(j);
				if(j == 5) {
					System.out.println(j);
					break ok;
				}
			}
		}
		/**
		 * 让外层循环条件表达式的结果受到内层循环体代码的控制
		 */
		System.out.println("==========");
		int a = 10;
		for (int i = 0; i < a; i++) {
			System.out.println(i);
			for (int j = 0; j < 10; j++) {
				System.out.println(j);
				if(i == 3) {
					System.out.println(j);
					a = i;
					break ;
				}
			}
			System.out.println("!!!!!");
		}
	}
}
