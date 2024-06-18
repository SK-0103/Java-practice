import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        if(ch>='a' && ch<='z'){
            System.out.println(ch+" is lower case");
        }
        else{
            System.out.println(ch+" is Upper case");
        }
        input.close();
    }
}
