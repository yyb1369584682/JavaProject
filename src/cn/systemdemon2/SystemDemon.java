package cn.systemdemon2;

public class SystemDemon {
    public static void main(String[] args) {
        function();
    }
    /*
    System类方法，复制数组
    arraycopy(Object src,  int  srcPos, Object dest, int destPos,int length);
    Object src,要复制的源数组
    int srcPos,数组源的起始索引
    Object dest,复制后的目标数组
    int destPos，目标数组起始索引
    int length，复制几个
     */
    public static void function(){
        int[] src = {11,22,33,44,55};
        int[] desc = {66,77,88,99};
        System.arraycopy(src,2,desc,0,3);
        for (int i : desc) {
            System.out.println(i);
        }
    }
}
