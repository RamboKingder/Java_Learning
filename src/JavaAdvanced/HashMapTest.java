package JavaAdvanced;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> sites = new HashMap<Integer, String>();
        sites.put(1, "Google");
        sites.put(2, "Runoob");
        sites.put(3, "Taobao");
        sites.put(4, "Zhihu");
        System.out.println("HashMap对象是用put方法加入元素的：" + sites);
        System.out.println("用get方法访问键为2的元素：" + sites.get(2));
        sites.remove(2);
        System.out.println("用remove方法删除键为2的元素：" + sites);
        System.out.println("用size方法计算HashMap对象的大小：" + sites.size());
        sites.clear();
        System.out.println("用clear方法将HashMap对象内的元素全部清空：" + sites);
    }
}
