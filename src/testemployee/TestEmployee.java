/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testemployee;

import java.util.Scanner;

/**
 *
 * @author EvMcQ5970
 */
public class TestEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String name;
        double salary;
        String department;
        String title;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the university employee's name: ");
        name = input.nextLine();
        System.out.println("Enter the university employee's salary: ");
        salary = input.nextDouble();
        
        UEmployee employee = new UEmployee(name, salary);
        //System.out.println(employee);
        name = employee.getName();
        salary = employee.getSalary();
        System.out.println(name + " " + salary);
        
        Faculty jane = new Faculty("Jane", 20000, "English");
        //System.out.println(jane);
        name = jane.getName();
        salary = jane.getSalary();
        department = jane.getDepartment();
        System.out.println(name + " " + salary + " " + department);
        
        Staff paul = new Staff("Paul", 50000, "Security");
        //System.out.println(paul);
        name = paul.getName();
        salary = paul.getSalary();
        title = paul.getTitle();
        System.out.println(name + " " + salary + " " + title);
    }
    
}
