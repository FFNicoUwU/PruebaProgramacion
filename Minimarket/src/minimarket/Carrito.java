/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimarket;

import java.util.ArrayList;
import java.util.List;



 // @author duran_xa

public class Carrito implements calculo {

    Inventario a = new Inventario();

    List<Producto> listaProductos = new ArrayList<>();

    //Cantidad Vacuno
    public int cantidadvac = 0;
    public int cantidadpol = 0;
    public int cantiadadcer = 0;
    //Cantidad Bebestibles
    public int cantidadref = 0;
    public int cantidadagua = 0;
    public int cantidadjugo = 0;

    //Cantidad Verduras
    public int cantidadbroc = 0;
    public int cantidadlechu = 0;
    public int cantidadpapa = 0;

    //Total Carnes
    @Override
    public int calcularnetocar() {
        int preciocerdo = a.cerdo.precio * cantiadadcer;
        int preciovac = a.vaca.precio * cantidadvac;
        int preciopo = a.pollo.precio * cantidadpol;
        int netocarnes = preciocerdo + preciovac + preciopo;
        return netocarnes;
    }

    @Override
    public float calculardscotcar() {
        int preciocerdo = a.cerdo.precio * cantiadadcer;
        int preciovac = a.vaca.precio * cantidadvac;
        int preciopo = a.pollo.precio * cantidadpol;
        int netocarnes = preciocerdo + preciovac + preciopo;
        float totalcarne = netocarnes - netocarnes * dsctocar;
        return totalcarne;
    }

    public void listar(float totalcarne) {

        System.out.println(totalcarne);
    }

    //Total Bebestibles
    @Override
    public int calcularnetobeb() {
        int preciorefresco = a.Refresco.precio * cantidadref;
        int precioagua = a.agua.precio * cantidadagua;
        int preciojugo = a.jugo.precio * cantidadjugo;
        int netobeb = preciorefresco + precioagua + preciojugo;
        return netobeb;

    }

    @Override
    public float calculardscotbeb() {
        int preciorefresco = a.Refresco.precio * cantidadref;
        int precioagua = a.agua.precio * cantidadagua;
        int preciojugo = a.jugo.precio * cantidadjugo;
        int netobeb = preciorefresco + precioagua + preciojugo;
        float totalbeb = netobeb - netobeb * dsctobeb;
        return totalbeb;
    }

    //Total Verduras
    @Override
    public int calcularnetover() {
        int preciobrocoli = a.brocoli.precio * cantidadbroc;
        int preciolechuga = a.Lechuga.precio * cantidadlechu;
        int preciopapa = a.Papa.precio * cantidadpapa;
        int netover = preciobrocoli + preciolechuga + preciopapa;
        return netover;

    }
    
    public float calcularneto(int netover,float totalbeb,float totalcar){
        float neto= netover + totalbeb + totalcar;
    
    return neto;
    }
    
    public float calculatotaliva(int netover,float totalbeb,float totalcar){
    float neto= netover + totalbeb + totalcar;
    float total=neto+neto*iva;
    return total;}
    
     public void boleta(int netover,float totalbeb,float totalcar,int netobeb,int netocar,float neto,float total){
         
         System.out.println("-------Boleta------");
         System.out.println("Producto: "+a.Lechuga.nombre+"  Cantidad: "+cantidadlechu+"   Preciounit: $"+a.Lechuga.precio);
         System.out.println("Producto: "+a.Papa.nombre+"  Cantidad: "+cantidadpapa+"   Preciounit: $"+a.Papa.precio);
         System.out.println("Producto: "+a.brocoli.nombre+"  Cantidad: "+cantidadbroc+"   Preciounit: $"+a.brocoli.precio);
         System.out.println("");
         System.out.println("Producto: "+a.cerdo.nombre+"  Cantidad: "+cantiadadcer+"   Preciounit: $"+a.cerdo.precio);
         System.out.println("Producto: "+a.vaca.nombre+"  Cantidad: "+cantidadvac+"   Preciounit: $"+a.vaca.precio);
         System.out.println("Producto: "+a.pollo.nombre+"  Cantidad: "+cantidadpol+"   Preciounit: $"+a.pollo.precio);
         System.out.println("");
         System.out.println("Producto: "+a.Refresco.nombre+"  Cantidad: "+cantidadref+"   Preciounit: $"+a.Refresco.precio);
         System.out.println("Producto: "+a.agua.nombre+"  Cantidad: "+cantidadagua+"   Preciounit: $"+a.agua.precio);
         System.out.println("Producto: "+a.jugo.nombre+"  Cantidad: "+cantidadjugo+"   Preciounit: $"+a.jugo.precio);
         System.out.println("");
         System.out.println("Total Carnes: $"+netocar );
         System.out.println("Total Bebidas: $"+netobeb);
         System.out.println("Total Verduras: $"+netover);
         System.out.println("");
         System.out.println("Total Carnes con descuento: $"+totalcar);
         System.out.println("Total Bebidas con descuento: $"+totalbeb);
         System.out.println("");
         System.out.println("");
         System.out.println("Subtotal: $"+neto);
         System.out.println("Total: $"+total);
         
         
         System.out.println("Gracias por comprar!!!");
     
     }
}

