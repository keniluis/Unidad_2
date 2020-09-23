
package ejesdo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejesdo {

    private static ArrayList<Empleado> empleados = new ArrayList();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
         
          int  opcion;
        
          
           do{
          
               System.out.println("1. Agregar  Empleado");
               System.out.println("2. Eliminar Empleado por ID");
               System.out.println("3. Actualizar Empleado");
               System.out.println("4. Mostrar Todos los Empleado");
               System.out.println("5. Salir");
               
               System.out.println("Ingrese una Opcion: ");
               opcion = sc.nextInt();
               
               switch (opcion)  {
               case 1:
               int id = 0;
               String nombre = "";
               String apellido = "";
               
               System.out.println("Ingrese ID del Empleado");
                id = sc.nextInt();
               
                System.out.println("Ingrese Nombre del Empleado");
                nombre= sc.nextLine();
               
                System.out.println("Ingrese Apellido del Empleado");
                apellido = sc.nextLine();
               
                   agregarPersona(id, nombre, apellido);
               
               break;
               
               case 2:
               break;
               
               case 3:
               break;
               
               case 4:
               break;
               
               case 5:
               System.exit(0);
               break;
               
               default:
              System.out.println("Opcion No Disponible");     
               break;

           }
           
           }while(opcion!=5);
           }
           
      public  static void agregarPersona (int id, String nombre, String Apellido){
    
       
             
          }
}
