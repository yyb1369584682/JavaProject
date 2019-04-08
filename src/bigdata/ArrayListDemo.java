package bigdata;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        ArrayList<Phone> arrayList2 = new ArrayList<Phone>();
        arrayList.add("acd");
        arrayList.add("love");
        arrayList.add("java");
        int size = arrayList.size();
        System.out.println(size);
        String s = arrayList.get(1);
        System.out.println(s);
        System.out.println("----------------");
        for (String s1 : arrayList) {
            System.out.println(s1);
        }
        System.out.println("----------------");
        for(int i = 0;i <arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        arrayList.add(2,"c++");
        arrayList.set(2,"Cyuyan");
        arrayList.remove(3);
        arrayList.clear();
        System.out.println("----------------");
        for(int i = 0;i <arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }




    }
}
