package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    // тесты переключения станций
    @Test
    public void getCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(7);
        int expected = 7;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation2() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation3() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void next() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);
        rad.next();
        int expected = 6;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void next2() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.next();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prev() {
        Radio rad = new Radio();
        rad.setCurrentStation(3);
        rad.prev();
        int expected = 2;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prev2() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prev();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void getCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void forward() {
        Radio radio = new Radio();
        radio.setCurrentVolume(28);
        radio.forward();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void forward2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.forward();
        int expected = 3;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void back() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.back();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void back2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.back();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}