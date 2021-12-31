public class StringBufferBuilder {

    // StringBuilder速度快，但是线程不安全，不能同访问
    public static void stringBuilderTest(){
        StringBuilder sb = new StringBuilder(10);
        sb.append("01234567");
        System.out.println(sb);
        sb.append("9");
        System.out.println(sb);
        sb.insert(8, "8"); // Runoob..Java!
        System.out.println(sb);
        sb.delete(5, 8); // 跟python切片一样，右边是取不到的
        System.out.println(sb);
    }

    // 线程更安全的StringBuffer函数
    public static void stringBufferTest(){
        StringBuffer sbf = new StringBuffer("菜鸟教程官网：");
        sbf.append("www.");
        sbf.append("baidu.");
        sbf.append("com");
        System.out.println(sbf);
    }

    public static void main(String[] args) {

        stringBuilderTest();
        stringBufferTest();
    }
}
