public class Radio {
    public int currentRadioStationNumber;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void next(int next) {
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber = currentRadioStationNumber + next;
            return;
        }
        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;
            return;
        }
    }

    public void prev(int prev) {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = 9;
            return;
        }
        if (currentRadioStationNumber <= 9) {
            currentRadioStationNumber = currentRadioStationNumber - prev;
            return;
        }
    }


    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume(int increase) {
        if (currentVolume < 10) {
            currentVolume = currentVolume + increase;
            return;
        }
        if (currentVolume == 10) {
            currentVolume = 10;
            return;
        }
    }

    public void decreaseVolume(int decrease) {
        if (currentVolume == 0) {
            currentVolume = 0;
            return;
        }
        if (currentVolume > 0) {
            currentVolume = currentVolume - decrease;
            return;
        }

    }


}
