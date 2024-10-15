import java.util.Arrays;
import java.util.Scanner;

class StudentNamesSorter {
    public static void main(String[] args) {
        String[] nameOfStudents = new String[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter up to 10 names of students (type 'done' to finish):");

        for (int i = 0; i < 10; i++) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break; // Exit if the user types 'done'
            }
            nameOfStudents[i] = input; // Store the name
        }

        // Sort the array, but only the filled portion
        int count = (int) Arrays.stream(nameOfStudents).filter(name -> name != null).count();
        String[] filledNames = Arrays.copyOf(nameOfStudents, count);
        Arrays.sort(filledNames); // Sort the filled names

        // Display the sorted list of names
        System.out.println("Sorted list of names:");
        for (String name : filledNames) {
            System.out.println(name);
        }

        scanner.close();
    }
}
