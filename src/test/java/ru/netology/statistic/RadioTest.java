package ru.netology.statistic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    public class Radio {
        private int currentRadioStation;
        private int currentVolume;
        private int maxCurrentStation;


    public Radio(int currentRadioStation, int currentVolume, int maxCurrentStation) {
        this.currentRadioStation = currentRadioStation;
        this.currentVolume = currentVolume;
        this.maxCurrentStation = maxCurrentStation;
    }
    public Radio() {
        this.maxCurrentStation = 9;
    }
    public Radio(int numberOfRadioStation) {
        this.maxCurrentStation = numberOfRadioStation - 1;
    }

    public void next() {
        if (currentRadioStation != maxCurrentStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation != 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxCurrentStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume++;
        } else {
            currentVolume = 0;
        }
    }

    public void reductionVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 100;
        }
    }

    public int getMinCurrentStation() {
        return 0;
    }

    public int getMaxCurrentVolume() {
        return 100;
    }

    public int getMinCurrentVolume() {
        return 0;
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

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Radio)) {
            return false;
        } else {
            Radio other = (Radio)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getCurrentRadioStation() != other.getCurrentRadioStation()) {
                return false;
            } else if (this.getCurrentVolume() != other.getCurrentVolume()) {
                return false;
            } else {
                return this.getMaxCurrentStation() == other.getMaxCurrentStation();
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Radio;
    }

    public int hashCode() {
        boolean prime = true;
        int result = 1;
        result = result * 59 + this.getCurrentRadioStation();
        result = result * 59 + this.getCurrentVolume();
        result = result * 59 + this.getMaxCurrentStation();
        return result;
    }

    public String toString() {
        int var10000 = this.getCurrentRadioStation();
        return "Radio(currentRadioStation=" + var10000 + ", currentVolume=" + this.getCurrentVolume() + ", maxCurrentStation=" + this.getMaxCurrentStation() + ")";
    }
}
