package bigdata;

public class LoopTest {
    public static void main(String[] args) {
        int total = 0;
//        for(int i = 1;i < 100;i = i + 2){
//            total += i;
//        }
        for(int i = 0; i < 100; i++){
            if(i % 2 == 1){
                total += i;
            }
        }
        System.out.println(total);
    }
}
