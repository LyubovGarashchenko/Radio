package ru.netology.statistic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data

    public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxCurrentStation = 9;


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
}

