import java.util.Scanner;

public class Sum_function {
    public static void main(String[] args) {
        sum();
    }

    static void sum(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        int a = in.nextInt();

        System.out.print("Enter second Number: ");
        int b = in.nextInt();

        int ans = a+b;

        System.out.println("Answer = "+ans);
    }
}
