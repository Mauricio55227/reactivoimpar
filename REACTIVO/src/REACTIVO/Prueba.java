/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package REACTIVO;

 // @author MB
 
public class Prueba {

    public static void main(String[] args) {
        
        REACTIVO reactivo = new REACTIVO("Zoom", 100, 40, "Libre", 5);
        System.out.println(reactivo.calidad());
        System.out.println("");
        System.out.println(reactivo.toString());
        
    }
    
}
