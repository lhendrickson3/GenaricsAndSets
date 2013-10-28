/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author User
 */
public class Demo1 {
    public static void main(String[] args) {
//        List<String> groceryList = new ArrayList<String>();
//        // only objects can be stored in a List
//        groceryList.add("Beer");
//        groceryList.add("Chips");
//        groceryList.add("Salsa");
//        groceryList.add("Beer");
//        
//        int size = groceryList.size();
//        
//        System.out.println("List size = " + size);
//        
//        for (String s : groceryList){
//            System.out.println("Item: " + s);
//        }
        
        
        
//        Set<String> grocerySet = new HashSet<String>();
//        // only objects can be stored in a List
//        grocerySet.add("Beer");
//        grocerySet.add("Chips");
//        grocerySet.add("Salsa");
//        grocerySet.add("Beer");
//        
//        int size = grocerySet.size();
//        
//        System.out.println("List size = " + size);
//        
//        for (String s : grocerySet){
//            System.out.println("Item: " + s);
//        }
        
        
        List<String> groceryList = new ArrayList<String>();
        // only objects can be stored in a List
        groceryList.add("Beer");
        groceryList.add("Chips");
        groceryList.add("Salsa");
        groceryList.add("Beer");  
        //can only retrieve from List not a Set (Create list and pass it to a set then pass it back to a list)
        String retrieved = groceryList.get(2);
        System.out.println("The retrieved item: " + retrieved);
        //pass list to set
        Set<String> grocerySet = new HashSet<String>(groceryList);
        
        int size = groceryList.size();
        System.out.println("List size before Set = " + size);
        //pass the set to list
        groceryList = new ArrayList<String>(grocerySet);
        
        int size3 = groceryList.size();
        System.out.println("List size after Set = " + size3);
        
        int size2 = grocerySet.size();
        System.out.println("Set size = " + size2);
        
        for (String s : grocerySet){
            System.out.println("Item: " + s);
        }        
    }
}
