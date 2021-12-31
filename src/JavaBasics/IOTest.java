
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTest {

    public static void cmdRead() throws IOException{
        // 把System.in包装在一个BufferedReader对象中，获得一个绑定控制台的字符流
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c;
        do{
            System.out.print("输入一个字符，按下'q'键退出：");
            // read()方法从输入流读取一个字符并将其作为整数值返回
            // 当流结束时返回-1
            c = (char) br.read();
            if(c == '\n'){
                continue;
            }else {
                System.out.println("你输入的字符是：" + c);
            }

        }while (c != 'q');
    }

    public static void cmdReadLine() throws IOException{
        // 把System.in包装在一个BufferedReader对象中，获得一个绑定控制台的字符流
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        do{
            System.out.print("输入一句话，按下\"end\"键退出：");
            str =  br.readLine();
            System.out.println("你输入的是：" + str);

        }while (!str.equals("end"));
    }

    public static void main(String[] args) {

        try {
            // cmdRead();
            cmdReadLine();
        } catch (IOException e) {
            System.out.println("发生了IO异常！！！");
        }


    }
}
