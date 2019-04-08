package knowledge.sort;

import java.util.Arrays;

//基数排序
public class RedixQueenSort {
	public static void main(String[] args) {
		int[] arr = new int[]{5,61,3,64,59,945,657,538,25,68,46,821,6,84};
		System.out.println(Arrays.toString(arr));
		redixSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void redixSort(int[] arr){
		int max=0;  //数组中的最大数
		//找到数组中的最大元素
		for (int i = 0; i < arr.length-1; i++) {
			if(max<arr[i]){
				max = arr[i];
			}
		}
		//获取最大数的位数
		int maxLength = (max+"").length();
		//用于临时存数的数组
		int[][] temp = new int[10][arr.length-1];
		//用于记录在temp中相应数组中存放的数字的数量
		int[] count = new int[10];
		//控制循环的次数
		for (int i = 0,n=1; i < maxLength; i++,n*=10) {
			for (int j = 0; j < arr.length; j++) {
				//计算余数
				int ys = arr[j]/n%10;
				//把当前遍历的数据放入指定的数组中
				temp[ys][count[ys]] = arr[j];
				//记录数量
				count[ys]++;
			}
			//记录取的元素的位置
			int index = 0;
			//把数字取出来
			for (int j = 0; j < count.length; j++) {
				if(count[j]!=0){
					for (int k = 0; k < count[j]; k++) {
						//取出元素
						arr[index] =temp[j][k];
						//记录下一个元素位置
						index++;
					}
					//把数量置为0
					count[j]=0;
				}
			}
		}
	}
}
