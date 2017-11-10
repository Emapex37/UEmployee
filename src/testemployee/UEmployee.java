/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testemployee;

/**
 *
 * @author EvMcQ5970
 */
public class UEmployee {
    
    String employeeName;
    double salary;
    
    public UEmployee(String name, double sal){
        
        employeeName = name;
        salary = sal;
        
    }
    
    public String getName(){
        
        return employeeName;
        
    }
    
    public double getSalary(){
        
        return salary;
        
    }
    
}
