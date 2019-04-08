package knowledge;
//斐波那契数列:1 1 2 3 5 8 13
public class TestFebonacci {
	public static void main(String[] args) {
//		System.out.println(feb(7));
//		System.out.println(febArr(1));
		System.out.println(febonacci(3));
	}
	//递归解决斐波那契数列
	public static int feb(int i){
		if(i == 1 || i == 2){
			return 1;
		}else {
			return feb(i-1)+feb(i-2);
		}
	}
	//使用数组解决斐波那契问题
	public static int febArr(int n){
		int[] arr = new int[1024];
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i <= n; i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		return arr[n];
	}
	//使用for循环
	public static int febonacci(int n){
		int a = 1;
		int b = 1;
		int result = 0;
		if(n < 0){
			return 0;
		}else {
			if(n == 1 || n == 2){
				return 1;
			}else {
				for (int i = 3; i <= n; i++) {
					result = a + b;
					a = b;
					b = result;
				}
			}
		}
		return result;
	}

}
