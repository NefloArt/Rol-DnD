package Juego;

import personaje.ficha.FichaPersonaje;

public class Rol {
    
    public static void Esperar(){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
    
    public static void main(String[] args){
        FichaPersonaje.Ficha();
        
        FichaPersonaje.Check();
        
        boolean terminar = FichaPersonaje.Terminar();
        if (!terminar) {
            FichaPersonaje.Raza();
        
            Esperar();

            FichaPersonaje.Clase();

            Esperar();

            FichaPersonaje.Stats();

            Esperar();
        }
        
        FichaPersonaje.LeerFicha();
    }
}
