package cn.set.demon;

import java.util.HashSet;

public class HashSetDemo3 {
    public static void main(String[] args) {
        //采用add往哈希表中添加对象的时候，
        // 先用hashCode调用对象的哈希值，
        // 然后在集合容器中查看有没有相同的哈希值，
        // 若没有，则直接存储，若有的话，再用equals判断，
        //若相同，则不用再存储，若不同则采用桶结构进行存储
        HashSet<String> set = new HashSet<>();
        set.add(new String("aaa"));
        set.add(new String("aaa"));
        set.add(new String("bbb"));
        set.add(new String("bbb"));
        System.out.println(set);
    }
}
