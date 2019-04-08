package cn.String.Demon_02;

public class StringBufferTest {
    public static void main(String[] args) {
        int[] str = {21,22,23,24,25,26};
        System.out.println(function(str));
    }

    public static String function(int[] str){
        //创建缓冲区
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        //遍历数组
        for(int i = 0; i < str.length; i++){
            //判断是不是数组最后一个元素
            if(i == str.length-1){
                sb.append(i).append("]");
            }else {
                sb.append(i).append(",");
            }
        }
        return sb.toString();
    }
}
