package Introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

    static byte H;
    static byte B;
    static boolean flag;

    static {
        Scanner sc = new Scanner(System.in);
        JavaStaticInitializerBlock.H = sc.nextByte();
        JavaStaticInitializerBlock.B = sc.nextByte();
        if (H <= 0 || B <= 0) {
            JavaStaticInitializerBlock.flag = true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            if (JavaStaticInitializerBlock.flag) {
                throw new Exception("Breadth and height must be positive");
            }
            System.out.println(JavaStaticInitializerBlock.H*JavaStaticInitializerBlock.B);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
