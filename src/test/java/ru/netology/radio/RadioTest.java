package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void getCurrentStation() {
        Radio radio = new Radio();


        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }
    @Test
    public void setCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);


    }

}
