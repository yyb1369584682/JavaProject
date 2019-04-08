package bigdata;
//求数组中的最大元素
public class Max {
    public static void main(String[] args) {
        int[] a = {2,5,4,3,8,6,27,9,25,16,23};
        int max = a[0];
        //普通for循环
        for (int i = 0;i < a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        //增强for循环
        for (int i : a) {
            if(i>max){
                max = i;
            }
        }
        System.out.println(max);
    }
}
