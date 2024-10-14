import java.util.*;

class Person {
    private String name;
    private int age;

    public void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

class JAO {
    public static void main(String[] args) {
        // Create an ArrayList to hold Person objects
        ArrayList<Person> people = new ArrayList<>();

        // Create Person objects and set their data
        Person person1 = new Person();
        person1.setData("Alice", 30);
        people.add(person1);

        Person person2 = new Person();
        person2.setData("Bob", 25);
        people.add(person2);

        Person person3 = new Person();
        person3.setData("Charlie", 35);
        people.add(person3);

        // Iterate through the ArrayList and print the objects
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

