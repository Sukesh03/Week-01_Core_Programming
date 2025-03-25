import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        int option = sc.nextInt();

        System.out.print("Enter the temperature: ");
        double temperature = sc.nextDouble();

        if (option == 1) {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.printf("%.2f°C = %.2f°F\n", temperature, fahrenheit);
        } else if (option == 2) {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.printf("%.2f°F = %.2f°C\n", temperature, celsius);
        } else {
            System.out.println("Invalid option. Please choose 1 or 2.");
        }
    }

    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
