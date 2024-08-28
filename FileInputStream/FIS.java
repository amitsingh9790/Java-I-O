package JavaIO.FileInputStream;

import java.io.FileInputStream;

public class FIS {
    public static void main(String[] args) throws Exception {
        try(FileInputStream fis = new FileInputStream("E:/Coding/FJWP/ClassCodes/src/MultiThreading/DeadLock/Resource.java"))
        {
            int i ;
            while ((i=fis.read())!= -1) {
                System.out.print((char) i);
            }
            System.out.println();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
