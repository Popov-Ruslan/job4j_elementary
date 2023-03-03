package ru.job4j.condition;

public class Tour {
    public static void offer(boolean hasForeignPassport) {
        System.out.println("A client has foreign passport: " + hasForeignPassport);
        if (hasForeignPassport) {
            System.out.println("Tours abroad");
        } else {
            System.out.println("Tours in Russia");
        }
    }

    public static void main(String[] args) {
        offer(true);
        offer(false);
    }
}
