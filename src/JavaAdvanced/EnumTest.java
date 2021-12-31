package JavaAdvanced;

enum Color{
    RED, BLUE, GREEN;
}

public class EnumTest {

    enum ThreeNumbers{ // 枚举类型也可以声明在类内部
        ONE, TWO, THREE;
    }

    public static void main(String[] args) {
        Color a = Color.RED;
        System.out.println(a);

        ThreeNumbers t = ThreeNumbers.ONE;
        System.out.println(t);

        System.out.println("\n迭代枚举类型:");
        for(Color x:Color.values()){
            System.out.println(x);
        }

        Color b = Color.BLUE;
        System.out.println("\n枚举类型的值可以用在switch-case中：" + b);
        switch (b){
            case RED:
                System.out.println("红色！");
                break;
            case BLUE:
                System.out.println("蓝色！");
                break;
            case GREEN:
                System.out.println("原谅色！");
                break;
            default:
                System.out.println("啥也不是！");
        }

        System.out.println("\n查看每个枚举对象的索引：");
        for(Color col: Color.values()){
            System.out.println(col + " at index " + col.ordinal());
        }

    }
}
