public class Person {
    String name;
    static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "name1";

        Person person2 = new Person();
        person2.name = "name2";

        System.out.println("Name: " + person1.name);
        System.out.println("Name: " + person2.name);
    }
}
