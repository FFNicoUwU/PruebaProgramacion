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
        Carrito c = new Carrito();
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
                    a.listBebestible();
                    System.out.println("Presione una tecla para volver al menú");
                    input.next();  
                    break;
                        
                    case 3:
                    a.listVegetales();
                    System.out.println("Presione para volver al menú");   
                    input.next();
                    break;
            
            
                 }
            }
            case 2 ->{
                System.out.println("1.- Carnes 2.- Bebestibles 3.- Verduras");
                int opcion1;
                opcion1 = input.nextInt();
                switch(opcion1){ 
                    case 1  :{
                        a.listCarne();
                        System.out.println("Ingrese el nombre");
                        String producto=input.next();
                        if (producto.equals(a.cerdo.nombre)){
                            c.listaProductos.add(a.cerdo);}
                            else if (producto.equals(a.vaca.nombre)){
                                    c.listaProductos.add(a.vaca);}
                                    else if (producto.equals(a.pollo.nombre)){
                                            c.listaProductos.add(a.pollo);}
                        else
                            System.out.println("No existe...");
                            break;}
                    
                    case 2 :{
                        a.listBebestible();
                        System.out.println("Ingrese el nombre");
                        String producto=input.next();
                        if (producto.equals(a.Refresco.nombre)){
                            c.listaProductos.add(a.Refresco);}
                            else if (producto.equals(a.agua.nombre)){
                                    c.listaProductos.add(a.agua);}
                                    else if (producto.equals(a.jugo.nombre)){
                                            c.listaProductos.add(a.jugo);}
                        else
                            System.out.println("No existe...");
                            break;}
                        
                    case 3 : {
                        a.listVegetales();
                        System.out.println("Ingrese el nombre: ");
                        String producto=input.next();
                        if (producto.equals(a.brocoli.nombre)){
                            c.listaProductos.add(a.brocoli);}
                            else if (producto.equals(a.Lechuga.nombre)){
                                c.listaProductos.add(a.Lechuga);}
                                else if (producto.equals(a.Papa.nombre)){
                                    c.listaProductos.add(a.Papa);}
                        else
                            System.out.println("No existe...");
                            break;
                    }
                 }
                    for (var i = 0; i < c.listaProductos.size(); i++){
                    System.out.println("Producto " + (i+1) + ": " + c.listaProductos.get(i).Descripcion());}
                    String opcio = input.next();
            
            
            
            
            }
        }
        
        
                }while(opcion!=3);
    }
}