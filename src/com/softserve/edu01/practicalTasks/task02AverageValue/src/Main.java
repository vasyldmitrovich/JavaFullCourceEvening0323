import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader numberReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input first number:");
        double number1 = Double.parseDouble(numberReader.readLine());

        System.out.println("Input second number:");
        double number2 = Double.parseDouble(numberReader.readLine());

        System.out.println("Input tgird number:");
        double number3 = Double.parseDouble(numberReader.readLine());

        double averageValue = (number1 + number2 + number3) / 3;
        System.out.println("Average is: " + averageValue);
    }
}
