package DataTypesAndVariables_Lab_02;

import java.util.Scanner;

public class ConvertMetersToKilometers_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());

        double kilometers = meters * 1.0 / 1000;
        System.out.printf("%.2f", kilometers);
    }
}