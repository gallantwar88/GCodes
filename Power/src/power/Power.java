/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package power;

/**
 *
 * @author Gallantwar88
 */
class Power {
    
    double base;
    double exponent;

    double power(double base, double exponent){
        if (exponent > 0)
            return  base * power(base,exponent - 1);
        else if (exponent < 0)
            return 1/base * power(base,exponent + 1);
        else 
            return 1;
    }
        
    public static void main(String[] args) {
        
        Power po = new Power();
        po.base = 2;
        po.exponent = -5;
        System.out.println(po.power(po.base,po.exponent));
    }
    
}
