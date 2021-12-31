public class Puppy {

    // 成员变量默认的访问控制是public?
    int puppyAge;

    // 构造函数名和类名一致，且构造函数无返回值
    public Puppy (String name){
        System.out.println("小狗的名字是：" + name);
    }

    public void setAge(int age){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("小狗的年龄为：" + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args){
        // 直接在类中的main函数里面创建自身这个类的对象
        Puppy myPuppy = new Puppy("狗蛋");
        myPuppy.setAge(19);
        myPuppy.getAge();
        System.out.println("直接访问对象的成员：" + myPuppy.puppyAge);
    }
}
