import java.util.Scanner;

public class TemperatureCalculate {
    int var;
    double c, f, k;

    public static void main(String[] args) {
        TemperatureCalculate tc = new TemperatureCalculate(); // Instantiate the correct class
        tc.option(); // Call the option method on the correct instance
    }

    public void option() {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println(
                "Select your choice \n1:Convert C to F \n2:Convert F to C \n3:Convert C to K \n4:Convert K to C");

        var = in.nextInt();
        Tempo t1 = new Tempo();

        if (var == 1) {
            System.out.println("Enter temperature in Celsius :");
            c = in.nextDouble();
            t1.celsiusToFahrenheit(c);
            option();
        } else if (var == 2) {
            System.out.println("Enter temperature in Fahrenheit :");
            f = in.nextDouble();
            t1.fahrenheitToCelsius(f);
            option();
        } else if (var == 3) {
            System.out.println("Enter temperature in Celsius :");
            c = in.nextDouble();
            t1.celsiusToKelvin(c);
            option();
        } else if (var == 4) {
            System.out.println("Enter temperature in Kelvin :");
            k = in.nextDouble();
            t1.kelvinToCelsius(k);
            option();
        } else {
            System.out.println("Invalid option, please try again.");
            option();
        }
    }
}

class Tempo {
    public void celsiusToFahrenheit(double c) {
        double temperature = (c * 9 / 5.0) + 32;
        System.out.println("Temperature in Fahrenheit = " + temperature);
    }

    public void fahrenheitToCelsius(double f) {
        double temperature = (f - 32) * (5.0 / 9.0);
        System.out.println("Temperature in Celsius = " + temperature);
    }

    public void celsiusToKelvin(double c) {
        double temperature = c + 273.15;
        System.out.println("Temperature in Kelvin = " + temperature);
    }

    public void kelvinToCelsius(double k) {
        double temperature = k - 273.15;
        System.out.println("Temperature in Celsius = " + temperature);
    }
}
