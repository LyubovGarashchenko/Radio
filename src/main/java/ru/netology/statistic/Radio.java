//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ru.netology.statistic;

public class Radio {
    private int maxCurrentStation = 9;
    private int minCurrentStation = 0;
    private int currentRadioStation;
    private int maxCurrentVolume;
    private int minCurrentVolume;
    private int currentVolume;
    private int numberOfRadioStation;

    public Radio() {
        this.currentRadioStation = this.minCurrentStation;
        this.maxCurrentVolume = 100;
        this.minCurrentVolume = 0;
        this.currentVolume = this.minCurrentVolume;
    }

    public Radio(int maxCurrentStation, int minCurrentStation, int currentRadioStation, int maxCurrentVolume, int minCurrentVolume, int currentVolume, int numberOfRadioStation) {
        this.currentRadioStation = this.minCurrentStation;
        this.maxCurrentVolume = 100;
        this.minCurrentVolume = 0;
        this.currentVolume = this.minCurrentVolume;
        this.maxCurrentStation = maxCurrentStation;
        this.minCurrentStation = minCurrentStation;
        this.currentRadioStation = currentRadioStation;
        this.maxCurrentVolume = maxCurrentVolume;
        this.minCurrentVolume = minCurrentVolume;
        this.currentVolume = currentVolume;
        this.numberOfRadioStation = numberOfRadioStation;
    }

    public int getMaxCurrentStation() {
        return this.maxCurrentStation;
    }

    public int getMinCurrentStation() {
        return this.minCurrentStation;
    }

    public int getCurrentRadioStation() {
        return this.currentRadioStation;
    }

    public int getMaxCurrentVolume() {
        return this.maxCurrentVolume;
    }

    public int getMinCurrentVolume() {
        return this.minCurrentVolume;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public int getNumberOfRadioStation() {
        return this.numberOfRadioStation;
    }

    public void setMaxCurrentStation(int maxCurrentStation) {
        this.maxCurrentStation = maxCurrentStation;
    }

    public void setMinCurrentStation(int minCurrentStation) {
        this.minCurrentStation = minCurrentStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public void setMaxCurrentVolume(int maxCurrentVolume) {
        this.maxCurrentVolume = maxCurrentVolume;
    }

    public void setMinCurrentVolume(int minCurrentVolume) {
        this.minCurrentVolume = minCurrentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setNumberOfRadioStation(int numberOfRadioStation) {
        this.numberOfRadioStation = numberOfRadioStation;
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
            } else if (this.getMaxCurrentStation() != other.getMaxCurrentStation()) {
                return false;
            } else if (this.getMinCurrentStation() != other.getMinCurrentStation()) {
                return false;
            } else if (this.getCurrentRadioStation() != other.getCurrentRadioStation()) {
                return false;
            } else if (this.getMaxCurrentVolume() != other.getMaxCurrentVolume()) {
                return false;
            } else if (this.getMinCurrentVolume() != other.getMinCurrentVolume()) {
                return false;
            } else if (this.getCurrentVolume() != other.getCurrentVolume()) {
                return false;
            } else {
                return this.getNumberOfRadioStation() == other.getNumberOfRadioStation();
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Radio;
    }

    public int hashCode() {
        int PRIME = true;
        int result = 1;
        result = result * 59 + this.getMaxCurrentStation();
        result = result * 59 + this.getMinCurrentStation();
        result = result * 59 + this.getCurrentRadioStation();
        result = result * 59 + this.getMaxCurrentVolume();
        result = result * 59 + this.getMinCurrentVolume();
        result = result * 59 + this.getCurrentVolume();
        result = result * 59 + this.getNumberOfRadioStation();
        return result;
    }

    public String toString() {
        int var10000 = this.getMaxCurrentStation();
        return "Radio(maxCurrentStation=" + var10000 + ", minCurrentStation=" + this.getMinCurrentStation() + ", currentRadioStation=" + this.getCurrentRadioStation() + ", maxCurrentVolume=" + this.getMaxCurrentVolume() + ", minCurrentVolume=" + this.getMinCurrentVolume() + ", currentVolume=" + this.getCurrentVolume() + ", numberOfRadioStation=" + this.getNumberOfRadioStation() + ")";
    }
}
