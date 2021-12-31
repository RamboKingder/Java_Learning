package JavaBasics;

import java.lang.reflect.Array;
import java.util.*;

public class VariousArraysTest {

    public static void primitiveArrayTest(){

        // 只声明一个数组，Java中的原始数组大小是固定的
        int size = 6;
        int[] a = new int[size];
        System.out.println("数组如果只创建而不初始化，那么其中的值都是int的默认值0");

        // 以下两种数组的初始化方法都是可以的
        int[] b = {1, 4, 2, 8, 5, 7};
        int[] c = new int[]{1, 4, 2, 8, 5, 7};

        // Arrays类可以方便操作数组，其所有的方法都是静态的
        // 注意Arrays类和Array类不是同一个东西！！！
        Arrays.fill(a, 6); // 用fill方法可以填充数组
        System.out.println("比如用Arrays.toString()方法直接输出数组：" + Arrays.toString(a));
        System.out.println("Arrays.equals()方法比较两个数组是否相等：" + Arrays.equals(b, c));
        Arrays.sort(b);
        System.out.println("Arrays.sort()方法直接将数组排序：" + Arrays.toString(b));
        System.out.println("Arrays.binarySearch()方法在数组中查找元素：" + Arrays.binarySearch(b, 3));
        // System.out.println(Collections.max(b));

    }

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.remove(2);


        List<List<Integer>> queues = new LinkedList<>();
        LinkedList<Integer> q0 = new LinkedList<Integer>();
        LinkedList<Integer> q1 = new LinkedList<Integer>();
        LinkedList<Integer> q2 = new LinkedList<Integer>();
        queues.add(q0);
        queues.add(q1); // 第1队是空的
        queues.add(q2);
        queues.get(0).add(4233); // 第0队来了个人
        queues.get(2).add(7623); // 第2队来了个人
        System.out.println("queues:" + queues);
//
//        List<List<Integer>> s = new LinkedList<>();
//
//        ArrayList<Integer>[][] sq = new ArrayList[5][7];
//        System.out.println(sq[0].toString());
//
//
//        List<List<Integer>> re=new ArrayList<List<Integer>>(7);
//        re.get(0).add(5);
//        re.get(4).add(55);
//        System.out.println(re);



        List<List<Integer>> ss = new ArrayList<List<Integer>>();
        for(int i = 0; i < 7; i++){
            ss.add(new ArrayList<Integer>());
        }
        ss.get(0).add(1);
        ss.get(0).add(2);
        ss.get(0).add(3);
        System.out.println(ss);
    }
}
