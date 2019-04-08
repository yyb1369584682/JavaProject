package knowledge.sort;

import java.util.Arrays;
//插入排序
//缺点；当后面出现一个比较小的元素时，会导致排序效率较慢
public class InsertSort {
	public static void main(String[] args) {
		int[] arr = new int[]{5,6,2,8,1,3,4,9};
		System.out.println(Arrays.toString(arr));
		insertSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void insertSort(int[] arr){
		//遍历数组
		for (int i = 1; i < arr.length; i++) {
			//比较相邻两个数的大小
			if(arr[i] < arr[i-1]){
				//若当前元素小于前一个元素，则记录当前元素
				int tmp = arr[i];
				int j;
				//向前遍历，
				for(j = i-1;j>=0&&tmp<arr[j];j--){
					//把前一个元素赋给后元素
					arr[j+1]=arr[j];
				}
				//把临时变量赋值给不满足条件的后一个元素
				arr[j+1] = tmp;
			}
		}
	}
}
