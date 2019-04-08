package cn.gjp.view;
/*
视图层，用户看到和操作的界面
数据传递给controller层实现
成员位置，创建controller对象
 */
import cn.gjp.controller.ZhangWuController;
import cn.gjp.domin.ZhangWu;

import java.util.List;
import java.util.Scanner;

public class MainView {
    private static ZhangWuController controller = new ZhangWuController();
    //创建Scanner类对象，反复键盘输入
    private Scanner sc = new Scanner(System.in);
    /*
    实现界面效果
    接收用户的输入
    根据数据，调用不同的功能方法
     */
    public void run(){
        while(true){
            String in = choose();
            switch (in){
                case "1":
                    //添加账务
                    addZhangWu();
                    break;
                case "2":
                    //编辑账务
                    editZhangWu();
                    break;
                case "3":
                    //删除账务
                    deleteZhangWu();

                    break;
                case "4":
                    //查询账务
                    selectZhangWu();

                    break;
                case "5":
                    //退出系统
                    System.exit(0);
                default:
                    System.out.println("没有此功能");
                    break;
        }

        }


    }



    private String choose(){
        System.out.println("--------------------管家婆家庭记账软件---------------------");
        System.out.println("1、添加账务 2、编辑账务 3、删除账务 4、查询账务 5、退出系统 ");
        System.out.println("请输入您要操作的功能序号[1-5]");
        String in = sc.next();
        return in;
    }
    /*
    定义方法，实现账务删除
    实现思想;
        接收用户的输入，输入一个主键数据
        调用控制层方法，传递一个主键
     */
    private void deleteZhangWu() {
        //调用查询所有账务数据的功能，显示出来
        //看到所有数据，从中选取一项，进行修改
        selectAll();
        System.out.println("选择的是删除功能，请输入要删除记录的ID");
        int zwid = sc.nextInt();
        //调用controller层的deleteZhangWu方法
        controller.deleteZhangWu(zwid);
        System.out.println("删除账务成功");
    }
    /*
    定义方法editZhangWu实现编辑账务功能
    用户在界面选择菜单2的时候调用
    实现思想：
        接收用户的输入
        数据的信息，封装成ZhangWu对象
        调用控制层的方法，传递ZhangWu对象，实现编辑
     */
    public void editZhangWu(){
        //调用查询所有账务数据的功能，显示出来
        //看到所有数据，从中选取一项，进行修改
        selectAll();
        System.out.println("选择的是编辑功能，请输入数据");
        System.out.println("输入ID");
        int zwid = sc.nextInt();
        System.out.println("请输入分类名称");
        String flname = sc.next();
        System.out.println("请输入金额");
        double money = sc.nextDouble();
        System.out.println("请输入账户");
        String zhanghu = sc.next();
        System.out.println("请输入日期:格式XXXX-XX-XX");
        String createtime = sc.next();
        System.out.println("请输入具体描述");
        String description = sc.next();
        //将用户输入的参数，封装到ZhangWu对象中
        ZhangWu zw = new ZhangWu(zwid,flname,money,zhanghu,createtime,description);
        //调用controller层的editZhangWu方法
        controller.editZhangWu(zw);
        System.out.println("编辑账务成功");

    }
    /*
    定义方法addZhangWu添加账务
    用户在界面中选择菜单1的时候调用
    实现思想：
        接收键盘输入，5项输入，调用controller层方法
     */
    public void addZhangWu(){
        System.out.println("选择的是添加账务功能，请输入以下内容：");
        System.out.println("请输入分类名称");
        String flname = sc.next();
        System.out.println("请输入金额");
        double money = sc.nextDouble();
        System.out.println("请输入账户");
        String zhanghu = sc.next();
        System.out.println("请输入日期:格式XXXX-XX-XX");
        String createtime = sc.next();
        System.out.println("请输入具体描述");
        String description = sc.next();
        //将用户输入的参数，封装成ZhangWu对象
        ZhangWu zw = new ZhangWu(0,flname,money,zhanghu,createtime,description);
        //将接收到的数据，调用controller层的方法，传递参数
        controller.addZhangWu(zw);
        System.out.println("添加账务成功");

    }

    /*
    定义方法selectZhangWu（）
    显示查询的方式（1、查询所有 2、条件查询）
     */
    private void selectZhangWu(){
        System.out.println("请输入您要查询的方式：1、查询所有 2、条件查询");
        String select = sc.next();
        switch (select){
            case "1":
                //查询所有
                selectAll();
                break;
            case "2":
                //条件查询
                select();
                break;
            default:
                System.out.println("没有此功能");
                break;

        }

    }
    /*
     定义方法，实现查询所有的账务数据
     */
    private void selectAll() {
        //调用控制层方法
        List<ZhangWu> list = controller.selectAll();
        //输出结果
        if(list.size()!= 0)
            print(list);
        else
            System.out.println("没有查询到数据");
    }
    /*
    定义方法，实现查询选定条件的账务数据
    提供用户的输入日期，开始日期和结束日期
    把两个日期传输到controller层
    调用controller的方法，传递2个日期参数
    获取到controller查询的结果集，打印出出来
     */
    private void select() {
        System.out.println("输入查询日期，格式为xxxx-xx-xx");
        System.out.println("请输入开始日期");
        String startDate = sc.next();
        System.out.println("请输入结束日期");
        String stopDate = sc.next();
        List<ZhangWu> list = controller.select(startDate,stopDate);
        if(list.size()!= 0)
            print(list);
        else
            System.out.println("没有查询到数据");

    }

    private void print(List<ZhangWu> list) {

        //输出表头
        System.out.println("ID\t类别\t\t账户\t\t金额\t\t时间\t\t\t说明");

        for (ZhangWu zw : list) {
            System.out.println(zw.getZwid() + "\t" + zw.getFlname() + "\t" + zw.getMoney() + "\t\t" +
                    zw.getZhanghu() + "\t\t" + zw.getCreatetime() + "\t\t" + zw.getDescription());
        }
    }
}
