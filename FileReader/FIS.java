package JavaIO.FileReader;

import java.io.FileInputStream;
import java.io.FileReader;

public class FIS {
    public static void main(String[] args) throws Exception {
        FileReader fis = new FileReader("E:/Coding/FJWP/ClassCodes/src/MultiThreading/DeadLock/Resource.java");
        int i;
        while ((i=fis.read())!=-1){
            System.out.print((char)i);
        }
    }
}
