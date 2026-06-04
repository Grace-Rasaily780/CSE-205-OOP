public class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(this.name + " is " + age + " old");
    }
}
