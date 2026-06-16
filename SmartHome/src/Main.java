public class Main {
    static void main(String[] args) {
        Fan fan1 = new Fan();
        Light light1 = new Light();

        light1.turnOn();
        light1.changeBrightness(30);
        fan1.turnOff();

        light1.turnOff();

        fan1.turnOn();
        fan1.changeSpeed(70);
    }
}