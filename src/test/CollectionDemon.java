package test;

import java.util.ArrayList;

public class CollectionDemon {
	public static void main(String[] args) {
		//创建collection集合,不指定数据类型
		ArrayList arr = new ArrayList();
		arr.add(1);
		arr.add("文字");
		arr.add('a');
		for (Object o : arr) {
			System.out.println(o);
		}
		System.out.println(arr.get(2));
		//创建Collection集合，指定数据类型
		ArrayList<String> str = new ArrayList<String>();
		str.add("hello");
		str.add("world");
		str.add("java");
		for (String s : str) {
			System.out.println(s);
		}
		System.out.println(str.get(2));



	}
}
