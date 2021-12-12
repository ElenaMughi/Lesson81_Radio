package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RadioServiceTest {
    @Test
    public void shouldCreate() {
        RadioService myRadio = new RadioService();
        assertEquals(0, myRadio.getCurrentStation());
        assertEquals(1, myRadio.getCurrentVolume());
    }

    @Test
    public void shouldChangeStation() {
        RadioService myRadio = new RadioService();
        for (int i = 0; i <= 10; i++) {
            myRadio.setCurrentStation(i);
        }
        int i = -1;
        myRadio.setCurrentStation(i);
        assertEquals(9, myRadio.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStation() {
        RadioService myRadio = new RadioService();
        myRadio.setCurrentStation(2);
        for (int i = 1; i < 5; i++) {
            myRadio.prevStation();
        }
        assertEquals(8, myRadio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStation() {
        RadioService myRadio = new RadioService();
        myRadio.setCurrentStation(8);
        for (int i = 1; i < 5; i++) {
            myRadio.nextStation();
//            assertEquals(i, myRadio.getCurrentStation());
        }
        assertEquals(2, myRadio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        RadioService myRadio = new RadioService();
        for (int i = 0; i < 10; i++) {
            myRadio.increaseVolume();
        }
        assertEquals(10, myRadio.getCurrentVolume());
    }

    @Test
    public void shouldLowerVolume() {
        RadioService myRadio = new RadioService();
        myRadio.setCurrentVolume(10);
        for (int i = 10; i >= 0; i--) {
            myRadio.lowerVolume();
        }
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