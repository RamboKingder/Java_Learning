import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptTest {

    public static void tryCatch(){
        try {
            FileInputStream file = new FileInputStream("faultpath");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void throwsTest() throws FileNotFoundException {
        FileInputStream file = new FileInputStream("faultpath");
    }

    public static void main(String[] args) throws FileNotFoundException {

        // tryCatch();
        try {
            throwsTest();
        }catch (FileNotFoundException e){
            System.out.println("File not found!");
        }

    }

}
