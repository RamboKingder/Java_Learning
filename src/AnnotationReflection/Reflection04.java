package AnnotationReflection;

public class Reflection04 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.m);
        /*
        1.加载时，产生这个类对应的Class对象
        2.链接时，为类变量(static变量)分配内存并设置默认值
        3.初始化，执行类构造器<clinit>()方法
                          <clinit>(){
                          m = 0;
                          m = 300;
                          m = 100;
                          }
         */
    }
}

class A{

    static {
        System.out.println("A类的静态代码块");
        m = 300;
    }

    static int m = 100;

    public A(){
        System.out.println("A类的无参构造器");
    };
}