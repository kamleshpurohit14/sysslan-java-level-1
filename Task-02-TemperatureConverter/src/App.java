import java.util.Scanner;
public class App {

    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter temperature");
        double temperature = scanner.nextDouble();

        System.out.println("Enter source unit (C/F/K)"); 
        char fromUnit = scanner.next().charAt(0);
        
        System.out.println("Enter target unit (C/F/K)");
        char toUnit = scanner.next().charAt(0);
        
        double result = convertTemperature(temperature, fromUnit, toUnit);
              
        if (result == Double.MIN_VALUE) {
            System.out.println("Invalid Unit Conversion!");
        } else {
            System.out.println("Converted Temperature: " + result + " " + toUnit);
        }

        scanner.close();
    }

    public static double convertTemperature(double temperature, char fromUnit, char toUnit) {

        if (fromUnit == toUnit) {
            return temperature;
        }

        if (fromUnit == 'C' && toUnit == 'F') {
            return (temperature * 9 / 5) + 32;
        }

        if (fromUnit == 'C' && toUnit == 'K') {
            return temperature + 273.15;
        }

        if (fromUnit == 'F' && toUnit == 'C') {
            return (temperature - 32) * 5 / 9;
        }

        if (fromUnit == 'F' && toUnit == 'K') {
            return (temperature - 32) * 5 / 9 + 273.15;
        }

        if (fromUnit == 'K' && toUnit == 'C') {
            return temperature - 273.15;
        }

        if (fromUnit == 'K' && toUnit == 'F') {
            return (temperature - 273.15) * 9 / 5 + 32;
        }

        return Double.MIN_VALUE;

    }

}