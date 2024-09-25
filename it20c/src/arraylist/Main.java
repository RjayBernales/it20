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
    }
}
