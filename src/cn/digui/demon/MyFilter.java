package cn.digui.demon;

import java.io.File;
import java.io.FileFilter;
public class MyFilter implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory())
            return true;
        //endsWith区分大小写
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
