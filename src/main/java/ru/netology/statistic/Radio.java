package ru.netology.statistic;

public class Radio {
    private int maxCurrentStation = 9;
    private int minCurrentStation = 0;
    private int currentRadioStation = minCurrentStation;
    private int maxCurrentVolume = 100;
    private int minCurrentVolume = 0;
    private int currentVolume = minCurrentVolume;
    private int numberOfRadioStation;

    public Radio(int numberOfRadioStation) {
        this.numberOfRadioStation = maxCurrentStation - 1;
    }

    public Radio() {
        this.numberOfRadioStation = 9;
    }

    public void next() {
        if (currentRadioStation != maxCurrentStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = minCurrentStation;
        }
    }

    public void prev() {
        if (currentRadioStation != minCurrentStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxCurrentStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume != maxCurrentVolume) {
            currentVolume++;
        } else {
            currentVolume = minCurrentVolume;
        }
    }

    public void reductionVolume() {
        if (currentVolume != minCurrentVolume) {
            currentVolume--;
        } else {
            currentVolume = maxCurrentVolume;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minCurrentStation) {
            return;
        }
        if (currentRadioStation > maxCurrentStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxCurrentVolume) {
            return;
        }
        if (currentVolume < minCurrentVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMaxCurrentStation() {
        return maxCurrentStation;
    }

    public int getMinCurrentStation() {
        return minCurrentStation;
    }

    public int getMaxCurrentVolume() {
        return maxCurrentVolume;
    }

    public int getMinCurrentVolume() {
        return minCurrentVolume;
    }
}
