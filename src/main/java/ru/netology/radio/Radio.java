package ru.netology.radio;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0)
        {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;

    }

}

