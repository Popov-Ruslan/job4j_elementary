package ru.job4j.loop;

public class Fitness {
    /**
     * метод описывает, сколько месяцев понадобится Ивану, чтобы обогнать в поднимаемом весе Николая,
     * учитывая, что в месяц Иван прогрессирует в 3 раза, а Николай - в 2.
     * @param ivan исходный поднимаемый вес Ивана
     * @param nik исходный поднимаемый вес Николая
     * @return {@code int} количество месяцев
     */
    public static int calc(int ivan, int nik) {
        int months = 0;
        while (ivan <= nik) {
            ivan *= 3;
            nik *= 2;
            months += 1;
        }
        return months;
    }
}
