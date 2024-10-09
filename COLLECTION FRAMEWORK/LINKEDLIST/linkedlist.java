// 1. Write a program to read employee detail and store the employee object in linkedlist. 
//Sort the
// list based on salary.
// a. Create class- Employee (Attributes- empid, name , dob , salary : Methods: setDetails,
// getDetails and constructures )
// b. Employee class must implement comparable interface
// c. Create another class TestEmployee, here create the linkedlist of employees and sort the
// list.

import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

class Employee implements Comparable<Employee> {
    private int empId;
    private String name;
    private String dob; // Date of birth
    private int salary;

    // Constructor
    public Employee(int empId, String name, String dob, int salary) {
        this.empId = empId;
        this.name = name;
        this.dob = dob;
        this.salary = salary;
    }

    // Setters and Getters
    public void setDetails(int empId, String name, String dob, int salary) {
        this.empId = empId;
        this.name = name;
        this.dob = dob;
        this.salary = salary;
    }

    public String getDetails() {
        return "Employee ID: " + empId + ", Name: " + name + ", Date of Birth: " + dob + ", Salary: " + salary;
    }

    // Implementing the compareTo method for sorting by salary
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.salary, other.salary);
    }
}

class TestEmployee {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();

        // Adding employee records
        employees.add(new Employee(1, "Yusuf", "01-02-2024", 10000000));
        employees.add(new Employee(2, "Alice", "15-03-2023", 8000000));
        employees.add(new Employee(3, "Bob", "20-04-2022", 12000000));

        // Sorting the employee list based on salary
        Collections.sort(employees);

        // Displaying sorted employee details
        for (Employee emp : employees) {
            System.out.println(emp.getDetails());
        }
    }
}
