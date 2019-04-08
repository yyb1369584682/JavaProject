package bigdata;

import java.util.ArrayList;
import java.util.Scanner;

public class Shopp {
    public static void main(String[] args) {
        ArrayList<Goods> arr = new ArrayList<Goods>();
        addGoods(arr);
        while (true){
            int num = chooseFuction();
            switch (num){
                case 1:
                    printGoods(arr);
                break;

                case 2:
                    updateCount(arr);
                break;

                case 3:
                    return ;

                default:
                    System.out.println("没有此功能");


            }
        }

    }

    //定义方法，将商品的信息存储到集合中
    public static void addGoods(ArrayList<Goods> arr){
        Goods g1 = new Goods();
        Goods g2 = new Goods();
        g1.brand = "huawei";
        g1.size = 5.5;
        g1.price = 3600;
        g1.count = 5;

        g2.brand = "xiaomi";
        g2.size = 5.6;
        g2.price = 3200;
        g2.count = 3;

        arr.add(g1);
        arr.add(g2);
    }

    //定义方法，查看库存，遍历集合
    public static void printGoods(ArrayList<Goods> arr){
        System.out.println("---------商品库存列表--------");
        System.out.println("商品名字    大小     价格      库存 ");
        int totalCount = 0;
        double totalPrice = 0;
        for (Goods goods : arr) {
            System.out.println(goods.brand+"    "+goods.size+"    "+goods.price+"    "+goods.count);
            totalCount += goods.count;
            totalPrice += goods.count * goods.price;
        }
        System.out.println("总库存数:" + totalCount);
        System.out.println("总金额数:" + totalPrice);

    }

    //修改库存

    public static void updateCount(ArrayList<Goods> arr){
        Scanner scanner = new Scanner(System.in);
        for (Goods goods : arr) {
            System.out.println("请输入"+goods.brand+"的库存");
            goods.count = scanner.nextInt();
        }

    }

    //选择菜单

    public static int chooseFuction(){
        System.out.println("------------库存管理---------------");
        System.out.println("1、查看库存清单");
        System.out.println("2、修改商品库存数量");
        System.out.println("3、退出");
        System.out.println("请输入要执行的操作序号：");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        return i;

    }


}
