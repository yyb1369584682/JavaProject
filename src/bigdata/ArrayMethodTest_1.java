package bigdata;
//数组逆序输出
public class ArrayMethodTest_1 {
    public static void main(String[] args) {
        int[] arr = {1,4,7,2,5,8,9};
        reserve(arr);
        printArray(arr);

    }

    //反向遍历
    public static void fanXiang(int[] arr){
        for (int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }

    //逆序
    public static void reserve(int[] arr){
        int temp ;
        for(int max = arr.length-1, min = 0; min <= max; max--, min++){
            temp = arr[max];
            arr[max] = arr[min];
            arr[min] = temp;
        }
    }

    //打印数组
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0;i <arr.length; i++) {
            System.out.print(arr[i]);
            if(i == arr.length-1){
                System.out.println("]");
            }else {
                System.out.print(",");
            }

        }
    }


}
