package Casting;

public class Cast {
    public static void main(String[] args) {
        byte b = 10;
        int i = b;
        int i2 = 10;
        byte b2 = (byte) i2;
        System.out.println(i);
        System.out.println(b2);

        int i3 = 200;
        byte b3 = (byte) i3;
        System.out.println(b3);
        int i4 = 256;
        byte b4 = (byte) i4;
        System.out.println(b4);

        double d = 22.89;
        int i5 = (int) d;
        int i6 = (int) Math.round(d);
        System.out.println(i5);
        System.out.println(i6);

    }
}
