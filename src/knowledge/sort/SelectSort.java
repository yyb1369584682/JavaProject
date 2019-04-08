package knowledge.sort;

import java.util.Arrays;

//选择排序：每轮中都以开始元素为基准，与后面的元素进行比较，找到最小的元素，替换当前元素
public class SelectSort {
	public static void main(String[] args) {
		//定义数组
		int[] arr = new int[]{4,6,3,1,7};
		System.out.println(Arrays.toString(arr));
		selectSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void selectSort(int[] arr){
		//控制遍历轮数
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;    //记录最小值的索引
			//比较大小
			for(int j = i+1;j<arr.length;j++){
				//如果后面的值比最小的数小，则记录其下标
				if(arr[minIndex]>arr[j]){
					minIndex = j;
				}
			}
			//如果最小的数和当前遍历的数的下标不一致，则说明遍历到比当前值小的值
			if(minIndex!=i){
				int tmp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = tmp;
			}
		}
	}
}
