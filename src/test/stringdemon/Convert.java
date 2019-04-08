package test.stringdemon;
/*
将字符串中，第一字符转换成大写，
其他字符转换成小写，并打印改变后的字符串
subString();获取指定索引的子字符串
 */
public class Convert {
	public static void main(String[] args) {
		String str = "dlFsjo8DVa5AFS2dn";
		String start = str.substring(0,1); //也可以用charAt()获取第一个字符
		start = start.toUpperCase();
		String stop = str.substring(1);
		stop = stop.toLowerCase();
		System.out.println(start+stop);

	}
}
