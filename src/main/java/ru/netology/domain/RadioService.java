package ru.netology.domain;

public class RadioService {
    private int currentStation = 0;
    private int currentVolume = 1;

    public int getCurrentStation() {
        return this.currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if ((0 <= currentStation) && (currentStation <= 9)) {
            this.currentStation = currentStation;
        } else {
            System.out.println("Неверный номер станции - " + currentStation);
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if ((0 <= currentVolume) && (currentVolume <= 10)) {
            this.currentVolume = currentVolume;
        } else {
            System.out.println("Неверный уровень громкости - " + currentVolume);
        }
    }

    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            System.out.println("Максимальное значение звука");
        }
    }

    public void lowerVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            System.out.println("Минимальное значение звука");
        }
    }


}
