package JavaBasics;

import java.util.Arrays;

public class ArrayTest {

    public static void arrayBasic(){
        int[] nums = {1, 4, 2, 8, 5, 7, 1, 4};
        int total = 0;
        for(int x:nums){
            total += x;
        }
        System.out.println("Sum of numbers is:" + total);

        int max = nums[0];
        for(int x: nums){
            if(x > max) max = x;
        }
        System.out.println("Maximun of numbers is:" + max);
    }

    // 可以看到传进来的数组的值被就地修改了
    // 因此，最好创建一个新的对象返回后再赋值，避免问题
    public static void argTest1(int[] nums){
        nums[0] = 666;
    }

    public static void argTest2(int[] nums){
        int[] another = {3, 2, 1};
        nums = another; // 经典参数问题，此时引用变了，此num非传进来的num了
    }

    public static void argTest(){
        int[] a = {0, 1, 2};
        System.out.println("a传入函数1之前：" + a[0]);
        argTest1(a);
        System.out.println("a传入函数1之后：" + a[0]);
        argTest2(a);
        System.out.println("a传入函数2之后：" + a[0]);
    }


    public static int[] reverse(int[] nums){
        // 注意Java的数组长度是固定的
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            result[nums.length-1-i] = nums[i];
        }
        return result;
    }

    public static void twoDArray(){
        String[][] s2s = new String[2][];
        s2s[0] = new String[2];
        s2s[1] = new String[3];
        s2s[0][0] = new String("Good");
        s2s[0][1] = new String("Luck");
        s2s[1][0] = new String("to");
        s2s[1][1] = new String("you");
        s2s[1][2] = new String("!");
    }

    public static void methods(int[] nums){
        System.out.print("现在使用一些常用的Arrays类静态方法；");
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums); // sort是就地执行的
        System.out.println("After sort:" + Arrays.toString(nums));
        System.out.println("查找100的位置，若不存在则返回-1：" + Arrays.binarySearch(nums, 100));
        Arrays.fill(nums, 666);
        System.out.println("往nums里面填充满666:" + Arrays.toString(nums));
    }

    public static void main(String[] args) {

        int[] s = new int[]{1, 4, 2, 8, 5, 7};
        System.out.println("After reversed: " + Arrays.toString(reverse(s)));
        methods(s);

    }
}
