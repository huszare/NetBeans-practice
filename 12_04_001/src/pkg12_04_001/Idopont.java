/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_04_001;

/**
 *
 * @author
 */
public class Idopont {
    int ora;
    int perc;
    int masodperc;
    
    void kiir(){
        System.out.printf("%02d:%02d:%02d%n", ora, perc, masodperc);
    }
    
     void novel(int mp){
         int time = 3600 * ora + 60 * perc + masodperc + mp;
         this.ora = time / 3600;
         if (ora > 23)
             this.ora = ora % 24;
         time = time % 3600;
         this.perc = time / 60;
         masodperc = time % 60;
         
     }
}
