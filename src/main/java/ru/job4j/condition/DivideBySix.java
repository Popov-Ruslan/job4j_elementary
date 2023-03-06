package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 2 == 0 && number % 3 == 0) {
            rsl = "The number divides by 6";
        } else if (number % 3 == 0) {
            rsl = "The number divides by 3, but it isn't even number";
        } else if (number % 2 == 0) {
            rsl = "The number doesn't divide by 3, but it is the even number";
        } else {
            rsl = "The number doesn't divide by 3 and it ins't even number";
        }
        return rsl;
    }
}
