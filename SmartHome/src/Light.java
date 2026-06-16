public class Light implements SmartDevice {
    int brightness = 50;
    public void turnOn() {
        System.out.println("The light is now turned on");
    }

    public void turnOff() {
        System.out.println("The light is now turned off");
    }

    public void changeBrightness(int value) {
        this.brightness = value;
        System.out.println("The brightness of the light is " + value);
    }
}
