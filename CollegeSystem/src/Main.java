public class Main {
    static void main(String[] args) {
        FullTime person1 = new FullTime("Pawan");
        HalfTime person2 = new HalfTime("Grace");
        PartTime person3 = new PartTime("Abinash");

        person1.displayInfo();
        person1.showSchedule();

        person2.displayInfo();
        person2.showSchedule();

        person3.displayInfo();
        person3.showSchedule();
    }
}