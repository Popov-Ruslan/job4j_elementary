package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {
    @Test
    public void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean exist = Triangle.exist(ab, ac, bc);
        assertThat(exist).isTrue();
    }

    @Test
    public void whenNotExist() {
        double ab = 4.0;
        double ac = 1.0;
        double bc = 2.0;
        boolean exist = Triangle.exist(ab, ac, bc);
        assertThat(exist).isFalse();
    }
}