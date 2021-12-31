package AnnotationReflection;

import java.lang.reflect.Field;
import java.util.Arrays;

// 获得类的信息
public class Reflection05 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("AnnotationReflection.User");

        // 获得类的名字
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());

        // 获得类的属性
        System.out.println(Arrays.toString(c1.getFields())); // 只能找到public属性
        System.out.println(Arrays.toString(c1.getDeclaredFields())); // 可以获得全部属性

        // 获得指定属性
        Field f = c1.getDeclaredField("name");
        System.out.println(f);

        // 获得类的方法
        System.out.println(Arrays.toString(c1.getMethods())); // 获得本类及父类的所有public方法
        System.out.println("===============================");
        System.out.println(Arrays.toString(c1.getDeclaredMethods())); // 获得本类的所有方法
    }
}
