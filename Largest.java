import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter thre integers: ");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;

        if(max<b){
            max =b;
        }
        if(max<c){
            max = c;
        }
        System.out.println("Maximum number is: "+max);
        
        input.close();
    }
}
