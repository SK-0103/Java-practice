import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;
        while(true){
            System.out.print("Enter the Operator (+ , - , * , /) or to exit the program use (x): ");
            char op = in.next().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/'){

                System.out.print("Enter the first number: ");
                int a = in.nextInt();

                System.out.print("Enter the Second Number: ");
                int b = in.nextInt();

                if(op=='+'){
                    ans = a+b;
                }
                
                if(op=='-'){
                    ans = a-b;
                }
                
                if(op=='*'){
                    ans = a*b;
                }
                
                if(op=='/'){
                    if(b>a){
                    ans = a/b;
                    }
                    else{
                        ans = b/a;
                    }
                }
            }
            else if(op == 'x'){
                break;
            }
            else{
                System.out.println("Invalid Operator");
            }
            System.out.println("your answer is: "+ans);
        }
        in.close();        
    }
}
