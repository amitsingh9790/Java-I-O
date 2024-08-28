package JavaIO.Console;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter Email: ");
        String email = c.readLine();

        System.out.println("Enter password: ");
        char[] pass = c.readPassword();
        String password = new String(pass);

        System.out.println("Email:"+email);
        System.out.println("Password:"+password);
    }
}
