package ru.job4j.condition;

public class SqArea {

    /**
     * returns area of rectangle with known perimeter and coefficient that determines
     * how many times length of rectangle more than its height.
     * s - square, l - length, h - height, k - coefficient, p - perimeter
     * s = l * h
     * l = h * k
     * p = 2 * (l + h)
     * lets find height with the help of an equation
     * l + h = p / 2,
     * k * h + h = p / 2,
     * h * (k + 1) = p / 2,
     * h = (p / 2) / (k + 1),
     * h = p / (2k + 2), therefore
     * s = (p / (2k + 2)) ^ 2 * k
     * @param p perimeter of rectangle
     * @param k coefficient
     * @return {@code double} area of rectangle
     */
    public static double square(double p, double k) {
        return Math.pow((p / (2 * k + 2)), 2) * k;
    }

    public static void main(String[] arguments) {
        double result = square(4, 1);
        System.out.println("p = 4, k = 1, s = 1, real = " + result);
        double result2 = square(6, 2);
        System.out.println("p = 6, k = 2, s = 2, real = " + result2);
        double result3 = square(30, 4);
        System.out.println("p = 30, k = 4, s = 36, real = " + result3);
    }
}
