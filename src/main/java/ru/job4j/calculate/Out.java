package ru.job4j.calculate;

public class Out {
    public static void main(String[] arguments) {
        String lyrics = "Мама мыла раму";
        System.out.println(lyrics);
        String name = "Ruslan";
        String surname = "Popov";
        String delimiter = " ";
        String id = name + delimiter + surname;
        System.out.println(id);
        byte age = 35;
        String separator = " - ";
        String id2 = name + separator + age + " years old";
        System.out.println(id2);
        int first = 1;
        int second = 2;
        int onePlusTwo = first + second;
        System.out.println("first + second = " + onePlusTwo);
        String label = "I ";
        label = label + "like ";
        label += "Java!";
        System.out.println(label);
    }
}
