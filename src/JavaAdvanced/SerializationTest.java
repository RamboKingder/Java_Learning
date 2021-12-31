package JavaAdvanced;

import java.io.*;

class Employee implements java.io.Serializable{
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    public void mailCheck(){
        System.out.println("Mailing a check to " + name + " " + address);
    }
}

public class SerializationTest {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;
        try{ // 用ObjectOutputStream对对象进行序列化
            String filePath = "./data/Employee.ser";
            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("序列化对象已经被写进：" + filePath);

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        // 用ObjectInputStream反序列化对象
        try {
            FileInputStream inputFile = new FileInputStream("./data/Employee.ser");
            ObjectInputStream input = new ObjectInputStream(inputFile);
            Employee fromRead = (Employee) input.readObject();

            System.out.println("将对象反序列化回来了：");
            System.out.println("Name: " + fromRead.name);
            System.out.println("Address: " + fromRead.address);
            System.out.println("因为SSN属性被修饰为了transient，所以它的值没有被保存: " + fromRead.SSN);

            System.out.println("Number: " + fromRead.number);

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }

    }

}
