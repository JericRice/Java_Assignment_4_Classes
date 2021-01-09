package one;


public class Application {

    public static void main(String[] args) {

        Person person = new Person();
        person.age = 43;
        person.name = "Joe";
        System.out.println("Name: " + person.name + " Age: " + person.age);

    }
}
