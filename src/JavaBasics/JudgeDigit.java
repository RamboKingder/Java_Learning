package JavaBasics;

import java.util.Scanner;

// 群里有个人问的题，简单帮他写了一下
public class JudgeDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入一个0到9的数字：");
        while(scan.hasNext()){
            if(scan.hasNextInt()){
                int n = scan.nextInt();
                if(n >= 0 && n < 10){
                    System.out.println("输入正确！你刚才输入的是：" + n);
                }else {
                    System.out.println("输入的数字必须属于0到9！");
                }
            }else {
                System.out.println("必须输入数字，而不是其他内容！");
                String rubbishStr = scan.next();
            }
            System.out.print("请输入一个0到9的数字：");
        }
    }
}