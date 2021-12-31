package AnnotationReflection;

// 测试三种获取Class对象的方式
public class Reflection02 {
    public static void main(String[] args) throws ClassNotFoundException {

        Student stu = new Student("LXL", 20);

        // 方式一：通过实例的getClass()方法
        Class c1 = stu.getClass();
        System.out.println(c1.hashCode());

        // 方式二：通过类的class属性获取
        Class c2 = Student.class;
        System.out.println(c2.hashCode());

        // 方式三：通过静态方法Class.forName()获取
        Class c3 = Class.forName("AnnotationReflection.Student");
        System.out.println(c3.hashCode());

        // 方式四：基本内置类型的包装类都有一个TYPE属性
        Class c4 = Integer.TYPE;
        System.out.println(c4.getName());

        // 方式五：获得父类的Class对象
        Class c5 = c1.getSuperclass();
        System.out.println(c5.getName());
    }
}

class Person{
    public String name;
    public int age;

    public Person(){};

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person{
    public Student(String name, int age) {
        this.name = "学生";
    }
}