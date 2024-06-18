import java.util.Scanner;

public class Voting_age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age: ");
        int a = input.nextInt();

        if(a > 18){
            System.out.println("Eligible to vote");
        }
        else if(a == 18){
            System.out.println("Eligible to vote age is 18");
        }
        else{
            System.out.println("Not eligible to vote");
        }
        input.close();
        
    }
}
