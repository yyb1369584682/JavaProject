package cn.file.demon1;
/*
自定义过滤器
实现FileFilter接口，重写抽象方法
 */

import java.io.File;
import java.io.FileFilter;

public class MyFilter implements FileFilter {
    public boolean accept(File pathname) {
        String name = pathname.getName();
        return name.endsWith(".java");
    }
}
