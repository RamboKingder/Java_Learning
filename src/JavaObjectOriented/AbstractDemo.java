package JavaObjectOriented;

public class AbstractDemo {
    public static void main(String[] args) {
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        // 这里满足出现多态的三个必要条件：继承、重写、父类引用指向子类对象
        // 跟Mouse那个例子一样，虽然用的是父类引用，但是调用的还是子类的方法
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\nCall mailCheck using Employee reference--");
        e.mailCheck();
    }
}