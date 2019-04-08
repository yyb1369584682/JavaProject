package knowledge;
//递归调用
public class TestRecursive {
	public static void main(String[] args) {
		print(3);
	}
	//递归
	public static void print(int i){
		if(i>0){
			print(i-1);
			System.out.println(i); //打印结果 1，2，3，4，5
		}

//		if(i>0){
//			System.out.println(i); //打印结果 5，4，3，2，1
//			print(i-1);
//		}

	}
}
