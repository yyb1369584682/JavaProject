package cn.regex.demon_01;

public class ReplaceDemon {
    public static void main(String[] args) {
        replaceAll();
    }
    public static void replaceAll(){
        String str = "hello123wo4r5d";
        String s = str.replaceAll("[\\d]+", "#");
        System.out.println(s);

    }
}
