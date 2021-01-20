/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;
import  javax.swing.*;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            //Se crea el objeto de la clase figuras,asignando los valores al constructor
            Figuras Figuras=new Figuras(5,10);
            //Se llama el metodo pintar area, que tiene el valor 5 gracias al constructor
            Figuras.pintarArea();
            //Se llama el metodo pintar perimetro, que tiene el valor 10 gracias al constructor
            Figuras.pintarperimetro();
            //Se cambia el valor del atributo area de forma directa ya que la variable es publica
            Figuras.area=15;
            
            //Se llama el metodo pintar area, que tiene valor 15 luego de modificar el valor
            Figuras.pintarArea();
    }
    
}
