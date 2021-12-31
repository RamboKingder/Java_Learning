package AnnotationReflection;

import java.util.ArrayList;
import java.util.List;

public class InnerAnnotation extends Object {

    @Override // 重写Object类的toString方法
    public String toString(){
        return super.toString();
    }

    @Deprecated // 不推荐使用，但还是可以使用的Deprecated方法deprecatedMethod()仍然被使用了的警告
    public static void deprecatedMethod(){
        System.out.println("This method is deprecated!");
    }

    @SuppressWarnings("all")
    public static void warningMethod(){
        List list = new ArrayList();
        System.out.println("WTF");
    }

    public static void main(String[] args) {
        deprecatedMethod();
        warningMethod();
    }

}
