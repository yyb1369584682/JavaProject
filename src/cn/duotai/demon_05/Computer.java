package cn.duotai.demon_05;
/*
定义笔记本类
功能：开机，关机，使用USB功能
 */
public class Computer {
    public void openComputer(){
        System.out.println("笔记本开机");
    }

    public void closeComputer(){
        System.out.println("笔记本关机");
    }

    public void usb(USB usb){
        usb.open();
        usb.close();
    }
}
