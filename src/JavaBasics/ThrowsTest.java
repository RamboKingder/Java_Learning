import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsTest {

    public void readFile() throws IOException{
        // 用throws在定义方法时声明异常
        FileInputStream file = new FileInputStream("D:/AdminLog/something.txt");
        int f;
        while((f = file.read()) != -1){
            System.out.print((char) f);
        }

        file.close();
    }

    public static void main(String[] args) {
        ThrowsTest t = new ThrowsTest();
        try{
            t.readFile();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
