package ru.netology.domain;

public class Radio {

    // переключение станций

    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            currentStation = 9;
        }
        if (currentStation > 9) {
            currentStation = 0;
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
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
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
