package ru.netology.domain;

public class Radio {


    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {

    }

    public Radio(int stations) {
        this.maxStation = stations - 1;

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        setCurrentStation(currentStation = currentStation + 1);
    }

    public void prev() {
        setCurrentStation(currentStation = currentStation - 1);
    }

    // громкость

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void forward() {
        setCurrentVolume(currentVolume = currentVolume + 1);
    }

    public void back() {
        setCurrentVolume(currentVolume = currentVolume - 1);
    }
}
