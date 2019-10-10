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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Homero ho = new Homero();
ho.setCelsius(0);
System.out.println(ho.getFahrenheit());
System.out.println(ho.getCelsius());
ho.setFahrenheit(212);
System.out.println(ho.getFahrenheit());
System.out.println(ho.getCelsius());
    }
    
}
