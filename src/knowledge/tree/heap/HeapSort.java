package knowledge.tree.heap;

import java.util.Arrays;
//堆排序
public class HeapSort {
	public static void main(String[] args) {
		int[] arr = new int[]{9,6,8,7,0,1,10,4,2};
		heapSort(arr);
		//输出排好的数组
		System.out.println(Arrays.toString(arr));
	}
	public static void heapSort(int[] arr){
		//开始位置即最后一个非叶子节点的父节点
		int start = (arr.length-1)/2;
		//调整为大顶堆
		for (int i = start; i >= 0 ; i--) {
			maxHeap(arr,arr.length,i);
		}
		//把数组中的第0个元素和堆中最后一个数交换，再把前面的处理为大顶堆
		for (int i = arr.length-1; i > 0 ; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			maxHeap(arr,i,0);
		}
	}

	/**
	 *
	 * @param arr 需要调整的数组
	 * @param size 调整的范围
	 * @param index 调整的开始位置
	 */
	public static void maxHeap(int[] arr,int size,int index){
		//左子节点
		int leftNode = 2*index + 1;
		//右子节点
		int rightNode = 2*index + 2;
		int max = index;
		//和两个子节点分别进行对比，找出最大的节点
		if(leftNode < size && arr[leftNode]>arr[max]){
			max = leftNode;
		}
		if(rightNode < size && arr[rightNode]>arr[max]){
			max = rightNode;
		}
		//交换位置，把最大值调到父节点
		if(max != index){
			int temp = arr[index];
			arr[index] = arr[max];
			arr[max] = temp;
			//交换位置后，可能会破坏之前排好的堆，所以，之前排好的堆需要重新调整
			maxHeap(arr,size,max);
		}
	}
}

