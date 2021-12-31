import java.util.Scanner;

public class ScannerIO {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

//        System.out.print("next方式接收：");
//        // 一定要获取到有效字符之后才可以结束输入
//        if(scan.hasNext()){
//            String str1 = scan.next();
//            System.out.println("输入的数据为：" + str1);
//        }

//        System.out.print("nextLine方式接收：");
//        if(scan.hasNextLine()){
//            String str2 = scan.nextLine();
//            System.out.println("输入的数据为：" + str2);
//        }

//        System.out.print("输入整数：");
//        if(scan.hasNextInt()){
//            int i = scan.nextInt();
//            System.out.println("输入的整数是：" + i);
//        }else {
//            System.out.println("输入的不是整数！");
//        }
//
//        System.out.print("输入小数：");
//        if(scan.hasNextFloat()){
//            float f = scan.nextFloat();
//            System.out.println("输入的小数是：" + f);
//        }else {
//            System.out.println("输入的不是小数！");
//        }

//        // 对比hasNextLine()和hasNext()
//        System.out.println(scan.hasNextLine());
//        System.out.println(scan.hasNext());

        String token;
        System.out.print("输入你的成绩等级：");
        while(scan.hasNext()){
            token = scan.next();
            switch (token){
                case "A":
                    System.out.println("优秀！");
                    break;
                case "B":
                    System.out.println("良好！");
                    break;
                case "C":
                    System.out.println("中等！");
                    break;
                case "D":
                    System.out.println("及格");
                    break;
                case "E":
                    System.out.println("不及格！");
                    break;
                default:
                    System.out.println("请输入正确的等级(A至E)!");
            }
            System.out.print("输入你的成绩等级：");
        }

        scan.close();
    }
}
