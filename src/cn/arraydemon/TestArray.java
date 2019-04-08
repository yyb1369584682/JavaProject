package cn.arraydemon;

import java.util.Arrays;

//数组的基本使用
public class TestArray {
	public static void main(String[] args) {
		int[] arr = new int[]{2,4,5,6,7,9};
		System.out.println(Arrays.toString(arr));
//		insert(2,10,arr);
//		delete(3,arr);
		System.out.println(find(10,arr));
	}
	//往数组中添加元素
	public static void insert(int index,int data,int[] arr){
		int[] newArr = new int[arr.length + 1];
		newArr[index] = data;

		for (int i = 0; i <index; i++) {
			newArr[i] = arr[i];
		}
		newArr[index] = data;
		for (int i = index+1; i < newArr.length; i++) {
			newArr[i] = arr[i-1];
		}
		System.out.println(Arrays.toString(newArr));
	}
	//删除元素中数组
	public static void delete(int index,int[] arr){
		int[] newArr = new int[arr.length-1];
		//第一种方法
		for (int i = 0; i < newArr.length; i++) {
			if(i<index){
				newArr[i] = arr[i];
			}else {
				newArr[i] = arr[i+1];
			}
		}
		//第二种方法
//		for (int i = 0; i < index; i++) {
//			newArr[i] = arr[i];
//		}
//		for (int i = index+1; i < arr.length; i++) {
//			newArr[i-1] = arr[i];
//		}
		System.out.println(Arrays.toString(newArr));
	}
	//二分查找（线性有序）
	public static int find(int data,int[] arr){
		int start = 0;  //记录开始查找的位置
		int end = arr.length - 1;  //记录结束的位置
		int mid = (start+end)/2;
		int index = -1;   //记录目标位置
		while(true){
			if(start>end){
				return -1;
			}
			//首先比较中间元素与所找元素是否相等
			if(arr[mid] == data){
				index = mid;
				break;
			}else {
				if(data < arr[mid]){
					end = mid - 1;
				}else {
					start = mid+1;
				}
			}
			mid = (start+end)/2;
		}
		return mid;
	}

}
