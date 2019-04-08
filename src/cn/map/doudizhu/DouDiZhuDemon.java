package cn.map.doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
实现模拟斗地主的功能
1、组合牌
2、洗牌
3、发牌
4、看牌
 */
public class DouDiZhuDemon {
    public static void main(String[] args) {
        //1、组合牌
        //创建Map集合，键是编号，值是牌
        HashMap<Integer, String> puke = new HashMap<Integer,String>();
        //创建List集合，存储编号
        ArrayList<Integer> pukeNum = new ArrayList<>();
        //定义13个点数的数组
        String [] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        String [] colors = {"♠","♡","♢","♧"};
        //定义整数变量，作为键出现
        int index = 2;
        //遍历点数数组
        for (String number : numbers) {
            for (String color : colors) {
                //花色+点数的组合，存储到Map集合,
                puke.put(index,color+number);
                //编号存储到List集合
                pukeNum.add(index);
                index++;
            }
        }
        //存储大王、小王
        puke.put(0,"大王");
        pukeNum.add(0);
        puke.put(1,"小王");
        pukeNum.add(1);
        //洗牌
        Collections.shuffle(pukeNum);
        //定义玩家、底牌集合
        ArrayList<Integer> play1 = new ArrayList<>();
        ArrayList<Integer> play2 = new ArrayList<>();
        ArrayList<Integer> play3 = new ArrayList<>();
        ArrayList<Integer> bottom = new ArrayList<>();
        //发牌采用的是集合索引(不是牌的编号)%3
        for (int i = 0 ; i < pukeNum.size(); i++ ) {
            //先将底牌放好
            if(i < 3){
                //存到底牌中
                bottom.add(pukeNum.get(i));
            //对索引%3判断
            }else if(i % 3 == 0){
                //索引上的编号，发给玩家1
                play1.add(pukeNum.get(i));
            }else if(i % 3 == 1){
                //索引上的编号，发给玩家2
                play2.add(pukeNum.get(i));
            }else{
                //索引上的编号，发给玩家3
                play3.add(pukeNum.get(i));
            }
        }
        //对玩家手中的编号排序
        Collections.sort(pukeNum);
        //看牌，到Map集合中查找玩家手中的编号，根据键找值
        //定义实现方法
        look("玩家1",play1,puke);
        look("玩家2",play2,puke);
        look("玩家3",play3,puke);
        look("底 牌",bottom,puke);
    }
    public static void look(String name,ArrayList<Integer> player,HashMap<Integer,String>puke){
        //遍历ArrayList集合，获取元素，作为键，到集合Map中找值
        System.out.print(name+" ");
        for (Integer key : player) {
            String value = puke.get(key);
            System.out.print(value+" ");
        }
        System.out.println();
    }
}
