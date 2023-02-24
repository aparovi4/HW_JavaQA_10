public class Radio {
    private int currentRadioStationNumber;
    private int currentVolume;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        if (currentRadioStationNumber < 0) {
            return;
        }
        if (currentRadioStationNumber > 9) {
            return;
        }
        this.currentRadioStationNumber = currentRadioStationNumber;
    }

    public void nextRadioStationNumber() {
        if (currentRadioStationNumber != 9) {
            currentRadioStationNumber++;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void prevRadioStationNumber() {
        if (currentRadioStationNumber != 0) {
            currentRadioStationNumber--;
        } else {
            currentRadioStationNumber = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume != 10) {
            currentVolume++;
        } else {
            currentVolume = 10;
        }

    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }

    }
}