import java.util.Random;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    private Node head;

    // Method to create a linked list with random values
    public void createRandomList(int size) {
        Random random = new Random();
        head = null;
        Node current = null;

        for (int i = 0; i < size; i++) {
            int randomValue = random.nextInt(100); // Random value between 0 and 99
            Node newNode = new Node(randomValue);

            if (head == null) {
                head = newNode; // Initialize head
            } else {
                current.next = newNode; // Link the previous node to the new node
            }
            current = newNode; // Move to the new node
        }
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

class Main {
    public static void main(String[] args) {
        LinkedList randomList = new LinkedList();   
        randomList.createRandomList(10); // Create a linked list of size 10
        randomList.printList(); // Print the linked list
    }
}