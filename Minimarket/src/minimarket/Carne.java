/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimarket;

/**
 *
 * @author duran_xa
 */
public class Carne extends Producto {
    //Atributo
    private String tipoAnimal;
    //Constructores
    public Carne(String nombre, String color, int precio, String tipoAnimal) {
        super(nombre, color, precio);
        this.tipoAnimal=tipoAnimal;
    }
    //Getter Y Setter 
    public String getTipoAnimal() {
        return tipoAnimal;
    }
    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    

    
    
}
