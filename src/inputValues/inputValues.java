package inputValues;

import java.util.Scanner;

public class inputValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        System.out.println(num);

//        float fl = input.nextFloat();
//        System.out.println(fl);

//        String str = input.next();
//        System.out.println(str);

//        String str = input.nextLine();
//        System.out.println(str);

        int i=10;
        System.out.println("input number: ");
        if(input.hasNextInt()){
            i = input.nextInt();
            System.out.println(i*3);
        } else {
            System.out.println("wrong value");
        }


    }
}
