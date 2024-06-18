import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Input Amount: ");
        int a = input.nextInt();

        if(a>=10000){
            System.out.println("Salary is greater than 10,000");

        }
        else{
            System.out.println("Salary is less than 10,000");
        }
        input.close();
    }
}
