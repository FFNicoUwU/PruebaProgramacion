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
    public Bebestible(String marca, String TipoDeRefresco, int precio, String tipoBebestibles) {
        super(marca,TipoDeRefresco, precio);
        this.tipoBebestibles=tipoBebestibles;
    }
    
     //Getter And Setter
    public String getTipoBebestibles() {
        return tipoBebestibles;
    }

    public void setTipoBebestibles(String tipoBebestibles) {
        this.tipoBebestibles = tipoBebestibles;
    }
    
}
