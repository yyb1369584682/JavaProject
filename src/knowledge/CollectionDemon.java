package knowledge;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemon {
	public static void main(String[] args) {
		Collection arr = new ArrayList();		//创建ArrayList集合
		arr.add(1);  //向集合中添加元素
		arr.add("hello");
		System.out.println(arr.contains("hello"));
		System.out.println(arr);


	}
}
