package JavaAdvanced;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("ZhiHu");
        sites.add("Runoob");
        System.out.println("用add方法添加了很多元素，且不出现重复：" + sites);
        System.out.println("用contains方法判断某个元素是否存在：" + sites.contains("Google"));
        sites.remove("Runoob");
        System.out.println("用remove方法删除了一个元素：" + sites);
        System.out.println("用size方法计算集合的大小：" + sites.size());
        sites.clear();
        System.out.println("用clear方法将集合中的元素全部清除：" + sites);

    }
}
