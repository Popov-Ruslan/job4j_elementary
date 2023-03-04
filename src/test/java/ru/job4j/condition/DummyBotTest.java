package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DummyBotTest {
    @Test
    public void whenGreetBot() {
        String in = "Hi, bot";
        String rsl = DummyBot.answer(in);
        String expected = "Hi, smartass";
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenByeBot() {
        String in = "Bye";
        String rsl = DummyBot.answer(in);
        String expected = "See you later";
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenUnknownBot() {
        String in = "Can you add two plus two?";
        String rsl = DummyBot.answer(in);
        String expected = "I don't know. Please ask another question.";
        assertThat(rsl).isEqualTo(expected);
    }
}