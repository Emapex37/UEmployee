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
public class Staff extends UEmployee{
    
    String name;
    double salary;
    
    String title;
    
    public Staff(String name, double salary, String t){
        
        super(name, salary);
        title = t;
        
    }
    
    public String getTitle(){
        
        return title;
        
    }
    
}
