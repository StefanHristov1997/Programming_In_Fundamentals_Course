package Arrays_Lab_03;

import java.util.Scanner;

public class ReverseAnArrayOfStrings_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        for (int i = 0; i < inputArr.length / 2; i++) {
            String oldElement = inputArr[i];
            inputArr[i] = inputArr[inputArr.length - 1 - i];
            inputArr[inputArr.length - 1 - i] = oldElement;
        }
        //  for (int i = 0; i < inputArr.length ; i++) {
        //    System.out.printf("%s ", inputArr[i]);
        // }

        System.out.println(String.join(" ", inputArr));
    }
}
