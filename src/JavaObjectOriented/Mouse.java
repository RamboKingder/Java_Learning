package JavaObjectOriented;

public class Mouse extends Animal{
    // 子类不能继承父类的构造函数，只能显示或隐式地调用它
    // 如果父类的构造器没有参数，子类不需要定义构造器，可以隐式调用父类的构造器
    public Mouse(String myName, int myId){
        // 如果父类的构造器带有参数，子类必须用super显示调用父类构造器并传入适当参数
        super(myName, myId);
    }

    // 这其实就是重写(Override)的一个例子
    public void introduction(){
        System.out.println("鼠鼠我呀，只是一只老鼠...");
    }

    public void introTest(){
        System.out.print("先用super.introduction()：");
        super.introduction();
        System.out.print("再用this.introduction()方法：");
        this.introduction();
    }

    public static void main(String[] args) {
        Mouse m7 = new Mouse("老鼠", 4);
        m7.eat();
        m7.sleep();
        m7.introTest();
    }
}
