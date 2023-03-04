package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "I don't know. Please ask another question.";
        if ("Hi, bot".equals(question)) {
            rsl = "Hi, smartass";
        } else if ("Bye".equals(question)) {
            rsl = "See you later";
        }
        return rsl;
    }

    public static void main(String[] arguments) {
        String rsl = answer("Hi, bot");
        System.out.println(rsl);
        rsl = answer("Bye");
        System.out.println(rsl);
    }
}
