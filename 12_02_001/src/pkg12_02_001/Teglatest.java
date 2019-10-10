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
public class Teglatest {
    double a;
    double b;
    double c;
    
    public double terfogat() {
        double terfogat = this.a * this.b * this.c;
        return terfogat;
              
    }
    
    public double felszin (){ 
        double felszin = 2 * ( this.a * this.b + this.a * this.c + this.b * this.c ) ;
        return felszin;
    }
}
