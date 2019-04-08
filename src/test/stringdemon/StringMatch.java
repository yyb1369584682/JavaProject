package test.stringdemon;
/*
查询大字符串中指定小字符串出现的次数
 */
public class StringMatch {
	public static void main(String[] args) {
		//定义两个字符串
		String str = "hellojava,nihaojava!javazhenbangJava";
		String key = "java";
		//定义统计的次数
		int count = 0;
		//定义指定字符串出现的次数
		int index = 0;
		while((index = str.indexOf(key)) != -1){
			count++;
			//把剩余的部分再赋为str，进行匹配
			str = str.substring(index+key.length());
		}
		//输出出现的次数
		System.out.println(count);
	}
}
