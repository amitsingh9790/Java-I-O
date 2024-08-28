package JavaIO.FileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWriteDemo {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("E:/Coding/FJWP/ClassCodes/src/MultiThreading/DeadLock/Resource.java");
        FileOutputStream fos = new FileOutputStream("E:/Coding/FJWP/ClassCodes/src/JavaIO/JavaIODemo.txt",true);

        int i;
        while ((i=fis.read())!=-1){
            fos.write((char)i);
        }
    }
}
