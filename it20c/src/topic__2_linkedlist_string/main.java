
package topic__2_linkedlist_string;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {
        public static void main(String[] args) {
		
        linkedlist list = new linkedlist();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome User");
        list.add("Mathematics");
        list.add("Filipino");
        
        while(true){
            System.out.println("Current Subject Load:");
            list.printList();
            System.out.println("What Do You Want To Do: " + "\n"
                                + "1. Add Subject" + "\n"
                                + "2. Delete Numbers" + "\n"
                                + "3. Sort or Move Subjects" + "\n"
                                + "4. Exit Program");
            int choice = sc.nextInt();
            switch(choice){
                case 1: 
                    // Adding elements/numbers to the records
                    System.out.println("Enter a Subject you want to Add: ");
                    // Adding sc.nextInt for the user's input
                    String sub1 = sc.nextLine();
                    String sub2 = sc.nextLine();
                    String sub3 = sc.nextLine();

                    //adding the containers for the arays of int
                    list.add(sub1);
                    list.add(sub2);
                    list.add(sub3);
                    System.out.println("Current Linked List:");
                    list.printList();
                    
                    break;
                    
                    case 2:
                    //function for deleting a num
                    sc.nextLine();
                    System.out.println();
                    System.out.println("Enter a Subject to Delete From The List");
                    String name = sc.nextLine();
                    System.out.println("Do You Really Want to Delete " + name + "?");
                    String confirmation = sc.nextLine();
                    if(confirmation.equalsIgnoreCase("yes")){
                        list.deleteByValue(name);
                        System.out.println("Subject Deleted");
                    }
                    //delete an item by value
                    System.out.println("Current Subject Load:");
                    list.printList();
                    
                    break;
                
            }
        }
    }
}
