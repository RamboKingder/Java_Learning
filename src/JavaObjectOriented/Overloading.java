package JavaObjectOriented;

public class Overloading {
    public int test(){
        System.out.println("不带参数的，返回1版本");
        return 1;
    }

    public void test(int a){
        System.out.println("带一个参数，无返回值的版本");
    }

    public String test(int a, String s){
        System.out.println("带两个参数，返回String的版本");
        return "test version 3";
    }

    public String test(String s, int a){
        System.out.println("跟刚才那个参数顺序不同的版本");
        return "test version 4";
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        o.test();
        o.test(3);
        o.test(4, "hello");
        o.test("hello", 4);
    }

}
