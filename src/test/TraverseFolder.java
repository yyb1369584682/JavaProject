package test;

import java.io.File;

/*
遍历一个目录下的所有文件
 */
public class TraverseFolder {
	public static void main(String[] args) {
		File dir = new File("d:\\demon");
		getFile(dir);
	}
	public static void getFile(File dir){
		System.out.println(dir);
		File[] files = dir.listFiles();
		for (File file : files) {
			if(file.isDirectory()){
				getFile(file);
			}
			System.out.println(file);
		}
	}
}
