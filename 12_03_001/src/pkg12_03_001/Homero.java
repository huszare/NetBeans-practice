/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_03_001;

/**
 *
 * @author
 */
public class Homero {
    double celsius;
    
    void setFahrenheit(double fahr){
         celsius = ((fahr - 32) * 5) / 9;
         
    }        
    
    void setCelsius(double celsius){
           this.celsius = celsius;
    }        
    
    double getCelsius() {
        return celsius;
    }       
    
    double getFahrenheit() {
        double fahr = celsius * 9 / 5 +32;
        return fahr;
    }
}
