import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a String: ");
        String a = input.nextLine();

        for(int i =1; i<=5;i++){
            System.out.println(a);
        }
        input.close();
    }
}
