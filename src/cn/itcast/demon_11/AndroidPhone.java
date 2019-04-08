package cn.itcast.demon_11;
/*
定义新的智能手机
功能：打电话，发短信
    来电显示：号码，姓名，大头像
    新的手机，继承原来的手机，直接使用Phone类的打电话和发短信功能
    但是：将原来的来电功能，进行重写，加入新的内容
 */



public class AndroidPhone extends Phone {
   public void showNum(){
       super.showNum();
       System.out.println("显示姓名");
       System.out.println("显示大头像");
   }
}
