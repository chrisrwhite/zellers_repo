/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zellerscongruence;
import javax.swing.JOptionPane;
import java.util.*;


/**
 *
 * @author chriswhite
 */
public class Zellerscongruence {

    public static void main(String[] args) {
    // read in user input
    int year = Integer.parseInt(JOptionPane.showInputDialog("\nEnter year (e.g. 2012): "));
    int m = Integer.parseInt(JOptionPane.showInputDialog("\nEnter month: 1-12: "));
    int q = Integer.parseInt(JOptionPane.showInputDialog("\nEnter the day of the month: 1-31: "));
    
    String output = "";
    
    Map<Integer, String> dictionary = new HashMap<Integer, String>();
  
    // adjust date for formula for january and february
    if(m == 1) {
        m = 13;
        year = year - 1;
    } else if (m == 2){
        m = 14; 
        year = year - 1;
    }else {
    }    
    
    int j = year/100;
    int k = year%100;
    

    // zellers congurency equation
    int h = (q + (26*(m + 1))/10 + k + k/4 + j/4 + 5*j)%7; 
 
    dictionary.put(0, "Saturday");
    dictionary.put(1, "Sunday");   
    dictionary.put(2, "Monday");   
    dictionary.put(3, "Tuesday");
    dictionary.put(4, "Wednesday");   
    dictionary.put(5, "Thursday");  
    dictionary.put(6, "Friday");  
    
    output += "Day of the week is " + dictionary.get(h);       
        

    JOptionPane.showMessageDialog(null, output);
    }
    
}
