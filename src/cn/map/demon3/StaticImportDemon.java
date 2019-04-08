package cn.map.demon3;
/*
JDK1.5新特性，静态导入
减少开发的代码量
标准的写法，导入包的时候才能用
import static java.lang.System.out 最末尾必须是一个静态成员
 */

import java.util.Arrays;
import static java.lang.System.out;
import static java.util.Arrays.sort;

public class StaticImportDemon {
    public static void main(String[] args) {
        out.println("hello");
        int[] arr = {1};
        sort(arr);
    }
}
