package ru.netology.radio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void getCurrentStation() {
        Radio radio = new Radio();


        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }

//    @Test
//    public void shouldSetCurrentStation() {
//        Radio radio = new Radio();
//        int i = 8;
//        radio.setCurrentStation(i);
//
//        int expected = 8;
//        int actual = radio.getCurrentStation();
//
//        assertEquals(expected, actual);


    @ParameterizedTest
    @CsvSource(value = {
            "'number lower range',-5,0",
            "'number near lower limit1',-1,0",
            "'number = lower limit',0,0",
            "'number near lower limit2',1,1",
            "'number within range',5,5",
            "'number near upper limit1',8,8",
            "'number = upper limit',9,9",
            "'number near upper limit2',10,0",
            "'number upper range',15,0"
    })

    public void shouldSetCurrentStation(String testName, int newStation, int expected) {
        Radio radio = new Radio();

        radio.setCurrentStation(newStation);


        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }

}
