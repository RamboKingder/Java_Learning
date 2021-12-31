package AnnotationReflection.Case01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

    public static void polymorphism(){

        String str = "支付宝";
        if("微信".equals(str)){
            payPolymorphism(new WeChat());
        }
        if("支付宝".equals(str)) {
            new Alipay().pay();
        }
    }

    public static void reflection() throws Exception {
        String str = "AnnotationReflection.Case01.Alipay";

        // 处理的代码不需要改了，从前台获取的str变了就可变化使用对应的方法
        Class c1 = Class.forName(str);
        Method pay = c1.getMethod("pay");
        Object o = c1.newInstance();
        pay.invoke(o);

    }

    public static void main(String[] args) throws Exception {
        // polymorphism();
        reflection();
    }

    // 使用一下多态，尝试减少代码重复
    public static void payPolymorphism(Mtwm arg) {

        arg.pay();

    }
}
