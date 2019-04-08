package test;
//数组逆序
public class ArrayInversion {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int tmp;
		for(int i = 0; i < arr.length/2; i++){
			tmp = arr[arr.length-1-i];
			arr[arr.length-1-i] = arr[i];
			arr[i] = tmp;
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
