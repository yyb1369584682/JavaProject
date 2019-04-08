package knowledge.sort;

import java.util.Arrays;

//快速排序
public class QuickSort {
	public static void main(String[] args) {
		int[] arr = new int[]{3,5,6,2,4,8};
		System.out.println(Arrays.toString(arr));
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static void quickSort(int[] arr,int start,int end){
		if(start<end){
			//把数组中的第0个元素作为标准值
			int stand = arr[start];
			//记录需要排序的下标
			int low = start;
			int high = end;
			//循环找到比标准值大的和比标准值小的数
			while(low<high){
				//如果标准值小于最高位，则最高位左移
				while(low<high && stand <= arr[high]){
					high--;
				}
				//否则的话，使用右边的数字替换左边的数
				arr[low] = arr[high];
				//如果左边的数字小于标准值，则最低位右移
				while(low<high && arr[low] <= stand){
					low++;
				}
				//否则的话，使用最低位的值替换高位的值
				arr[high] = arr[low];
			}
			//把标准值赋给最低位的元素
			arr[low] = stand;
			//处理所有小的数字
			quickSort(arr,start,low);
			//处理所有大的数字
			quickSort(arr,low+1,end);
		}

	}
}
