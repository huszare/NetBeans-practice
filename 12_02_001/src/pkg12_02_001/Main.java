/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_02_001;

/**
 *
 * @author
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teglatest tegla = new Teglatest();
        tegla.a = 24.68;
        tegla.b = 12.34;
        tegla.c = 0.36;
        System.out.println(tegla.terfogat());
        System.out.println(tegla.felszin());
    }
    
}
