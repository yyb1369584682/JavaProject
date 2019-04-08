package knowledge;
//用数组实现队列
public class MyQueen {
	public static int[] array = new int[0];
	public static void main(String[] args) {
		MyQueen mq = new MyQueen();
		mq.insert(1);
		mq.insert(2);
		mq.insert(3);
		mq.insert(4);
		System.out.println(mq.delete());
		System.out.println(mq.delete());
		System.out.println(mq.isEmpty());
		System.out.println(mq.delete());
		System.out.println(mq.delete());
		System.out.println(mq.isEmpty());

	}
	//进队列
	public void insert(int data){
		//创建一个新的数组
		int[] newArray = new int[array.length + 1];
		//把原数组的元素复制到新的数组中
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		//把新的数据放到数组末尾
		newArray[array.length] = data;
		//把新的数组替换为旧的数组
		array = newArray;
	}
	//出队列
	public int delete(){
		//判断队列是否为空
		if(array.length == 0){
			throw new RuntimeException("queen is empty");
		}
		//创建一个新的数组
		int[] newArray = new int[array.length - 1];
		//取出第一个元素
		int data = array[0];
		//把剩下的元素放入新的数组中
		for (int i = 1; i < array.length; i++) {
			newArray[i-1] = array[i];
		}
		//把新的数组替换为旧的数组
		array = newArray;
		return data;
	}
	//判断队列是否为空
	public boolean isEmpty(){
		return array.length == 0;
	}
}
