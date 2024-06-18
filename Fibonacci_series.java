import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value for n: ");
        int n = in.nextInt();

        int num1 = 0;
        int num2 = 1;

        System.out.println("Fibonacci series: ");
        for(int i = 0; i < n; i++){

            System.out.print(num1+" ");
            
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        in.close();
    }
}
