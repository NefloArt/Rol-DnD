package lector;

import java.util.Scanner;

public class LectorOpciones {
    Scanner sc = new Scanner(System.in);
    public static void OpcionesPrueba() {
        Scanner leer = new Scanner(System.in);
        LectorOpciones ataque = new LectorOpciones();
        String opcion;
        
        
        do {
            System.out.println("""
                           Te están persiguiendo. ¿Qué haces?
                           
                           a.Correr
                           b.Esperar
                           c.Atacar
                           """);
            opcion = leer.nextLine();
            
            if (!(opcion.equalsIgnoreCase("a")||opcion.equalsIgnoreCase("b")||opcion.equalsIgnoreCase("c"))) {
                System.out.println("No has introducido una de las opciones.");
            }
            
        } while (!(opcion.equalsIgnoreCase("a")||opcion.equalsIgnoreCase("b")||opcion.equalsIgnoreCase("c")));
        
        switch (opcion) {
            case "a" -> System.out.println("Te vas corriendo");
            case "b" -> System.out.println("Esperas");
            case "c" -> {
                System.out.println("Atacas");
                ataque.Ataque();
            }
            default -> {
            }
        }
    }
    
    public void Ataque(){
        String ataque;
        LectorOpciones magia = new LectorOpciones();
        do {
            System.out.println("""
                               ¿Cómo atacas?
                               
                               a.Cuerpo a cuerpo
                               b.Ataque mágico
                               c.Lanzar algo de tu alrededor
                               d.Ataque con arma
                               """);
            ataque = sc.nextLine();
            
            if (!(ataque.equalsIgnoreCase("a")||ataque.equalsIgnoreCase("b")||ataque.equalsIgnoreCase("c")||ataque.equalsIgnoreCase("d"))) {
                System.out.println("No has introducido una de las opciones.");
            }
        } while (!(ataque.equalsIgnoreCase("a")||ataque.equalsIgnoreCase("b")||ataque.equalsIgnoreCase("c")||ataque.equalsIgnoreCase("d")));
        switch (ataque) {
            case "a" -> System.out.println("Les enfrentas cuerpo a cuerpo");
            case "b" -> {
                System.out.println("Preparas un ataque mágico");
                magia.Magia();
            }
            case "c" -> System.out.println("Buscas algo a tu alrededor para lanzarles");
            case "d" -> System.out.println("Sacas tu arma y preparas un ataque");
            default -> {
            }
        }
    }
    
    public void Magia(){
        String magia;
        do {
            System.out.println("""
                               Elige un hechizo a realizar:
                               a. Llamarada
                               b. Témpano
                               c. Muralla de piedra
                               d. Enredaderas
                               """);
            magia = sc.nextLine();
            if (!(magia.equalsIgnoreCase("a")||magia.equalsIgnoreCase("b")||magia.equalsIgnoreCase("c")||magia.equalsIgnoreCase("d"))) {
                System.out.println("No has introducido una de las opciones.");
            }
        } while (!(magia.equalsIgnoreCase("a")||magia.equalsIgnoreCase("b")||magia.equalsIgnoreCase("c")||magia.equalsIgnoreCase("d")));
        
        switch (magia) {
            case "a" -> System.out.println("Lanzas una llamarada");
            case "b" -> System.out.println("Generas un témpano sobre ellos");
            case "c" -> System.out.println("Creas una muralla de piedra desde el suelo");
            case "d" -> System.out.println("Les atrapas en enredaderas");
            default -> {
            }
        }
    }
    
}
