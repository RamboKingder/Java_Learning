package JavaAdvanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");

        Iterator<String> it = sites.iterator();
        System.out.println("使用iterator方法可以返回对象的迭代器：");
        while(it.hasNext()) {
            System.out.println(it.next() + ' ');
        }
        System.out.println("直接输出ArrayList对象：" + sites);

        System.out.println("用get方法及索引访问sites：" + sites.get(0));


        sites.set(1, "Rubbish");
        System.out.println("用set方法及索引更改sites：" + sites);

        sites.remove(1);
        System.out.println("用remove方法删除第2个元素：" + sites);

        System.out.println("用size方法计算数组的大小：" + sites.size());

        System.out.print("用增强for迭代数组：");
        for(String s:sites){
            System.out.print(s + " ");
        }

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(4);
        nums.add(2);
        nums.add(8);
        nums.add(5);
        nums.add(7);
        System.out.println("\n\n创建了一个ArrayList<Integer>：" + nums);

        Collections.sort(nums);
        System.out.println("用Collections.sort()排序之后：" + nums);
    }
}
