public class Fan implements SmartDevice {
    int speed = 50;
    public void turnOn() {
        System.out.println("The Fan is now started");
    }

    public void turnOff() {
        System.out.println("The Fan is now stopped");
    }

    public void changeSpeed(int value) {
        this.speed = value;
        System.out.println("The speed of the fan is " + value);
    }
}
