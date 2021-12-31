package AnnotationReflection;

public class Reflection01 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 通过反射获取类的Class对象
        Class<?> c1 = Class.forName("AnnotationReflection.User");
        Class<?> c2 = Class.forName("AnnotationReflection.User");
        Class<?> c3 = Class.forName("AnnotationReflection.User");

        // 一个类在内存中只有一个Class对象
        // 一个类在被加载后，类的整个结构都会被封装在Class对象中
        System.out.println(c1);
        System.out.println(c1.hashCode() + " " + c2.hashCode() + " " + c3.hashCode());
        System.out.println("c1.equals(c2)? " + c1.equals(c2));
        System.out.println("c1 == c2? " + (c1 == c2));

        System.out.println(c1.getName());
    }
}
