import java.io.*;
import java.util.Arrays;

public class FilesTest {

    public static void writeRead(){
        try{
            byte[] bs = new byte[]{1, 2, 3, 4, 5};
            OutputStream out = new FileOutputStream("D:/shit.txt");
            for(byte x:bs){
                out.write(x);
            }
            out.close();

            InputStream in = new FileInputStream("D:/shit.txt");
            int size = in.available(); // 返回从该输入流中可以读取（或跳过）的字节数的估计值

        }catch (IOException e){
            System.out.println("发生了IO异常！");
        }

    }

    public static void createDir(String dirname){
        File dir = new File(dirname);

        if(dir.mkdir()){
            System.out.println("使用mkdir: 文件夹创建成功！");
        }else{
            System.out.println("使用mkdir: 文件夹创建失败！");
        }

        if(dir.mkdirs()){
            System.out.println("使用mkdirs: 文件夹创建成功！makdirs还是牛蛙！");
        }else {
            System.out.println("使用mkdirs: 文件夹创建失败！可能是因为该文件夹已经存在");
        }

        File dirtest1 = new File(dirname + '/' + "test1");
        if(dirtest1.mkdirs()){
            System.out.println(dirtest1 + " 创建成功");
        }else{
            System.out.println(dirtest1 + " 创建失败");
        }

        File text = new File(dirname + '/' + "text.txt");
        try {
            if(text.createNewFile()){
                System.out.println(text + " 创建成功");
            }else{
                System.out.println(text + " 创建失败");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 在调用完createDir()之后才可以调用
    public static void readDir(String dirname){

        System.out.println("下面来查看一下 " + dirname);
        File dir = new File(dirname);
        if(dir.isDirectory()){
            System.out.println("dirname" + " 是一个目录");
            String[] ds = dir.list();
            System.out.println("用ls查看一下 " + dir + " : " + Arrays.toString(ds));
            for(String s: ds){
                File sub = new File(dirname + '/' + s);
                if(sub.isDirectory()){
                    System.out.println(s + " 是一个目录");
                }else{
                    System.out.println(s + " 是一个文件");
                }
            }
        }else{
            System.out.println(dirname + " 不是一个目录");
        }
    }

    public static void deleteFolder(File folder){
        File[] files = folder.listFiles();
        System.out.println(folder + " 下的目录或文件" + Arrays.toString(files));
        if(files != null) {
            for (File x : files) {
                if (x.isDirectory()) {
                    deleteFolder(x);
                } else {
                    if(x.delete()){
                        System.out.println(x + " 成功删除");
                    }else{
                        System.out.println(x + " 删除失败");
                    };
                }
            }
        }
        if(folder.delete()){
            System.out.println(folder + " 成功删除");
        }else {
            System.out.println(folder + " 删除失败");
        };
    }

    public static void outerDelete(String dirname){
        File dir = new File(dirname);
        deleteFolder(dir);

    }

    // 练习创建、读取和删除文件夹或者目录
    public static void createReadDelete(){
        String dirPath = "D:/test";
        createDir(dirPath);
        System.out.println();
        readDir(dirPath);
        outerDelete(dirPath);
    }

    public static void main(String[] args) {

        // writeRead();
        createReadDelete();
    }


}
