/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimarket;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duran_xa
 */
public class Carrito implements calculo{
    
    Inventario a = new Inventario();

    List<Producto> listaProductos = new ArrayList<>();
    public int cantidadvac = 0;
    public int cantidadpol = 0;
    public int cantiadadcer = 0;
 
        
    
    @Override
    public int calcularnetocar(){
    int preciocerdo = a.cerdo.precio*cantiadadcer; 
    int preciovac= a.vaca.precio*cantidadvac;
    int preciopo= a.pollo.precio*cantidadpol;
    int netocarnes= preciocerdo+preciovac+preciopo;
        return netocarnes;
}

    @Override
    public float calculardscotcar() {
    int preciocerdo = a.cerdo.precio*cantiadadcer; 
    int preciovac= a.vaca.precio*cantidadvac;
    int preciopo= a.pollo.precio*cantidadpol;
    int netocarnes= preciocerdo+preciovac+preciopo;
    float totalcarne= netocarnes-netocarnes*dsctocar;
    return totalcarne;
    }
}