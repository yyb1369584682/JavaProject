package bigdata;
//控制数组遍历输出格式
public class ArrayMethodTest {
    public static void main(String[] args) {
        int[] arr= {2,5,8,6,4,3};
        int[] arr2= {22,55,85,65,45,35};


        printArray(arr);
        printArray(arr2);
    }

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
