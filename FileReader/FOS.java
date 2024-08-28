package JavaIO.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FOS {
    public static void main(String[] args) throws IOException {
        String data = "Amit Singh";
        FileWriter fos = new FileWriter("E:/Coding/FJWP/ClassCodes/src/JavaIO/JavaIODemo.txt");

        byte[] b = data.getBytes();
        fos.write(Arrays.toString(b));
        fos.close();
    }
}
