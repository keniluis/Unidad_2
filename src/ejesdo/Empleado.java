/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejesdo;


public class Empleado {
    
   private String salario;
   
    //Constructor por defecto
    Empleado(){
        
    this.salario="";
    }
    
  
    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

   
   @Override
    public String toString(){
        return salario;
    }
    
    
    
}
