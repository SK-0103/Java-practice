import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Fruit name(Mango,Apple,Orange):");
        String fruit = in.nextLine();

        switch (fruit) {
            case "Mango":
                System.out.println("King of Fruits");
                break;

            case "Apple":
                System.out.println("A red fruit");
                break;
            case "Orange":
                System.out.println("A tangy flavoured fruit");
                break;
            default:
                System.out.println("Choose fruit name from the list");
                break;
        }
        in.close();
    }
}
