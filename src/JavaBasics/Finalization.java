public class Finalization {

    public static void test(){
        Cake c1 = new Cake(1);
        Cake c2 = new Cake(2);
        Cake c3 = new Cake(3);
    }

    public static void main(String[] args) {




        test();
        // 由于c1,c2,c3都是局部对象，所以在test执行完之后这三个对象会被回收
        // 又由于Cake类定义了finalize()方法，所以输出了disposed的信息

        // 由于c2和c3都为空引用了，所以原来的c2和c3对象被当作了垃圾准备回收
        // 但是在这两个对象被回收之前调用了finalize()方法，输出了提示信息
        System.gc();

    }

}

class Cake extends Object{
    private int id;
    public Cake(int id){
        this.id = id;
        System.out.println("Cake object " + id + " is created.");
    }

    // 使用protected修饰符，在对象被回收之前调用
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Cake object " + id + " is disposed.");
    }
}

