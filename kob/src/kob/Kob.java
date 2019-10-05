/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kob;
import java.util.Scanner;
/**
 *
 * @author
 */
public class Kob {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 20; i++) {
            double kob = Math.pow(i, 3);
            System.out.printf("%.0f ", kob);
                            
        }
        System.out.println("");    
    }
    }
    

