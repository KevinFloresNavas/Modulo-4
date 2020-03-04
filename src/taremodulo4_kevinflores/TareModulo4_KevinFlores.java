/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taremodulo4_kevinflores;

import Helpers.Ciudadano;
import Helpers.CostarRica;
import Helpers.ElSalvador;
import Helpers.Honduras;

/**
 *
 * @author Kevin
 */
public class TareModulo4_KevinFlores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //PRIMERA PARTE 
        Ciudadano cd = new Ciudadano();
   
        System.out.println("Nombre:              "+cd.getNombre());
        System.out.println("Edad:                "+cd.getEdad());
        System.out.println("Años de experiencia: " +cd.getAñosExperiencia());
        System.out.println("");
        System.out.println("");
        
        
        //SEGUNDA PARTE
        Honduras hn =new Honduras();
        CostarRica cr = new CostarRica();
        ElSalvador es=new ElSalvador();
      
        System.out.println("Pais:       " +hn.getPais());
        System.out.println("Presidente: "+hn.getPresidente());
        System.out.println("");
        System.out.println("Pais:       "+cr.getPais());
        System.out.println("Presidente: "+cr.getPresidente());
        System.out.println("");
        System.out.println("Pais:       "+es.getPais());
        System.out.println("Presidente: "+es.getPresidente());
        
        
    }
    
}
