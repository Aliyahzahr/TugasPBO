package latihan4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MainQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int choice;
        
        do {
            System.out.println("\nQueue Operations");
            System.out.println("1. insert");
            System.out.println("2. remove");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. check full"); // Not applicable for LinkedList-based queue
            System.out.println("6. size");
            System.out.print("Your Choice ? ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int value = scanner.nextInt();
                    queue.add(value);
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        System.out.println("Removed: " + queue.poll());
                    } else {
                        System.out.println("Queue is empty!");
                    }
                    break;
                case 3:
                    if (!queue.isEmpty()) {
                        System.out.println("Front: " + queue.peek());
                    } else {
                        System.out.println("Queue is empty!");
                    }
                    break;
                case 4:
                    System.out.println("Queue empty: " + queue.isEmpty());
                    break;
                case 5:
                    System.out.println("Queue full: false (LinkedList-based queue has no fixed size)");
                    break;
                case 6:
                    System.out.println("Size = " + queue.size());
                    System.out.println("Queue = " + queue);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            
            System.out.print("Do you want to continue (Type y or n): ");
        } while (scanner.next().charAt(0) == 'y');
        
        scanner.close();
    }
}
