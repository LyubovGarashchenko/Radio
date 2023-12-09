package ru.netology.statistic;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxCurrentStation;

    public Radio() {
    }

    public Radio(int currentRadioStation, int currentVolume, int maxCurrentStation) {
        this.currentRadioStation = currentRadioStation;
        this.currentVolume = currentVolume;
        this.maxCurrentStation = maxCurrentStation;
    }

    public int getCurrentRadioStation() {
        return this.currentRadioStation;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public int getMaxCurrentStation() {
        return this.maxCurrentStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setMaxCurrentStation(int maxCurrentStation) {
        this.maxCurrentStation = maxCurrentStation;
    }
}
