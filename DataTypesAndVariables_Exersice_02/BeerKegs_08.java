package DataTypesAndVariables_Exersice_02;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int kegs = Integer.parseInt(scanner.nextLine());

        double maxVolume = Double.MIN_VALUE;
        String maxModel = "";

        for (int countKegs = 1; countKegs <= kegs; countKegs++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;
            if (volume > maxVolume){
                maxVolume = volume;
                maxModel = model;
            }
        }
        System.out.println(maxModel);
    }
}
