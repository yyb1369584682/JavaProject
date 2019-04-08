package cn.String.Demo_01;

public class StringDemon4 {
    public static void main(String[] args) {
//        String str = "A1V2z3D4vCbF";
//        getCount(str);
        String str = "hellojava,nihaojava,javazhenbangjava";
        String key = "java";
//        String s = toConvert(str);
//        System.out.println(s);
        int count = getCount(str, key);
        System.out.println(count);
    }

    /*
    获取一个字符串在另一个字符串中出现的次数
     */
    public static int getCount(String str, String key){
        int count = 0;
        int l = key.length();
        for(int i = 0; i < str.length(); i++){
            int s = str.indexOf(key);
            if(s > 0){
                count++;
                str = str.substring(s+l);
            }
        }
        return count;
    }

    /*
    将字符串首字母转换成大写，其他内容转换成小写
    思想：
        获取首字母，charAt(),
     */
    public static String toConvert(String str){
        String sub1 = str.substring(0, 1);
        String s1 = sub1.toUpperCase();
        String sub2 = str.substring(1);
        String s2 = sub2.toLowerCase();
        return s1+s2;
    }

    public static void getCount(String str){
        int upper = 0;
        int lower = 0;
        int digit = 0;
        for (int i = 0; i < str.length(); i++){
            //charAt() 方法用于返回指定索引处的字符。
            // 索引范围为从 0 到 length() - 1。
            char c = str.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                upper++;
            }else if(c >= 'a' && c <= 'z'){
                lower++;
            }else if(c >= '0' && c <= '9'){
                digit++;
            }
        }
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(digit);
    }
}
