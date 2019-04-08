package test.stringdemon;
/*
获取指定字符串中，大小写字符、数字的个数
 */
public class Count {
	public static void main(String[] args) {
		int big = 0;
		int small = 0;
		int num = 0;
		String str = "124D5f6V4cdgVsVdAaA";
		for(int i = 0;i<str.length();i++){
			char c = str.charAt(i);
			if(47<c && c<58){
				num++;
			}else if(96<c && c<123){
				small++;
			}else if(64<c&&c<91){
				big++;
			}
		}
		System.out.println("big="+big+"   small="+small+"   num"+num);
	}
}
