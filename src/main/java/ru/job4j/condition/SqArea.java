package ru.job4j.condition;

public class SqArea {

    /**
     * returns area of rectangle with known perimeter and coefficient that determines
     * how many times length of rectangle more than its height.
     * <p>s - square, l - length, h - height, k - coefficient, p - perimeter
     * <p>s = l * h
     * <p>l = h * k
     * <p>p = 2 * (l + h)
     * <p>lets find height with the help of an equation
     * <p>l + h = p / 2,
     * <p>k * h + h = p / 2,
     * <p>h * (k + 1) = p / 2,
     * <p>h = (p / 2) / (k + 1),
     * <p>h = p / (2k + 2)
     * @param p perimeter of rectangle
     * @param k coefficient
     * @return {@code double} area of rectangle
     */
    public static double square(double p, double k) {
        double h = p / (2 * k + 2);
        double w = k * h;
        double s = w * h;
        return s;
    }

    public static void main(String[] arguments) {
        double result2 = square(6, 2);
        System.out.println("p = 6, k = 2, s = 2, real = " + result2);
        double result = square(4, 1);
        System.out.println("p = 4, k = 1, s = 1, real = " + result);
        double result3 = square(30, 4);
        System.out.println("p = 30, k = 4, s = 36, real = " + result3);
    }
}
