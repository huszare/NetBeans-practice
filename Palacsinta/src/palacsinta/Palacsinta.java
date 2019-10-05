/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palacsinta;
import java.util.Scanner;

/**
 *
 * @author
 */
public class Palacsinta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mennyi ideig sült a palacsinta? ");
        int time = sc.nextInt();
        if (time >= 3 && time <= 4)
                System.out.println("A palacsinta jó.");
        else {
        if (time > 4) 
                System.out.println("A palacsinta égett.");
        else
            System.out.println("A palacsinta nyers.");}

        
        
        
   
    }
    
}
