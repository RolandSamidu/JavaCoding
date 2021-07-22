import java.util.Scanner;

public class TempertaureCalculate{
    int var;
    double c, f, k;
    double tempertaure;

    public static void main(String[] args) {
        F2 cf = new F2();
        cf.option();
    }

    public void option() {
        Scanner in = new Scanner(System.in);
        System.out.println(
                "Select the your choice \n1:Convert C to F \n2:Convert F to C \n3:Convert C to K \n4:Convert K to C");

        var = in.nextInt();
        Tempo t1 = new Tempo();

        if (var == 1) {
            System.out.println("Enter temperature in Celcius :");
            c = in.nextDouble();
            t1.celcius(c);
            option();
        }

        else if (var == 2) {
            System.out.println("Enter temperature in Fahrenheit :");
            f = in.nextDouble();
            t1.fahrenhiet(f);
            option();
        }

        else if (var == 3) {
            System.out.println("Enter temperature in Celcius :");
            c = in.nextDouble();
            t1.kelvin(c);
            option();
        }

        else if (var == 4) {
            System.out.println("Enter temperature in Kelvin :");
            k = in.nextDouble();
            t1.kelvin_2(k);
            option();
        }
    }
}

class Tempo {
    public void celcius(double c) {
        double temperature = 0d;
        temperature = (c * 9 / 5.0) + 32;
        System.out.println("Temperature in Fahrenheit = " + temperature);
    }

    public void fahrenhiet(double f) {
        double temperature = 0d;
        temperature = (f - 32) * (5.0 / 9.0);
        System.out.println("Temperature in Celcius = " + temperature);
    }

    public void kelvin(double c) {
        double temperature = 0d;
        temperature = c + 273.15;
        System.out.println("Temperature in Kelvin = " + temperature);
    }

    public void kelvin_2(double k) {
        double temperature = 0d;
        temperature = k - 273.15;
        System.out.println("Temperature in Celcius = " + temperature);
    }
}
