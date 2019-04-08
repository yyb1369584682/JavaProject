package test;

public class StringBufferDemon {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("snvkfdl");
		System.out.println(sb);
		//delete包含头不包含尾
		sb.delete(1,5);
		System.out.println(sb);
		//insert在指定位置添加字符串
		sb.insert(2,"bfb");
		System.out.println(sb);
		//反转字符串
		sb.reverse();
		System.out.println(sb);
		//使用给定字符串替换指定字符
		sb.replace(2,3,"safff");
		System.out.println(sb);
		sb.toString();
		System.out.println(sb);
		StringBuilder sd = new StringBuilder();
		sd.append("1234vdfsg");
		System.out.println(sd);
	}

}
