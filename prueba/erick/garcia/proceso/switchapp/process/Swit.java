package erick.garcia.proceso.switchapp.process;

public class Swit {

    private boolean isOn;

    public void prender() {
        isOn = true;
    }

    public void apagar() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
}
