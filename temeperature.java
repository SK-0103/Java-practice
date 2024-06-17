import java.util.Scanner;

public class temeperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input temperature in celsius: ");
        float tempC = input.nextFloat();

        float tempf = (tempC * 9/5)+32;
        System.out.println("Temperature in Fahrenheit: "+tempf );

        input.close();
    }
}
