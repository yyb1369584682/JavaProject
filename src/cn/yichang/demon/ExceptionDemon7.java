package cn.yichang.demon;

public class ExceptionDemon7 {
    public static void main(String[] args) throws Exception {
        int avg = getAvg(50, 46, 86,-70);
        System.out.println(avg);
    }
    /*
    传递成绩，计算成绩的平均数
     */
    public static int getAvg(int ...source)throws RuntimeException{
        int sum = 0;
        for (int i : source) {
            if(i<0){
                throw new FuShuException("错误成绩"+i);
            }
            sum+=i;
        }
        return sum/source.length;
    }
}
