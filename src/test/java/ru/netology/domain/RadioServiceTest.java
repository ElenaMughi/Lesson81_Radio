package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RadioServiceTest {
    @Test
    public void shouldCreateRadio() {
        RadioService myRadio = new RadioService(24);
        assertEquals(0, myRadio.getCurrentStation());
        assertEquals(1, myRadio.getCurrentVolume());
    }

    @Test
    public void shouldChangeStation() {
        int j = 24;
        RadioService myRadio = new RadioService(j);
        for (int i = 0; i < j; i++) {
            myRadio.setCurrentStation(i);
        }
        int i = -2;
        myRadio.setCurrentStation(i);
        assertEquals(23, myRadio.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStation() {
        RadioService myRadio = new RadioService(24);
        myRadio.setCurrentStation(2);
        for (int i = 1; i < 5; i++) {
            myRadio.prevStation();
        }
        assertEquals(22, myRadio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStation() {
        RadioService myRadio = new RadioService(24);
        myRadio.setCurrentStation(22);
        for (int i = 1; i < 5; i++) {
            myRadio.nextStation();
//            assertEquals(i, myRadio.getCurrentStation());
        }
        assertEquals(2, myRadio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        RadioService myRadio = new RadioService(15);
        for (int i = 0; i < 100; i++) {
            myRadio.increaseVolume();
        }
        assertEquals(100, myRadio.getCurrentVolume());
    }

    @Test
    public void shouldLowerVolume() {
        RadioService myRadio = new RadioService(15);
        myRadio.setCurrentVolume(100);
        for (int i = 100; i >= 0; i--) {
            myRadio.lowerVolume();
        }
        assertEquals(0, myRadio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolume() {
        RadioService myRadio = new RadioService(15);
        myRadio.setCurrentVolume(11);
        myRadio.setCurrentVolume(10);
        myRadio.setCurrentVolume(0);
        myRadio.setCurrentVolume(-1);
        assertEquals(0, myRadio.getCurrentVolume());
    }
}