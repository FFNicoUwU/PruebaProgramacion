/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minimarket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author duran_xa1
 * 
 */
public class Minimarket {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Inventario a = new Inventario();
        a.a();
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.println("Bienvenido al minimarket La Completa Feria");
            System.out.println("1.- Ver productos productos");
            System.out.println("2.- Agregar producto al carrito");
            System.out.println("3.- Eliminar producto"); /*Puede un comprador eliminar productos fuera de su carrito?, ni que fuera admin*/
            System.out.println("Escoja una opción: ");
            opcion = input.nextInt();
        switch(opcion){    
            case 1 -> {
                System.out.println("1.- Carnes 2.- Bebestibles 3.- Verduras");
                
                int opcion1;
                opcion1 = input.nextInt();
                 switch(opcion1){ 
                     case 1: 
                        a.listCarne();
                        System.out.println("Presione una tecla para volver al menú");
                        input.next();  
                        break;

                         case 2: 
                        a.listarBebestible();
                        System.out.println("Presione una tecla para volver al menú");
                        input.next();  
                        break;
            
            
            
                 }
            }
            case 2 ->{
            
            
            
            
            
            }
        }
        
        
                }while(opcion!=3);
    }
}