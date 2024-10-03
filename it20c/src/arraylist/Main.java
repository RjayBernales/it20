package arraylist;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        
        //Added a scanner to have user inputs
        Scanner sc = new Scanner(System.in);
        
        //add a default list
        ItemManager list = new ItemManager();
        list.addName("Jack");
        
        
        //displaying the updated items
        list.displayItems();
        
        //Added a println that corresponds with the codes on ItemManager.java
        System.out.println("Enter the Name You Want to Add: ");
        String item = sc.nextLine();
        
        //adding item
        list.addName(item);
        
        //To have the user change names
        System.out.println("Enter the Name You Want to Change: " );
        String newItem = sc.nextLine();
        //To specify what index the user wants to be change
        System.out.println("Enter Index Number: ");
        int index = sc.nextInt();
        
        //Show the updated list of names
        list.updateItem(index, newItem);
        list.displayItems();
        //To revert the code back to String for the next user input
        sc.nextLine();
        
        //Added a println that corresponds with the codes on ItemManager.java
        System.out.println("Enter the Name You Want to Find:" );
        String findItem = sc.nextLine();
        
        //finding item
        list.findItem(findItem);
        list.displayItems();
        
        //Added a println that corresponds with the codes on ItemManager.java
        System.out.println("Enter Index Number of the Name You Want to Delete: ");
        int deleteIndex = sc.nextInt();
        
        //deleting items
        list.deleteItem(deleteIndex);
        list.displayItems();
        
        //closing the scanner
        sc.close();
        
    }
}
        /* Expected Output
        Names: [Jack]
        Names on our list: [Jack]
        Enter the Name You Want to Add: 
        Smith
        Names: [Jack, Smith]
        Enter the Name You Want to Change: 
        Sparrow
        Enter Index Number: 
        1
        Successfully Updated: Smith to Sparrow
        Names on our list: [Jack, Sparrow]
        Enter the Name You Want to Find:
        Jack
        Found: Jack at index 0
        Names on our list: [Jack, Sparrow]
        Enter Index Number of the Name You Want to Delete: 
        1
        Successfully Deleted: Sparrow
        Names on our list: [Jack]

*/
