package bigdata;

import java.util.ArrayList;
import java.util.Scanner;

public class LoopTest_1 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        for(int i =100;i < 1000; i++){
            int bai = i / 100;
            int shi = i /10 %10;
            int ge = i % 10;
            int total = bai*bai*bai + shi*shi*shi + ge*ge*ge;
            if(i == total){
                integers.add(i);
                System.out.println(i + "是水仙花数");
            }

        }
        System.out.println("100-1000中水仙花数有:");
        for (Integer integer : integers) {
            System.out.println(integer+"  ");
        }


    }
}
