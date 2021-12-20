package ru.netology.domain;

public class RadioService {
    private int currentStation = 0;
    private int currentVolume = 1;
    private int quantityOfStation = 10;

    public RadioService(int quantityOfStation) {
        this.quantityOfStation = quantityOfStation;
    }

    //    public RadioService() {}

    public int getCurrentStation() {
        return this.currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        int i = this.quantityOfStation - 1;
        if ((0 <= currentStation) && (currentStation <= i))
            this.currentStation = currentStation;
        else System.out.println("Неверный номер станции - " + currentStation);

    }

    public void setCurrentVolume(int currentVolume) {
        if ((0 <= currentVolume) && (currentVolume <= 100)) {
            this.currentVolume = currentVolume;
        } else {
            System.out.println("Неверный уровень громкости - " + currentVolume);
        }
    }

    public void nextStation() {
        if (currentStation == this.quantityOfStation-1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = this.quantityOfStation-1;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
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
