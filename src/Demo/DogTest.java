/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

/**
 *
 * @author User
 */
public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Einstein", "Aussiedoodle", 1, "1234");
        Dog dog2 = new Dog("Einstein", "Aussiedoodle", 1, "1234");
        
        if(dog1.equals(dog2)){
        System.out.println("Dogs are equal");
        } else {
            System.out.println("Dogs are NOT equal");
        }
    }
}
