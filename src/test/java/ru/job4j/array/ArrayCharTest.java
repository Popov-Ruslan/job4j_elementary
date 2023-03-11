package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayCharTest {
    @Test
    public void whenJob4jStartsWithJobThenTrue() {
        char[] word = "Job4j".toCharArray();
        char[] pref = "Job".toCharArray();
        boolean rst = ArrayChar.startsWith(word, pref);
        assertThat(rst).isTrue();
    }

    @Test
    public void whenJob4jStartsWithBobThenFalse() {
        char[] word = "Job4j".toCharArray();
        char[] pref = "Bob".toCharArray();
        boolean rst = ArrayChar.startsWith(word, pref);
        assertThat(rst).isFalse();
    }
}