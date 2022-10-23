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
    
    @Override
    public int calculardsctocer() {
        int preciocerdo = (int) (a.cerdo.precio-a.cerdo.precio*iva);
        return preciocerdo;  
    }
    @Override
    public int calculardsctovac() {
        int preciovac = (int) (a.vaca.precio-a.vaca.precio*iva);
        return preciovac;
    }
    @Override
    public int calculardsctopol() {
        int preciopol = (int) (a.pollo.precio-a.pollo.precio*iva);
        return preciopol;
      }
    @Override
    public int totalproductoscar() {
        
        return 0;
    }
    
}