package bigdata;

public class PhoneTest_1 {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.brand = "huawei";
        p1.color = "baise";
        p1.size = 4.5;

        Phone p2 = new Phone();
        p2.brand = "xiaomi";
        System.out.println(p1.brand + "    "+ p2.brand);
    }
}
