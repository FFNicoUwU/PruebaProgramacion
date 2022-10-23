/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimarket;

/**
 *
 * @author Javier
 */
public class Bebestible extends Producto{
    //Atributos
    private String tipoBebestibles;
    
    
    //Contructores
    public Bebestible(String nombre, String TipoDeRefresco, int precio, String tipoBebestibles) {
        super(nombre,TipoDeRefresco, precio);
        this.tipoBebestibles=tipoBebestibles;
    }
    
     //Getter And Setter
    public String getTipoBebestibles() {
        return tipoBebestibles;
    }

    public void setTipoBebestibles(String tipoBebestibles) {
        this.tipoBebestibles = tipoBebestibles;
    }
@Override        
public String Descripcion(){
return "Nombre: "+this.nombre+"// Color: "+this.color+"// Precio: $"+this.precio+"// TipoBebestible: "+this.tipoBebestibles;
}
}