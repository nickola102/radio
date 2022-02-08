package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void test (){
        Radio radio = new Radio();


        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }
}