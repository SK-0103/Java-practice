import java.util.Scanner;
public class primitive {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            int a = input.nextInt();
            System.out.println("integer: " + a);

            char b ='r';
            System.out.println("char: "+b);

            float c = 98.65f;
            System.out.println("float: "+c);
            
            double d = 2131313.2131;
            System.out.println("double: "+d);
            
            long e = 12313123123123L;
            System.out.println("long: "+e);

            String name = input.next();
            System.out.println("your name: " +name);
            input.close();
        }
}
