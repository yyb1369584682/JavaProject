package bigdata;

public class LoopTest_2 {
    public static void main(String[] args) {
        char xiaoXie = 'a';
        char daXie = 'A';
        for(int i = 0;i < 26; i++){
            System.out.println(xiaoXie + " " + daXie);
            xiaoXie++;
            daXie++;
        }
    }
}
