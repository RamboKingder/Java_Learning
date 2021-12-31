import java.util.Arrays;
import java.util.Scanner;

// 以后关于Java字符串或者字符处理的测试代码和笔记都记在这里
public class CharacterTest {

    public static void judgeInput(Character c){
        System.out.println("Processing input: " + c);
        if(Character.isLetter(c)){
            System.out.println("This input is a letter!");
        }
        if(Character.isDigit(c)){
            System.out.println("This input is a digit!");
        }
        if(Character.isWhitespace(c)){
            System.out.println("This input is a Whitespace!");
        }
        if(Character.isUpperCase(c)){
            System.out.println("This input is a UpperCase!");
        }
        if(Character.isLowerCase(c)){
            System.out.println("This input is a LowerCase!");
        }
    }

    public static void main(String[] args){

        // Character类的基本使用方法
        // Character ch = new Character('S');

        // 原始字符 'a' 装箱到 Character 对象 ch 中
        // Character ch = 'a';

        String s = "ssss";

//        char c = s.charAt(0); // String对象的charAt()方法
//        char[] cs = s.toCharArray(); // String对象的toCharArray()方法
//
//        // 将Array类型变成String用于输出
//        System.out.println(Arrays.toString(cs));

        Scanner scan = new Scanner(System.in);

        System.out.print("请输入字符或者字符串：");
        while (scan.hasNext()){
            char ch = scan.next().charAt(0);
            judgeInput(ch); // 虽然参数类型不一致，但是char变量会被自动转成Character对象
            System.out.print("请输入字符或者字符串：");
        }

        scan.close();

    }
}
