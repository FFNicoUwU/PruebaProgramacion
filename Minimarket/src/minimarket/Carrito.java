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
}

