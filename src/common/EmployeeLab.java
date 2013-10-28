/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import common.Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author User
 */
public class EmployeeLab {
        public static void main(String[] args) {

        Employee e1 = new Employee("Doe", "John", "333-33-3333");
        Employee e2 = new Employee("Smith", "Sally", "111-11-1111");
        Employee e3 = new Employee("Jones","Bob", "444-44-4444");
        Employee e4 = new Employee("Dean","Sam", "444-44-4444");
        
            //Lab 1 & 2
//        List employeeList = new ArrayList();
//        // only objects can be stored in a List
//        employeeList.add(e1);
//        employeeList.add(e2);
//        employeeList.add(e3);
//        employeeList.add(e4);
//        
//        int size = employeeList.size();
//        
//        System.out.println("List size = " + size);
//        
//        Object emp = (Employee) employeeList.get(2);
//        System.out.println(emp);
//        
//        for (int i = 0; i < employeeList.size(); i++){
//            emp = employeeList.get(i);
//            System.out.println(emp);
//        }
        
            // Lab 3 & 4
           
//        List<Employee> employeeList = new ArrayList<Employee>();
//        // only objects can be stored in a List
//        employeeList.add(e1);
//        employeeList.add(e2);
//        employeeList.add(e3);
//        employeeList.add(e4);
//        
//        int size = employeeList.size();
//        
//        System.out.println("List size = " + size);
//        
//        Object emp = employeeList.get(2);
//        System.out.println(emp);
//        
//        for (Object o : employeeList){
//            System.out.println(o);
//        }
//        
//        Set<Employee> employeeSet = new HashSet<Employee>(employeeList);
//        
//        employeeList = new ArrayList<Employee>(employeeSet);
//        
//        int size2 = employeeList.size();
//        
//        System.out.println("List size = " + size2);
        
            
            // Lab 5
                
//        Map<String, Employee> map =
//                new HashMap<String, Employee>();
//        map.put("333-33-3333", e1);
//        map.put("111-11-1111", e2);
//        map.put("444-44-4444", e3);
//        map.put("444-44-4444", e4);
//        
//        Employee e = (Employee)map.get("111-11-1111");
//        System.out.println(e);
//        
//        Set<String> keys = map.keySet();
//        for(String key : keys) {
//            Object found = map.get(key);
//            System.out.println(found.toString());
//        }
        
        // Lab 6
       
        Map<String,Employee> map = new TreeMap<String,Employee>();
        map.put("333-33-3333", e1);
        map.put("111-11-1111", e2);
        map.put("444-44-4444", e3);
        map.put("444-44-4444", e4);
        
        Employee e = (Employee)map.get("111-11-1111");
        System.out.println(e);
        
        Set<String> keys = map.keySet();
        for(String key : keys) {
            Object found = map.get(key);
            System.out.println(found.toString());
        }
    }
}
