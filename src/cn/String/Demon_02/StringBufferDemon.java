package cn.String.Demon_02;

public class StringBufferDemon {
    public static void main(String[] args) {
        function();
    }

    /*
    StringBuffer类方法
        StringBufferDemon append，带任意类型的数据，添加缓存区
        append返回值，写return this
        调用者是谁，返回值就是谁
     */

    public static void function(){
        StringBuffer sb = new StringBuffer();
        //调用StringBuffer方法append向缓冲区追加内容
        sb.append(25).append("avvbfbgfb");
        System.out.println(sb);
        //delete（int start，int end）删除缓冲区中字符
        //开始索引包括，结尾索引不包括
        sb.delete(1,3);
        System.out.println(sb);
        //insert(int index，任意类型)
        //将任意类型的数据，插入到缓冲区的指定索引上
        sb.insert(5,"A");
        System.out.println(sb);
        //replace(int start,int end,String str)
        //将指定索引范围内的所有字符，替换成新的字符串
        sb.replace(1,3,"QWEQQ");
        System.out.println(sb);
        //reserse()将缓冲区中的字符反转。
        sb.reverse();
        System.out.println(sb);

    }
}
