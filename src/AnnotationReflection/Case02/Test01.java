package AnnotationReflection.Case02;

import java.lang.reflect.Constructor;

public class Test01 {
    public static void main(String[] args) throws NoSuchMethodException {
        // 获取构造器
        Class c1 = Student.class;
        Constructor constructor = c1.getDeclaredConstructor(int.class);

        Student s = new Student();
        System.out.println(s);
    }
}
