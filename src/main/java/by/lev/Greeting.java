package by.lev;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Greeting {

    public static void sayHello(){
        try {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number > 7) {
                System.out.println("Привет");
            }
        } catch (InputMismatchException e) {

        }
    }
}
