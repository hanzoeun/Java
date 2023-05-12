package test__sec01;

public class Test_sec11 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte) ((byte)a + b);

        char ch = 'A';
        ch = (char) ((char)ch + 2);

        float f = 3 / 2.0F;
        long l = 3000L * 3000L * 3000L;
        float f2 = 0.1f;

        double d = 0.1f;
        boolean result = d==f2;

        System.out.println("c="+c);
        System.out.println("ch="+ch);
        System.out.println("f="+f);
        System.out.println("l="+l);
        System.out.println("result="+result);
     }


}
