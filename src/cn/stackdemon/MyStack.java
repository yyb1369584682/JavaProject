package cn.stackdemon;
//用数组实现栈的功能
public class MyStack {
	public static int[] array = new int[0];
	public static void main(String[] args) {
		MyStack ms = new MyStack();
		ms.push(9);
		ms.push(8);
		ms.push(7);
		ms.push(6);
		System.out.println(ms.peek());
		ms.pop();
		System.out.println(ms.peek());
		System.out.println(ms.empty());
//		System.out.println(ms.pop());
//		System.out.println(ms.pop());
//		System.out.println(ms.pop());

	}
	//压栈
	public void push(int data){
		//创建一个新的数组
		int[] newArray = new int[array.length + 1];
		//把原数组中的元素复制到新的数组中
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		//把添加的元素放入新数组的末尾
		newArray[array.length] = data;
		//使用新数组替换旧数组
		array = newArray;
	}
	//出栈
	public int pop(){
		if(array.length == 0){
			throw new RuntimeException("stack is empty");
		}
		//取出最后一个元素
		int data = array[array.length-1];
		//创建一个新的数组
		int[] newArray = new int[array.length -1];
		//原数组中除了最后一个元素的其他元素都放入新的数组中
		for (int i = 0; i < array.length-1; i++) {
			newArray[i] = array[i];
		}
		//使用新的数组替换旧的数组
		array = newArray;
		return data;
	}
	//查看栈顶元素
	public int peek(){
		return array[array.length-1];
	}
	//判断栈是否为空
	public boolean empty(){
		return array.length == 0;
	}


}
