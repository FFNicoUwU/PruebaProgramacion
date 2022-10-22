/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimarket;

/**
 *
 * @author nicop
 */
public class Vegetales extends Producto{
    //Atributo
    private String tipoVegetales;
    
    //Constructor

    public Vegetales(String tipoVegetales, String nombre, String color, int precio) {
        super(nombre, color, precio);
        this.tipoVegetales = tipoVegetales;
    }
    
    //Getter and Setter

    public String getTipoVegetales() {
        return tipoVegetales;
    }

    public void setTipoVegetales(String tipoVegetales) {
        this.tipoVegetales = tipoVegetales;
    }
    
    
}
