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
public class WoWClasses {
    public static void main(String[] args) {
        List<String> classList = new ArrayList<String>();
        classList.add("Hunter");
        classList.add("Priest");
        classList.add("Warrior");
        classList.add("Mage");
        classList.add("Monk");
        classList.add("Druid");
        classList.add("Shaman");
        classList.add("Rogue");
        // retrieve an object from its position in the list
        String retrieved = classList.get(2);
        System.out.println("The class retrieved: " + retrieved);
        // get the size of the list
        int size = classList.size();
        System.out.println("List size = " + size);
        //loop through and retrieve all the items
        for (Object s : classList){
            System.out.println("Class: " + (String)s);
        }
        // remove/delete Mage (position 3) from the list
        classList.remove(3);
        
        int size2 = classList.size();
        System.out.println("List size after removal = " + size2);
        
        for (Object s : classList){
            System.out.println("Item: " + (String)s);
        }
        // replace/update the list by position
        classList.set(3, "Death Knight");
        classList.set(5, "Warlock");
        
        int size3 = classList.size();
        System.out.println("List size after update = " + size3);
        
        for (Object s : classList){
            System.out.println("Item: " + (String)s);
        }
        //add object to list at a specific index/position
        classList.add(3, "Mage");
        classList.add(6, "Shaman");
        classList.add(2, "Paladin");
        classList.add(1, "Monk");
        
        int size4 = classList.size();
        System.out.println("List size after adding = " + size4);
        
        for (Object s : classList){
            System.out.println("Item: " + (String)s);
        }
        
        classList.clear();
        
        int size5 = classList.size();
        System.out.println("List size after clear = " + size5);
        
    }
}
