/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimarket;

import java.util.ArrayList;
import java.util.List;


public class Inventario {

    public Inventario() {
    }
//Creacion de objetos Bebestible
Bebestible Refresco = new Bebestible("Cocacola","Negra",1500,"vidrio");
Bebestible agua = new Bebestible("Cachantun","Transparente",1500,"Plastico");
Bebestible jugo = new Bebestible("Fanta","Naranja",1300,"Plastico");
                    
//Creacion de objetos carnes
Carne vaca = new Carne("Vacuno","Roja",4000,"Mamifero");
Carne cerdo = new Carne("Cerdo","Blanco",3000,"Mamifero");
Carne pollo = new Carne("Pollo","Blanco",2000,"Ave");


//Creacion de objetos Vegetales

Vegetales brocoli = new Vegetales("Brocoli","Verde",800, "Crucifera");
Vegetales Lechuga = new Vegetales("Lechuga", "Verde", 500, "Compuesta");
Vegetales Papa = new Vegetales("Papa","Marron", 400, "solanaceas");


//Creacion de Listas
List<Bebestible> listaBebestible = new ArrayList<>();
List<Carne> listaCarnes = new ArrayList<>();
List<Vegetales> listaVegetales = new ArrayList<>();

//Añadir Objetos a la lista
public void a(){
listaBebestible.add(Refresco);
listaBebestible.add(agua );
listaBebestible.add(jugo);

listaCarnes.add(cerdo);
listaCarnes.add(vaca );
listaCarnes.add(pollo);

listaVegetales.add(brocoli);
listaVegetales.add(Lechuga);
listaVegetales.add(Papa);
                    
            }

//Metodo para listar
public void listBebestible(){
       for (var i = 0; i < listaBebestible.size(); i++){
        System.out.println("Producto " + (i+1) + ": " + listaBebestible.get(i).Descripcion());
          }
}
public void listCarne(){
       for (var i = 0; i < listaCarnes.size(); i++){
           System.out.println("Producto " + (i+1) + ": " + listaCarnes.get(i).Descripcion());
       }
    }

public void listVegetales(){
       for (var i = 0; i < listaVegetales.size(); i++){
           System.out.println("Producto " + (i+1) + ": " + listaVegetales.get(i).Descripcion());
       } 

       
    }
        }