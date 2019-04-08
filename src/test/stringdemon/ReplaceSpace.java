package test.stringdemon;
//把字符串中的空格替换成%20
public class ReplaceSpace {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("hello world,hello java");
		for (int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				str = str.replace(i,i+1,"%20");
			}
		}
		System.out.println(str);

	}


}
