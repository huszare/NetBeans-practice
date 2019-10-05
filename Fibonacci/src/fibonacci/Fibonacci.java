/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sz;
        int i = 1;
        int j = 1;
        System.out.print("A Fibonacci-számsorozatot meddig írjam ki? ");
        sz = sc.nextInt();
        int k = i + j;
        if (k <= sz) {
            System.out.print("1 1 ");
            while (k < sz) {
                System.out.print(k + " ");
                i = j;
                j = k;
                k = i + j;
            }
        }
        System.out.println("");
    }

}
