package JavaObjectOriented;

// 说实话这里我挺迷惑的，但是为了节省时间先跳过

class SuperClass{
    private int n; // 私有的成员变量不会被子类继承
    SuperClass(){
        System.out.println("SuperClass()");
    }
    SuperClass(int n){
        System.out.println("SuperClass(int n)");
        this.n = n;
    }
}

class SubClass extends SuperClass{
    private int n;
    SubClass(){ // 自动调用了父类的无参数构造函数？
        System.out.println("SubClass");
    }
    public SubClass(int n){
        super(300); // 调用一下父类带参数的构造函数 但是为什么要用300不用n？
        System.out.println("SubClass(int n)" + n);
        this.n = n;
    }
}

class SubClass2 extends SuperClass{
    private int n;

    SubClass2(){
        super(300);  // 调用父类中带有参数的构造器
        System.out.println("SubClass2");
    }

    public SubClass2(int n){ // 自动调用父类的无参数构造器
        System.out.println("SubClass2(int n):"+n);
        this.n = n;
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        System.out.println("------SubClass 类继承------");
        // 这里由于SubClass的实例化没有传参进去，所以先自动调用了SuperClass的不含参构造器，然后又调用了自身的不含参构造器
        // SubClass sc1 = new SubClass();

        // SubClass想定义一个含参构造器，于是使用super()调用了SuperClass的含参构造器
        // SubClass sc2 = new SubClass(100);

        System.out.println("------SubClass2 类继承------");
        SubClass2 sc3 = new SubClass2(); // 这里追踪代码，理解起来挺显然的

        // 这一句输出了SuperClass让我有点意外，证明子类的构造器无论如何都必须显式或者隐式地调用父类的构造器
        SubClass2 sc4 = new SubClass2(200);
    }
}
