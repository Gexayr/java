package terner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Terner {
    public static void main(String[] args) throws IOException {
//        int a = 1, b = 2, c = 0;
//        c = (a > b) ? a : b;
//        c = a > b ? a : b;

//        c = a++ >= b ? a : b;
//        System.out.println(c);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter login: ");

        String login = br.readLine();

        System.out.println("Input password, more than 3 symbols: ");
        String psw = br.readLine();

        String result = login.equals("Admin")
                ? (psw.length() > 3)
                    ? "You are welcome, " + login + "!"
                    : "Hello " + login + " Your password wrong!"
                :  (psw.length() > 3)
                    ? "You are welcome, " + login + "!"
                    : login + " Your password wrong!";
        System.out.println(result);
    }
}
