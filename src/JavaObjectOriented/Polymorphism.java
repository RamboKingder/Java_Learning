package JavaObjectOriented;


// 多态存在的三个必要条件：继承、重写、父类引用指向子类对象
public class Polymorphism {
    public static void main(String[] args) {
        Animal a = new Mouse("老鼠", 4); // 向上转型
        a.introduction(); // 调用的是Mouse的introduction
        System.out.println("a是Animal的一个实例吗？" + (a instanceof Animal));
        System.out.println("a是Mouse的一个实例吗？" + (a instanceof Mouse));
        Mouse m = (Mouse)a;
        a.introduction(); // 更利索当然调用Mouse的introduction了
    }
}
