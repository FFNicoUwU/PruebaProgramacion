/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimarket;


/**
 *
 * @author duran_xa
 */
public abstract class Producto {
    //Atributos
    protected String nombre,color;
    protected int precio;
    
    //Constructores
    public Producto(String nombre, String color, int precio) {
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
    }
    //Getter Y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
   
public String Descripcion(){
return "Nombre: "+this.nombre+"// Color: "+this.color+"// Precio: $"+this.precio;


}
    
    
}