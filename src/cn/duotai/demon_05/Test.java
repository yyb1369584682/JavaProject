package cn.duotai.demon_05;
//多态的扩展性

public class Test {
    public static void main(String[] args) {
        //创建笔记本对象，调用笔记本功能
        Computer com = new Computer();
        com.openComputer();

        //调用笔记本使用USB设备的方法
        //参数是USB接口类型，接口不能建立对象
        //调用方法，传递USB接口的实现类的对象
        com.usb(new Mouse());
        com.usb(new Keyboard());

        com.closeComputer();
    }
}
