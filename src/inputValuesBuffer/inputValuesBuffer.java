package inputValuesBuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputValuesBuffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        System.out.println(str);
        InputStreamReader isr = new InputStreamReader(System.in);
        while (true){
            int byteValue = System.in.read();
            System.out.println(byteValue);
        }
    }
}
