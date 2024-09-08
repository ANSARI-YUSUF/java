
// Base class: Person
class Person {
    private String name;
    private int age;

    // Constructor
    public void Setperson (String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}


// Derived class: Employee (inherits from Person)
class Employee extends Person {
    private int employeeId;
    private double salary;

    // Constructor
    public void setemployee(String name, int age, int employeeId, double salary) {
         super.Setperson(name, age);
        // Person p=new Person(name,age); 
        // p.name=name;
        // p.age=age;

        // Call the constructor of the superclass (Person)
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Method to display employee details
    @Override
    public void displayDetails() {
        super.displayDetails();  // Call the displayDetails method of the superclass (Person)
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
    }

    // Getter for employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }
}
// Derived class: Manager (inherits from Employee)
class Manager extends Employee {
    private double bonus;

    // Constructor
    public Manager (String name, int age, int employeeId, double salary, double bonus) {
        super.setemployee(name, age, employeeId, salary);  // Call the constructor of the superclass (Employee)
        this.bonus = bonus;
    }

    // Method to display manager details
    @Override
    public void displayDetails() {
        super.displayDetails();  // Call the displayDetails method of the superclass (Employee)
        System.out.println("Bonus: $" + bonus);
    }

    // Getter for bonus
    public double getBonus() {
        return bonus;
    }
}


// public class singleinherit {
//     public static void main(String[] args) {
//         // Create an instance of Employee
//         Employee emp = new Employee("yusuf", 30, 1345, 75000);

//         // Display employee details
//         emp.displayDetails();
//     }
// }






public class multiinherit{
    public static void main(String[] args) {
        // System.out.println("hello");


       
                // Create an instance of Manager
                Manager manager = new Manager("yusuf", 40, 100122, 120000, 15000);
        
                // Display manager details
                manager.displayDetails();
            
        }
        



        
    }
