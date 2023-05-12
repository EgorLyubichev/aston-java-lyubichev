package by.lev;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ViacheslavGreeting {
    public static void sayHelloViacheslav(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        if (isViacheslav(input)){
            System.out.println("Привет, Вячеслав");
        }else {
            System.out.println("Нет такого имени");
        }
    }

    private static boolean isViacheslav(String line){
        Pattern pattern = Pattern.compile("^Вячеслав");
        Matcher matcher = pattern.matcher(line);
        return matcher.matches();
    }
}
