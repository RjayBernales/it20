package topic_3_stack;

import java.util.Scanner;

/**
 *
 * @author RJ
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        Stack stack = new Stack(5);
    
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
         while(true) {
            System.out.println("What Do You Want: "
                    + " 1. Check Size"
                    + " 2. Push Stack"
                    + " 3. Pop Stack"
                    + " 4. Exit");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                      System.out.println("Stack size is: " + stack.size());
                      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                      break;
                case 2:   
                     System.out.println("Add a number: ");
                     int num = sc.nextInt();
                     System.out.println("Pushed value: " + num);
                     stack.push(num);
                     stack.size();
                     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                     break;    
                case 3:                   
                     stack.peek();
                     System.out.println("Popped element: " + stack.pop());
                     stack.size();
                     break;   
                case 4:
                     System.out.println("Thank You For Using The Program");
                     System.exit(0);
                     break;
                 default:
                        System.out.println("Invalid choice. Please select a valid option.");    
        
                }
            }
    }
}
