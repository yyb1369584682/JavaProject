package knowledge.sort;

import java.util.ArrayList;
import java.util.Arrays;

//合并排序
public class MergeSort {
	public static void main(String[] args) {
		int[] arr = new int[]{1,3,5,7,2,4,6,8,10,12,14};
		System.out.println(Arrays.toString(arr));
		mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	//归并排序
	public static void mergeSort(int[] arr,int low,int high){
		int middle = (high+low)/2;
		if(low<high){
			//处理左边
			mergeSort(arr,low,middle);
			//处理右边
			mergeSort(arr,middle+1,high);
			//归并
			merge(arr,low,middle,high);
		}
	}

	public static void merge(int[] arr,int low,int middle,int high) {
		//创建一个缓存数组，用于存储归并后的临时数组
		int[] tmp = new int[high-low+1];
		//记录第一个数组中需要遍历的下标
		int i = low;
		//记录第二个数组中需要遍历的下标
		int j = middle +1;
		int index = 0; //缓存数组的索引
		//遍历两个数组取出小的数字，放入临时数组中
		while(i<=middle&&j<=high){
			if(arr[i]<=arr[j]){
				tmp[index]=arr[i];
				i++;
			}else {
				tmp[index]=arr[j];
				j++;
			}
			index++;
		}
		//处理多余的数字
		while(i<=middle){
			tmp[index]=arr[i];
			i++;
			index++;
		}
		while(j<=high){
			tmp[index]=arr[j];
			j++;
			index++;
		}
		//把临时数组中的元素重新存入原数组
		for (int k = 0; k < tmp.length; k++) {
			arr[k+low]=tmp[k];
		}

	}
}
