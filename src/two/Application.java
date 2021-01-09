package two;

public class Application {

    public static void main(String[] args) {

        PrivatePerson person = new PrivatePerson();
        person.setAge(43);
        person.setName("Joe");

        System.out.println("Name: " + person.getName() + ", Age " + person.getAge());
    }
}
