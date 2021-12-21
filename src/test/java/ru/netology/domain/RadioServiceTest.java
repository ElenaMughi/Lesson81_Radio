package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RadioServiceTest {
    @Test
    public void shouldCreateRadio() {
        RadioService myRadio = new RadioService(0, 1, 24);
        assertEquals(0, myRadio.getCurrentStation());
        assertEquals(1, myRadio.getCurrentVolume());
    }

    @Test
    public void shouldChangeStation() {
        RadioService myRadio = new RadioService(0, 1, 24);
        myRadio.setCurrentStation(0);
        myRadio.setCurrentStation(1);
        myRadio.setCurrentStation(23);
        myRadio.setCurrentStation(24);
        int i = -2;
        assertEquals(23, myRadio.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStation() {
        RadioService myRadio = new RadioService(0, 1, 24);
        myRadio.setCurrentStation(1);
        myRadio.prevStation();
        myRadio.prevStation();

        assertEquals(23, myRadio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStation() {
        RadioService myRadio = new RadioService(0, 1, 24);
        myRadio.setCurrentStation(23);
        myRadio.nextStation();
        myRadio.nextStation();

        assertEquals(1, myRadio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        RadioService myRadio = new RadioService();
        myRadio.setCurrentVolume(98);
        myRadio.increaseVolume();
        myRadio.increaseVolume();
        myRadio.increaseVolume();

        assertEquals(100, myRadio.getCurrentVolume());
    }

    @Test
    public void shouldLowerVolume() {
        RadioService myRadio = new RadioService();
        myRadio.setCurrentVolume(2);
        myRadio.lowerVolume();
        myRadio.lowerVolume();
        myRadio.lowerVolume();

        assertEquals(0, myRadio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolume() {
        RadioService myRadio = new RadioService();
        myRadio.setCurrentVolume(11);
        myRadio.setCurrentVolume(10);
        myRadio.setCurrentVolume(0);
        myRadio.setCurrentVolume(-1);

        assertEquals(0, myRadio.getCurrentVolume());
    }
}