import java.util.Scanner;

public class type_conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float num = input.nextFloat();
        System.out.println("float value: "+num);

        //TYPE CONVERSION
        int a = (int)(num);
        System.out.println("float to int: "+a);

        input.close();
    }
}
