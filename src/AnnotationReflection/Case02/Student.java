package AnnotationReflection.Case02;

@MyAnnotation(value = "LongXiaoLan")
public class Student extends Pearson implements MyInterface{
    private int sno;
    double height;
    protected double weight;
    public double score;

    public Student(){
        System.out.println("无参构造器");
    }

    private Student(int sno){
        this.sno = sno;
    }

    @Override
    public void myMethod(){
        System.out.println("子类必须重写继承的接口的方法");
    }


    public void showInfo(){
        System.out.println("我是一个学生");
    }

    public void showInfo(int a){
        System.out.println("重载了一下showInfo()方法");
    }

    public void work(){
        System.out.println("我以后打算找工作");
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", height=" + height +
                ", weight=" + weight +
                ", score=" + score +
                '}';
    }
}
