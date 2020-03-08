package solid.dependencyinversion.badexample;

public class ElectricPowerSwitch {

    //Dependency directly to the concrete class not to an abstraction
    //This is the error
    public LightBulb lightBulb;
    public boolean on;

    public ElectricPowerSwitch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }

    public void press(){
        boolean checkOn = isOn();
        if (checkOn) {
            lightBulb.turnOff();
            this.on = false;
        } else {
            lightBulb.turnOn();
            this.on = true;
        }

    }
}
