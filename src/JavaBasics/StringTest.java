public class StringTest {

    public static void formatPrint(){
        char c = 'A';
        int i = 666;
        float f = (float) 9.9;
        double d = 3.1415926897;
        System.out.printf("System.out.printf格式字符串：\n" +
                "字符型变量的值为:%c\n" +
                "int型变量的值为:%d\n" +
                "float型变量的值为:%f\n" +
                "double型变量的值为:%f\n", c, i, f, d);

        String fs = String.format("System.out.printf格式字符串：\n" +
                "字符型变量的值为:%c\n" +
                "int型变量的值为:%d\n" +
                "float型变量的值为:%f\n" +
                "double型变量的值为:%f", c, i, f, d);

        System.out.println("\n把格式化字符串fs输出:\n" + fs);

    }


    public static void stringTest(){
        // 编译器会将字符串常量"test string"自动转成String对象
        String str1 = "test string";

        // 当然，作为类，也可以用最常见构造函数的方式创建对象
        String str2 = new String("object");

        // String 的构造函数有很多
        String s = "ssssssssss";
        char[] cs = s.toCharArray();
        String fromArray = new String(cs);
        System.out.println("这个String对象是通过char[]构造的：" + fromArray);
        System.out.println("并且这个字符串的长度是：" + fromArray.length());

        String t = "tttttttt";
        System.out.println("使用concate连接s和t:" + s.concat(t));
        System.out.println("当然，连接完之后s其实是没变的，只是返回了连接后的结果而已：" + s);
    }

    public static void main(String[] args){

        formatPrint();

    }
}
