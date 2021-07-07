import java.util.Scanner;

public class CelsiustoFahrenheit {
    public static void main(String[] args) {
        double temperature;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter temperature in Celcius :");
        temperature = in.nextDouble();

        temperature = (temperature * 9 / 5.0) + 32;
        System.out.println("Temperature in Fahrenheit = " + temperature);
    }
}
