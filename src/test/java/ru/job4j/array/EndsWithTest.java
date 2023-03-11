package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EndsWithTest {
    @Test
    public void whenEndsWithPostfixWhenTrue() {
        char[] word = "Job4j".toCharArray();
        char[] post = "b4j".toCharArray();
        boolean rst = EndsWith.endsWith(word, post);
        assertThat(rst).isTrue();
    }

    @Test
    public void whenNotEndsWithPostfixThenFalse() {
        char[] word = "Job4j".toCharArray();
        char[] post = "b4b".toCharArray();
        boolean rst = EndsWith.endsWith(word, post);
        assertThat(rst).isFalse();
    }
}