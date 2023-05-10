package org.example;

public class Radio {
    private int numberStation; // Функции переключения станций.
    private int CurrentVolume; // Функция изменения громкости

    public int getNumberStation() {
        return numberStation;
    }

    public void setNextNumberStation(int newNextNumberStation) {

        if (newNextNumberStation < 9) {
            newNextNumberStation = newNextNumberStation + 1;

        } else {
            return;
        }


        numberStation = newNextNumberStation;

    }

    public void setPrevNumberStation(int newPrevNumberStation) {

        if (newPrevNumberStation < 9) {
            newPrevNumberStation = newPrevNumberStation - 1;

        }

        if (newPrevNumberStation <= 0) {
            newPrevNumberStation = 9;
        }


        numberStation = newPrevNumberStation;

    }

    public int getCurrentVolume() {
        return CurrentVolume;
    }

    public void setNextCurrentVolume(int newNextCurrentVolume) {
        if (newNextCurrentVolume < 100) {
            newNextCurrentVolume = newNextCurrentVolume + 1;
        }
        if (newNextCurrentVolume >= 100) {
            newNextCurrentVolume = 100;
        }
        CurrentVolume = newNextCurrentVolume;

    }

    public void setPrevCurrentVolume(int newPrevCurrentVolume) {
        if (newPrevCurrentVolume < 100) {
            newPrevCurrentVolume = newPrevCurrentVolume - 1;
        }
        if (newPrevCurrentVolume < 0) {
            newPrevCurrentVolume = 0;
        }

        CurrentVolume = newPrevCurrentVolume;

    }



}

