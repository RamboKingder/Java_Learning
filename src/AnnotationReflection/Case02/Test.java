package AnnotationReflection.Case02;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获取Pearson的字节码信息案例

        // 1.通过对象的getClass()方法
        Pearson p = new Pearson();
        Class c1 = p.getClass();
        System.out.println(c1.hashCode());

        // 2.通过类的class属性
        Class c2 = Pearson.class;
        System.out.println(c2.hashCode());

        // 方式1和方式2都不常用，因为他们必须用类创建实例，这样根本不必使用反射
        // 3.通过Class.forName()方法获取 这也是用得最多的方法
        Class c3 = Class.forName("AnnotationReflection.Case02.Pearson");
        System.out.println(c3.hashCode());

        // 4.利用类的加载器
        ClassLoader loader = Test.class.getClassLoader();
        Class c4 = loader.loadClass("AnnotationReflection.Case02.Pearson");
        System.out.println(c4.hashCode());

    }
}
