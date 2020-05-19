/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotipolist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class EjemploTipoList {

    /**
     * @param args the command line arguments
     */
    
    public EjemploTipoList(){
        Principal();
    }
    
    public void Principal(){
        List<Dato> lista = new ArrayList<>(); 
        Dato dato = new Dato();
        
        dato.setNombre("Brandon");
        dato.setEdad(22);
        lista.add(dato);
        dato = new Dato();
        dato.setNombre("Daniel");
        dato.setEdad(25);
        lista.add(dato);
        dato = new Dato();
        dato.setNombre("Javier");
        dato.setEdad(30);
        lista.add(dato);
        lista.forEach(elemento -> {
            System.out.println("Nombre "+ elemento.getNombre());
            System.out.println("Edad "+ elemento.getEdad());
        });
        
        System.out.println("\n\n Otra forma de mostrar los datos \n");
        for(Dato contenido : lista){
            System.out.println("Nombre "+ contenido.getNombre()+ "\n Edad "+ contenido.getEdad());
        }
        
        dato = new Dato();
        dato.setNombre("Gustavo");
        dato.setEdad(19);
        lista.add(dato);
        
        System.out.println("\n\n Otra forma de mostrar los datos \n");
        
        lista.stream().forEach((valores) -> {
            System.out.println("Nombre "+ valores.getNombre());
            System.out.println("Edad "+ valores.getEdad());
            
            if(valores.getNombre().equals("Daniel")){
                System.out.println("Se encontro el dato...");
            }
        });
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new EjemploTipoList();
    }
    
}
