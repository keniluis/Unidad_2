/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejesdo;


public class operaciones {
    int a, b, sum, res, mul;
    float div;
    
    public operaciones (){
        System.out.println("nueva operacion ");
        
    }
     public int suma (int x,int y){
       sum = x+y;
       return sum;
     }
     public int resta (int x,int y ){
       res = x-y;
       return res;
     }
     public int multiplicacion (int x,int y){
       mul = x*y;
       return mul;
     }
    public float division (int x,int y){
       div = x/y;
       return div;
     }
}
