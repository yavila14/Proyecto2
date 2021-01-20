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
public class Figuras {
    //Definición de atributos publicos area y perimetro
    protected Integer area;
    protected Integer perimetro;
    
    //Constructor de clase que asigna valores a las variables al instanciar
    public Figuras(Integer area,Integer perimetro){
        
        //Valores enviados al momento de instanciar la clase
        this.area=area;
        this.perimetro=perimetro;
    
}
    //Metodo para pintar el valor de la variable en consola
    public void pintarArea(){
        System.out.println(this.area);

}
public void pintarperimetro(){
    System.out.println(this.perimetro);

}  
}
