package bigdata;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Shopp_1 {
    public static void main(String args){
        ArrayList<FruitItem> fruitItems = new ArrayList<FruitItem>();
        init(fruitItems);
    }


    //初始化商品
    private static void init(ArrayList<FruitItem> fruitItems) {
        FruitItem fruitItem1 = new FruitItem();
        FruitItem fruitItem2 = new FruitItem();
        FruitItem fruitItem3 = new FruitItem();

        fruitItem1.ID = 0001;
        fruitItem1.name = "pingguo";
        fruitItem1.money = 0.75;


        fruitItem2.ID = 0002;
        fruitItem2.name = "xiangjiao";
        fruitItem2.money = 0.83;


        fruitItem3.ID = 0003;
        fruitItem3.name = "juzi";
        fruitItem3.money = 0.49;

        fruitItems.add(fruitItem1);
        fruitItems.add(fruitItem2);
        fruitItems.add(fruitItem3);

    }

    //主菜单实现

    public static void mainMenu(){
        System.out.println("------欢迎光临喜临门超市------");
        System.out.println("");
    }
}
