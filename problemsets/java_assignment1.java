/* 
 -----------------------------
part 1
---------------------------------------
Q1


1. Declare variables of different data types (int, double, boolean, char) and perform various
arithmetic operations on them.1. Declare variables of different data types (int, double, boolean, char) and perform various
arithmetic operations on them.

class Assignment_1_one{
    public static void main(String args[]){
        //(int, double, boolean, char)
        int data=10;
        double data2=10.20;
        boolean b1=true;
        char c='A';

        System.out.println("intiger :"+ data);
        System.out.println("Double :"+ data2);
        System.out.println("boolean :"+ b1);
        System.out.println("Charater :"+ c);

        System.out.println("----------------------");
        System.out.println("intiger + 10 :"+ data+10);
        System.out.println("Double + 10.22:"+ data2+10.22);
        b1=false;
        System.out.println("boolean + false:"+ b1);
         c='A'+1;
        System.out.println("Charater + 1 :"+ c);
    }
}
---------------------------------------------------------------------------------------
Q2   2. Write a program that calculates the area and perimeter of a rectangle, given the length and
width as input.



import java.util.Scanner;
class Assignment_1_two {
     public static void main(String args[]){
       Scanner obj=new Scanner(System.in);
        float hight=20;
        System.out.print("Enter hight of rectangle:");
        hight=obj.nextFloat();
        System.out.println();
        float width=20;
        System.out.print("Enter width of rectangle:");
        width=obj.nextFloat();
        System.out.println("Area of rectangle is:"+hight*width);
        obj.close();
     }
}

------------------------------------------------------------------------------------------------------
Q3  3. Implement a program that converts temperature from Celsius to Fahrenheit and vice versa.   



public class Assignment_1_three {
    public void ftemp(double c){
        double f=c*9/5+32;
          System.out.println("Temperature in Fahrenheit:"+f+'F');
    }
        public void ctemp(double f){
        double c=(f-32) * 5/9;
        int c_t=(int)c;
          System.out.println("Temperature in Celsius:"+c_t+'C');
    }
     public static void main(String args[]){
        // mplement a program that converts temperature from Celsius to Fahrenheit and vice versa.
        Assignment_1_three obj2 = new Assignment_1_three();
        double temp=23;
        obj2.ftemp(temp);
        obj2.ctemp(73.4);
     }
}
=---------------------------------------------------------------------------------------------------------------
Part 2: Classes and Methods


Q1. Create a Person class with the following properties: name, age, and gender. Implement
methods to set and get these properties.


class Person {
   String Name;
   int age;
   char gender;

   void set(String t_name, int t_age, char t_gender) {
      Name = t_name;
      age = t_age;
      gender = t_gender;
   }

   void get() {
      System.out.println("Name:" + Name);
      System.out.println("Age:" + age);
      System.out.println("Name:" + gender);
   }

}

class Assignmnet_2_one {
   public static void main(String args[]) {
      // 1. Create a Person class with the following properties: name, age, and
      // gender. Implement methods to set and get these properties.
      Person p1 = new Person();
      p1.set("Ashish", 20, 'M');
      p1.get();
   }
}


-------------------------------------------------------------------------------------------------
Q 2. Write a BankAccount class with the following properties: accountNumber, balance,
and owner. Implement methods to deposit, withdraw, and check the account balance.


class BankAccount{
    long acnumber;
    double balance;
   String Name;
   
   void set(long t_acnumber,double t_balance,String t_Name) {
      acnumber=t_acnumber;
      balance=t_balance;
      Name=t_Name;
   }
   void deposit(double amout){
        balance=amout+balance;
        System.out.println("Your Account is creadited:"+amout);
        System.out.println("Your Account Balance is :"+balance);
   }
      void withdraw(double amout){
        if(amout>balance){
            System.out.println("Your Account is not sufficent balance");
        }
        else
        {
            balance=balance-amout;
            System.out.println("Your Account is debited:"+amout);
            System.out.println("Your Account Balance is :"+balance);
        }

   }
}
public class Assignment_2_two {
//Write a BankAccount class with the following properties: accountNumber, balance, 
// and owner. Implement methods to deposit, withdraw, and check the account balance
            public static void main(String args[]){
                BankAccount b1=new BankAccount();
                b1.set(929292929, 70000,"Ashish");
                b1.deposit(1000);            
                b1.withdraw(1000);
            }
}


--------------------------------------------------------------------------------------------------------------
3. Create a Circle class with the following properties: radius. Implement methods to calculate
the area and circumference of the circle.



public class Circle {
    // Property to store the radius of the circle
    private double radius;

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius must be positive.");
        }
    }

    // Method to get the radius of the circle
    public double getRadius() {
        return radius;
    }

    // Method to set the radius of the circle
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius must be positive.");
        }
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Main method to test the Circle class
    public static void main(String[] args) {
        // Create a new Circle object with a radius of 5.0
        Circle circle = new Circle(5.0);

        // Print the radius of the circle
        System.out.println("Radius: " + circle.getRadius());

        // Print the area of the circle
        System.out.println("Area: " + circle.calculateArea());

        // Print the circumference of the circle
        System.out.println("Circumference: " + circle.calculateCircumference());
    }
}

-----------------------------------------------------------------------------------------------


// Part 3: Conditional Statements and Loops
-----------------------------------------------------------------------------------------------

/* 1 .
import java.util.Scanner;
class EvenOddNumbers{
    public static void main(String[] args){
System.out.println("Find even odd number : ");
Scanner obj = new Scanner(System.in);
        System.out.println("enter number : ");
int value = obj.nextInt();
if(value % 2 == 0){
      System.out.println("number is even : ");
}else
{
  System.out.println("number is odd : ");

}

}
}


output :

Find even odd number :
enter number :
3
number is odd :

*/

/* 2

import java.util.Scanner;
class SwitchCaseUse{
public static void main(String[] args){
System.out.println("switch case");
Scanner obj = new Scanner(System.in);

System.out.println("enter opetion for print days");
int op = obj.nextInt();

switch(op){

case 1:
  System.out.println("sunday");
  break;


case 2:
  System.out.println("monday");
  break;
 
 
case 3:
  System.out.println("tuseday");
  break;
 
 
case 4:
  System.out.println("wensday");
  break;
 
 
case 5:
  System.out.println("thursday");
  break;
 
 
case 6:
  System.out.println("friday");
  break;
 
 
case 7:
  System.out.println("seterday");
  break;
 
 
case 8:
  System.out.println("enter correct choice");
  break;
 
   
}

}
}


OutPut:

switch case
enter opetion for print days
3
tuseday

*/

/* 3

import java.util.Scanner;
class PrintTable{
public static void main(String[] args){
      System.out.println("print multiplication table : ");
      Scanner obj = new Scanner(System.in);

 System.out.println("enter number :  ");
      int number = obj.nextInt();

 for(int i=1;i<=10;i++){
 System.out.println(i * number);
 }
}
}

OUTPUT:

print multiplication table :
enter number :
5
5
10
15
20
25
30
35
40
45
50

*/
/*
4
import java.util.Scanner;
class Fectorial{
public static void main(String[] args){
System.out.println("print fectorial");
 int number = 4;
 int i=1;
 int count = 1;
 while(i <= number ){
  count = count* i;
  i++;
}
System.out.println(count);

}
}

OUTPUT:
print fectorial
24

*/

/*

Part 4

/* Develop a program to manage student grades. The program should have the following features:
 Create a Student class with properties for name, student ID, and grades (in an array).
 Implement methods to:
 Add a new student
 Update a student's grades
 Calculate the average grade for a student
 Find the student with the highest average grade
Prompt the user to perform various operations, such as adding a new student, updating a
student's grades, and displaying the student with the highest average grade.  */


/*import java.util.Scanner;
import java.util.Arrays;

class Student {
    String name;
    int student_id;
    int[] grades;  // Array to store grades

    // Constructor
    public Student(String name, int student_id, int[] grades) {
        this.name = name;
        this.student_id = student_id;
        this.grades = grades;
    }

    // Method to calculate average grade
    public double calculateAverageGrade() {
        if (grades.length == 0) {
            return 0.0;
        }
        int sum = Arrays.stream(grades).sum(); // Using streams for summing up grades
        return (double) sum / grades.length;
    }






    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline left by nextInt()

        Student[] students = new Student[n];

        int choice;
        do {
            System.out.println("\n1. Add a new student");
            System.out.println("2. Update a student's grades");
            System.out.println("3. Display student with the highest average grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left by nextInt()

            switch (choice) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.println("\nEnter details for student " + (i + 1) + ":");
                        System.out.print("Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Student ID: ");
                        int studentId = scanner.nextInt();
                        scanner.nextLine();  // Consume newline left by nextInt()
                        System.out.print("Number of grades: ");
                        int numGrades = scanner.nextInt();
                        scanner.nextLine();  // Consume newline left by nextInt()
                        int[] grades = new int[numGrades];
                        for (int j = 0; j < numGrades; j++) {
                            System.out.print("Enter grade " + (j + 1) + ": ");
                            grades[j] = scanner.nextInt();
                            scanner.nextLine();  // Consume newline left by nextInt()
                        }
                        students[i] = new Student(name, studentId, grades);
                    }
                    break;
                case 2:
                    System.out.print("\nEnter student ID to update grades: ");
                    int studentToUpdate = scanner.nextInt();
                    scanner.nextLine();  // Consume newline left by nextInt()
                    boolean found = false;
                    for (Student student : students) {
                        if (student != null && student.student_id == studentToUpdate) {
                            System.out.print("Enter new grades (comma-separated): ");
                            String[] gradesStr = scanner.nextLine().split(",");
                            int[] newGrades = new int[gradesStr.length];
                            for (int i = 0; i < gradesStr.length; i++) {
                                newGrades[i] = Integer.parseInt(gradesStr[i].trim());
                            }
                            student.grades = newGrades;
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    double highestAverage = Double.MIN_VALUE;
                    Student studentWithHighest = null;
                    for (Student student : students) {
                        if (student != null) {
                            double avg = student.calculateAverageGrade();
                            if (avg > highestAverage) {
                                highestAverage = avg;
                                studentWithHighest = student;
                            }
                        }
                    }
                    if (studentWithHighest != null) {
                        System.out.println("\nStudent with highest average grade:");
                        System.out.println("Name: " + studentWithHighest.name);
                        System.out.println("Student ID: " + studentWithHighest.student_id);
                        System.out.println("Average Grade: " + highestAverage);
                    } else {
                        System.out.println("No students found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

/* /
Enter number of students: 4

1. Add a new student
2. Update a student's grades
3. Display student with the highest average grade
4. Exit
Enter your choice: 1

Enter details for student 1:
Name: drashti
Student ID: 1
Number of grades: 5
Enter grade 1: 55
Enter grade 2: 45
Enter grade 3: 50
Enter grade 4: 58
Enter grade 5: 59

Enter details for student 2:
Name: jannat
Student ID: 2
Number of grades: 5
Enter grade 1: 1
Enter grade 2: 2
Enter grade 3: 3
Enter grade 4: 4
Enter grade 5: 5

Enter details for student 3:
Name: priya
Student ID: 3
Number of grades: 5
Enter grade 1: 33
Enter grade 2: 73
Enter grade 3: 83
Enter grade 4: 93
Enter grade 5: 10

Enter details for student 4:
Name: riya
Student ID: 4
Number of grades: 1
Enter grade 1: 5
Enter grade 1: 33
Enter grade 2: 73
Enter grade 3: 83
Enter grade 4: 93
Enter grade 5: 10


1. Add a new student
2. Update a student's grades
3. Display student with the highest average grade
4. Exit
*/






