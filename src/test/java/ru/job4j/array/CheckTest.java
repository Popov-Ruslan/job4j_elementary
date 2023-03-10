package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CheckTest {
    @Test
    public void whenDifferent() {
        boolean[] data = {true, false, false, true, true};
        boolean rst = Check.mono(data);
        assertThat(rst).isFalse();
    }

    @Test
    public void whenAllSame() {
        boolean[] data = {false, false, false, false};
        boolean rst = Check.mono(data);
        assertThat(rst).isTrue();
    }

}