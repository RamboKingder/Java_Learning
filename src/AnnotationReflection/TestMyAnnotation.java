package AnnotationReflection;

import java.lang.annotation.*;

@MyAnnotation(name="LongXiaoLan", schools = {"HEU"})
public class TestMyAnnotation {

    public void test(){
        System.out.println("This is a method for test.");
    }
}

// 自定义一个注解
@Target({ElementType.METHOD, ElementType.TYPE}) // 定义注解的作用范围，这里的Method定义它能在方法上使用
@Retention(value = RetentionPolicy.RUNTIME) // 一般都用Runtime，注解的生命周期一直保持刀Runtime
// RUNTIME>CLASS>SOURCE
@Documented // 表示是否将注解生成在Javadoc中
@Inherited // 表示子类可以继承父类的注解
@interface MyAnnotation{ // 自动继承了java.lang.annotation.Annotation接口
    // 注解的参数：参数类型 + 参数名()
    String name() default "";
    int age() default 0; // 如果不设默认值，则使用注解时不传参就会报错
    int id() default -1; // 如果值为-1，则不存在，就像find()方法一样

    String[] schools() default {"HIT", "MIT"};
}