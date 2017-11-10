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
public class Faculty extends UEmployee {
    
    String name;
    double salary;
    
    String department;
    
    public Faculty(String name, double salary, String dep){
        
        super(name, salary);
        department = dep;
        
    }
    
    public String getDepartment(){
        
        return department;
        
    }
    
}
