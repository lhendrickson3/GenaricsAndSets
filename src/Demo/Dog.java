/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

/**
 *
 * @author User
 */
public class Dog {
    private String name;
    private String breed;
    private int age;
    private String rabiesId;

    public Dog(String name, String breed, int age, String rabiesId) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.rabiesId = rabiesId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.rabiesId != null ? this.rabiesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dog other = (Dog) obj;
        if ((this.rabiesId == null) ? (other.rabiesId != null) : !this.rabiesId.equals(other.rabiesId)) {
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRabiesId() {
        return rabiesId;
    }

    public void setRabiesId(String rabiesId) {
        this.rabiesId = rabiesId;
    }
    
    
}
