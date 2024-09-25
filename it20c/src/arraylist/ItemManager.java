//Adding package for arraylist

package arraylist;

import java.util.ArrayList;


public class ItemManager {
        
        private ArrayList<String> items;
        
        public ItemManager(){
            items = new ArrayList<>();
        }
        //Added function to display the items
        public void displayItems(){
            System.out.println("Names on our list: " +items);
        }
        //Added a function to add items into the arraylist
        public void addName(String item){
            items.add(item);
            System.out.println("Names: " + items);
        } 
}
