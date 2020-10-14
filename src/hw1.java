import java.util.Scanner;

public class hw1 {
        //1
        public static void main(String[] args) {
            //2
            char ch='x';
            byte by= 127;
            short s=2^15;
            int i=2^31, a,b,c,d;
            long l=2^63;
            float f=3.14f;
            double dou =3.14;
            boolean bo=true;
            String name = "Eugene";
            //3
            Scanner in = new Scanner(System.in);
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            d = in.nextInt();

            System.out.println(math(a,b,c,d));

            //4
            System.out.println(twoNumbers(a,b));

            //5
            positiveOrNegative(a);

            //6
            System.out.println(isNegative(a));

            //7
            helloTo(name);

            //8
            int year = in.nextInt();
            in.close();
            isVisokosnii(year);
        }
        public static int math(int a, int b, int c, int d) {
            return a*(b+(c/d));
        }
        public static boolean twoNumbers(int a, int b){
            if (a+b >= 10 && a+b <= 20) return true; else return false;
        }
        public static void positiveOrNegative(int a){
            if (a>= 0) System.out.println("Positive"); else System.out.println("Negative");
        }
        public static boolean isNegative(int a){
            if(a <0) return true;
            return false;
        }
        public static void helloTo(String name){
            System.out.println("Hello, " + name);
        }
        public static void isVisokosnii(int year){
            if (year % 100 == 0 && year % 400 ==0) {
                System.out.println(year + " Високосный");
            } else if (year % 4 == 0) System.out.println(year + " Високосный");
            else System.out.println(year + " Невисокосный");
        }
}
