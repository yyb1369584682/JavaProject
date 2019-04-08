package knowledge.sort;

import java.util.Arrays;

//希尔排序
public class ShellSort {
	public static void main(String[] args) {
		int[] arr = new int[]{8,5,2,6,4,3,8,1,9};
		System.out.println(Arrays.toString(arr));
		shellSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void shellSort(int[] arr){
		//遍历所有的步长
		for (int d = arr.length/2; d > 0; d/=2) {
			//遍历所有的组数
			for (int i = d; i < arr.length; i++) {
				//遍历每组的元素
				for (int j = i-d; j >=0; j-=d) {
					//如果当前元素大于加上步长后的那个元素
					if(arr[j]>arr[j+d]){
						int tmp = arr[j];
						arr[j] = arr[j+d];
						arr[j+d] = tmp;
					}
				}
			}
		}

	}
}
