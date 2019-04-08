package knowledge.sort;

import java.util.Arrays;
//冒泡排序：比较相邻两个元素，把大的元素放到小的元素的后面
public class BubbleSort {
	public static void main(String[] args) {
		//定义数组
		int[] arr = new int[]{2,7,1,3,5,9,3,6,21,4,22};
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void bubbleSort(int[] arr){
		//控制共比较多少轮
		for (int i = 0; i < arr.length - 1; i++) {
			//控制每轮比较的次数
			for (int j = 0; j < arr.length -1-i; j++) {
				//比较相邻两个元素的大小，把大的元素放到小的后面
				if(arr[j]>arr[j+1]){
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
}
