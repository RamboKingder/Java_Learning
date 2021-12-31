package AnnotationReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// 通过反射，动态地创建对象
public class Reflection06 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        // 获得Class对象
        Class c1 = Class.forName("AnnotationReflection.User");

        // 通过Class对象创建一个实例
        User user = (User)c1.newInstance(); // 本质上调用了类的无参构造器
        System.out.println(user);

        // 通过构造器创建一个对象
        Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User user2 = (User) constructor.newInstance("LXL", 1, 20);
        System.out.println(user2);

        // 通过反射调用普通方法
        User user3 = (User) c1.newInstance();
        Method setName = c1.getDeclaredMethod("setName", String.class);
        // method.invoke(object, value) 调用object.method()方法并传入value参数
        setName.invoke(user3, "LXL");
        System.out.println(user3.getName());

        // 通过反射操作属性
        User user4 = (User) c1.newInstance();
        Field age = c1.getDeclaredField("age");
        age.setAccessible(true); // 如果没有这一句，则不能直接操作私有属性
        age.set(user4, 666);
        System.out.println(user4.getAge());
    }
}
