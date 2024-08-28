package JavaIO.FileInputStream;

import java.io.FileOutputStream;

public class FOS {
    public static void main(String[] args) throws Exception {
        String data = "Amit Singh";
        FileOutputStream fos = new FileOutputStream("E:/Coding/FJWP/ClassCodes/src/JavaIO/JavaIODemo.txt",true);

        byte[] b = data.getBytes();
        fos.write(b);
        fos.close();
    }
}
