
package topic_2_linkedlist_int;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        Linkedlist list = new Linkedlist();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome Users");
        
        while(true){
            System.out.println("What Do You Want To Do: " + "\n"
                                + "1. Add Numbers" + "\n"
                                + "2. Delete Numbers" + "\n"
                                + "3. Swap or Move Numbers" + "\n"
                                + "4. Exit Program");
            int choice = sc.nextInt();
            switch(choice){
                case 1: 
                    // Adding elements/numbers to the records
                    System.out.println("Enter a Number you want to record: ");
                    // Adding sc.nextInt for the user's input
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    int num3 = sc.nextInt();
                    int num4 = sc.nextInt();
                    int num5 = sc.nextInt();

                    //adding the containers for the arays of int
                    list.add(num1);
                    list.add(num2);
                    list.add(num3);
                    list.add(num4);
                    list.add(num5);
                    System.out.println("Current Linked List:");
                    list.printList();
                    
                    break;
                    
                case 2:
                    //function for deleting a num
                    System.out.println();
                    System.out.println("Enter a Number to Delete From The List");
                    int namec = sc.nextInt();
                    //delete an item by value
                    list.deleteByValue(namec);
                    System.out.println("Current Linked List:");
                    list.printList();
                    
                    break;
                
                case 3:
                    
                    //Added a function to swap the position of index 0 to any index num within the array
                    System.out.println();
                    System.out.println("Swapping node from index to index");
                    System.out.println("Enter a Number to Swap From The List");
                    //recieve the user's inputs
                    int index1 = sc.nextInt();
                    int index2 = sc.nextInt();
                    //for swapping values
                    list.moveNodePointer(index1, index2);
                    list.printList();
                    
                    break;
                    
                case 4:
                    System.out.println("Exiting The Program...");
                    System.exit(0);
                    
                    break;
                
                default:
                    System.out.println("Error 404 : Can't Find the Requested Number");
                    System.exit(0);
            }
        }
    }

}