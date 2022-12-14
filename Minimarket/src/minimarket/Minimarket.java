/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minimarket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;


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
        do {
            System.out.println("Bienvenido al minimarket La Completa Feria");
            System.out.println("1.- Productos Disponibles de la tienda");
            System.out.println("2.- Agregar Productos al Carrito");
            System.out.println("3.- Modificar Carrito");
            System.out.println("4.- Imprimir Boleta");
            System.out.println("5.- Salir");
            System.out.println("Escoja una opción: ");
            opcion = input.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Elija la categoria en la que desea comprar");
                    System.out.println("1.- Carnes 2.- Bebestibles 3.- Verduras");
                    System.out.println("Elija una opcion: ");
                    int opcion1;
                    opcion1 = input.nextInt();
                    switch (opcion1) {
                        case 1:
                            System.out.println("===== Categoria Carnes =====");
                            a.listCarne();
                            System.out.println("Presione una tecla para volver al menú");
                            input.next();
                            break;

                        case 2:
                            System.out.println("===== Categoria Bebestibles =====");
                            a.listBebestible();
                            System.out.println("Presione una tecla para volver al menú");
                            input.next();
                            break;

                        case 3:
                            System.out.println("===== Categoria Verduras =====");
                            a.listVegetales();
                            System.out.println("Presione una tecla para volver al menú");
                            input.next();
                            break;


                    }
                }
                case 2 -> {
                    System.out.println("======= Agregar Productos =======");
                    System.out.println("1.- Carnes 2.- Bebestibles 3.- Verduras");
                    System.out.println("Elija una opcion: ");
                    int opcion1;
                    opcion1 = input.nextInt();
                    int cantidad = 0;
                    switch (opcion1) {
                        //Lista Carnes
                        case 1  :{
                            a.listCarne();
                            System.out.println("Ingrese el nombre");
                            String producto=input.next();
                            if (producto.equals(a.cerdo.nombre)){
                                c.listaProductos.add(a.cerdo);
                                System.out.println("Ingrese la cantidad que desea: ");
                                cantidad = input.nextInt();
                                c.cantiadadcer=cantidad;
                            }
                            else if (producto.equals(a.vaca.nombre)){
                                c.listaProductos.add(a.vaca);
                                System.out.println("Ingrese la cantidad que desea: ");
                                cantidad = input.nextInt();
                                c.cantidadvac=cantidad;}

                            else if (producto.equals(a.pollo.nombre)){
                                c.listaProductos.add(a.pollo);
                                System.out.println("Ingrese la cantidad que desea: ");
                                cantidad = input.nextInt();
                                c.cantidadpol=cantidad;}
                            else
                                System.out.println("No existe...");
                            break;}
                        //Lista Bebestible
                        case 2: {
                            a.listBebestible();
                            System.out.println("Ingrese el nombre del producto deseado: ");
                            String producto = input.next();
                            if (producto.equals(a.Refresco.nombre)) {
                                c.listaProductos.add(a.Refresco);
                                System.out.println("Ingrese la cantidad que desea: ");
                                cantidad = input.nextInt();
                                c.cantidadref=cantidad;}

                            else if (producto.equals(a.agua.nombre)) {
                                c.listaProductos.add(a.agua);
                                System.out.println("Ingrese la cantidad que desea: ");
                                cantidad = input.nextInt();
                                c.cantidadagua=cantidad;}

                            else if (producto.equals(a.jugo.nombre)) {
                                c.listaProductos.add(a.jugo);
                                System.out.println("Ingrese la cantidad que desea: ");
                                cantidad = input.nextInt();
                                c.cantidadjugo=cantidad;}

                            else
                                System.out.println("El producto deseado no existe...");
                            break;
                        }
                        //Lista Vegetales
                        case 3: {
                            a.listVegetales();
                            System.out.println("Ingrese el nombre del producto deseado: ");
                            String producto = input.next();
                            if (producto.equals(a.brocoli.nombre)) {
                                c.listaProductos.add(a.brocoli);
                                System.out.println("Ingrese la cantidad que desea: ");
                                cantidad = input.nextInt();
                                c.cantidadbroc=cantidad;}

                            else if (producto.equals(a.Lechuga.nombre)) {
                                c.listaProductos.add(a.Lechuga);
                                System.out.println("Ingrese la cantidad que desea: ");
                                cantidad = input.nextInt();
                                c.cantidadlechu=cantidad;}

                            else if (producto.equals(a.Papa.nombre)) {
                                c.listaProductos.add(a.Papa);
                                System.out.println("Ingrese la cantidad que desea: ");
                                cantidad = input.nextInt();
                                c.cantidadpapa=cantidad;}
                            else
                                System.out.println("El producto deseado no existe...");
                            break;
                        }


                    }
                    for (var i = 0; i < c.listaProductos.size(); i++) {
                        System.out.println("===== Productos en el carrito =====");
                        System.out.println("Producto " + (i + 1) + ": " + c.listaProductos.get(i).Descripcion());
                    }
                    String opcio = input.next();
                }
                
                
                //Opcion de Modificar Carrito
                case 3 -> {
                    int cantidad = 0;
                    System.out.println("======= Modificar Carrito ======");
                    System.out.println("Elija el Producto que desea Modificar :3");
                    System.out.println("1.- Carnes 2.- Bebestibles 3.- Verduras");
                    System.out.println("Elija una opcion: ");
                    int opcion1;
                    opcion1 = input.nextInt();
                    switch (opcion1) {
                        //Modificacion Carnes
                        case 1  :{
                            a.listCarne();
                            System.out.println("Ingrese el nombre");
                            String producto=input.next();
                            if (producto.equals(a.cerdo.nombre)){
                                c.listaProductos.add(a.cerdo);
                                System.out.println("Ingrese la cantidad que desea: ");
                                cantidad = input.nextInt();
                                c.cantiadadcer=cantidad;
                            }
                            else if (producto.equals(a.vaca.nombre)){
                                c.listaProductos.add(a.vaca);
                                System.out.println("Ingrese la cantidad que desea: ");
                                cantidad = input.nextInt();
                                c.cantidadvac=cantidad;}

                            else if (producto.equals(a.pollo.nombre)){
                                c.listaProductos.add(a.pollo);
                                System.out.println("Ingrese la cantidad que desea: ");
                                cantidad = input.nextInt();
                                c.cantidadpol=cantidad;}
                            else
                                System.out.println("No existe...");
                            break;}
                        //Modificacion Bebestible
                        case 2: {
                            a.listBebestible();
                            System.out.println("Ingrese el nombre del producto deseado: ");
                            String producto = input.next();
                            if (producto.equals(a.Refresco.nombre)) {
                                c.listaProductos.add(a.Refresco);
                                System.out.println("Ingrese la cantidad que desea: ");
                                cantidad = input.nextInt();
                                c.cantidadref=cantidad;}

                            else if (producto.equals(a.agua.nombre)) {
                                c.listaProductos.add(a.agua);
                                System.out.println("Ingrese la cantidad que desea: ");
                                cantidad = input.nextInt();
                                c.cantidadagua=cantidad;}

                            else if (producto.equals(a.jugo.nombre)) {
                                c.listaProductos.add(a.jugo);
                                System.out.println("Ingrese la cantidad que desea: ");
                                cantidad = input.nextInt();
                                c.cantidadjugo=cantidad;}

                            else
                                System.out.println("El producto deseado no existe...");
                            break;
                        }
                        //Moficacion Vegetales
                        case 3: {
                            a.listVegetales();
                            System.out.println("Ingrese el nombre del producto que desea Modificar: ");
                            String producto = input.next();
                            if (producto.equals(a.brocoli.nombre)) {
                                c.listaProductos.add(a.brocoli);
                                System.out.println("Ingrese la cantidad que desea Modificar: ");
                                cantidad = input.nextInt();
                                c.cantidadbroc=cantidad;}

                            else if (producto.equals(a.Lechuga.nombre)) {
                                c.listaProductos.add(a.Lechuga);
                                System.out.println("Ingrese la cantidad que desea Modificar: ");
                                cantidad = input.nextInt();
                                c.cantidadlechu=cantidad;}

                            else if (producto.equals(a.Papa.nombre)) {
                                c.listaProductos.add(a.Papa);
                                System.out.println("Ingrese la cantidad que desea Modificar: ");
                                cantidad = input.nextInt();
                                c.cantidadpapa=cantidad;}
                            else
                                System.out.println("El producto deseado no existe...");
                            break;
                        }

                }
                         }
                //Boleta del Minimarket
                case 4 -> {
                int netover=c.calcularnetover();
                int netocar=c.calcularnetocar();
                int netobeb=c.calcularnetobeb();
                float totalcar=c.calculardscotcar();
                float totalbeb=c.calculardscotbeb();
                float netototal=c.calcularneto(netover, totalbeb, totalcar);
                float totaliva=c.calculatotaliva(netover, totalbeb, totalcar);
                c.boleta(netover,totalbeb,totalcar,netobeb,netocar,netototal,totaliva);
                
                String opcio = input.next(); 
                
                }
            }
        }while (opcion != 5) ;
        }
    }