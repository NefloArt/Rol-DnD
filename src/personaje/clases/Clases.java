package personaje.clases;

import java.util.ArrayList;

public class Clases {
    ArrayList<String> clases = new ArrayList<>();
    ArrayList<String> definiciones = new ArrayList<>();
    
    public void addRazas(){
        
        clases.add("Barbaro");
        clases.add("Bardo");
        clases.add("Clerigo");
        clases.add("Druida");
        clases.add("Guerrero");
        clases.add("Monje");
        clases.add("Paladin");
        clases.add("Tirador");
        clases.add("Picaro");
        clases.add("Hechicero");
        clases.add("Brujo");
        clases.add("Mago");
    }
    
    public void setClases(ArrayList listaClases){
        this.clases = listaClases;
    }
    
    public ArrayList getClases(){
        return clases;
    }
    
    public void addDefi(){
        definiciones.add("""
                         En los inicios, la Bárbaro era una subclase de Guerrero, que eventualmente evolucionó hasta ser una clase independiente.
                         Se le conoce por destacar en batalla a través de una combinación de furia y fuerza.
                         
                         A menudo, el Bárbaro es menos hábil que el Guerrero, aunque es lo suficientemente fuerte como para compensar ese déficit
                         con su fuerza y agresividad integral.
                         """);
        definiciones.add("""
                         Los Bardos son personajes versátiles, capaces de luchar y usar sus mentes. La principal característica de un Bardo es que
                         tiene el don de la palabra; tanto así que puede convertir las palabras en hechizos mágicos.
                         """);
        definiciones.add("""
                         La combinación de fuerza y magia divina convierte a los Clérigos en los maestros de la sanación. Los personajes de esta
                         clase de D&D pueden controlar a los muertos vivientes y tienen poderes sobre la vida y la muerte, por lo que son extremadamente
                         útiles en diversas situaciones.
                         """);
        definiciones.add("""
                         Los Druidas son maestros de la naturaleza. Al igual que los Clérigos, tienen el don de la magia, aunque sus poderes no
                         funcionan con los muertos vivientes. No obstante, sus hechizos son efectivos con la naturaleza; a tal punto que los Druidas
                         pueden transformarse en diversos tipos de animales.
                         """);
        definiciones.add("""
                         Los Guerreros pueden tener una variedad de orígenes. Pueden ser antiguos soldados, aventureros, escoltas o reyes bandidos.
                         Pero indudablemente, su habilidad para pelear los conecta a todos. Son personajes vigorosos, fuertes, tácticos y hábiles
                         con las armas.
                         """);
        definiciones.add("""
                         Los monjes son hábiles guerreros con un lado místico. Debes ver a estos personajes como maestros de la disciplina. Son
                         introvertidos y no necesariamente imponentes por su físico. Pero no te dejes llevar por eso, pueden ser mortales gracias
                         a su aparente conexión con otro mundo.
                         """);
        definiciones.add("""
                         Los Paladines son la clase de D&D unidos por su honor y ética. En esencia, son caballeros del reino con habilidades
                         para la lucha y los hechizos, aunque siempre deben mantenerse en el lado del bien y preservar la justicia en todo momento.
                         """);
        definiciones.add("""
                         La Pícaro era una clase base oficial del manual del jugador de las primeras ediciones de Dungeons & Dragons. Como te
                         imaginarás, el Pícaro no sigue las reglas. Son sigilosos y hábiles.
                                                  
                         Sus talentos principales son encontrar y desarmar trampas, forzar cerraduras y acabar con oponentes incautos con sus ataques furtivos.
                         """);
        definiciones.add("""
                         Con la mano en alto, un semielfo silba al halcón que vuela en círculos por encima de él, llamando al ave para que
                         vuelva a su lado. Susurrando instrucciones en élfico, señala al oso lechuza que ha estado siguiendo y envía al halcón
                         para distraer a la criatura mientras prepara su arco.
                         
                         Lejos del bullicio de las ciudades y pueblos, más allá de los setos que protegen las granjas más distantes de los
                         terrores de la naturaleza, en medio de los densos árboles de bosques sin caminos y a través de amplias y desiertas
                         llanuras, los tiradores mantienen su vigilancia interminable.
                         """);
        definiciones.add("""
                         Puede que veas al Hechicero titubear ante una confrontación física, pero ellos son maestros de la magia. Específicamente,
                         son maestros de magia arcana, lo que los convierte en los personajes más poderosos en Dungeons & Dragons.
                         """);
        definiciones.add("""
                         Inicialmente, los Brujos fueron introducidos como una clase base complementaria que practicaba magia arcana. Es con
                         la evolución de Dungeons & Dragons que pasan a ser la clase principal. Los Brujos cuentan con poderes mágicos que han
                         sido otorgados por seres sobrenaturales, como los demonios.
                         
                         El rasgo definitorio de un Brujo es su capacidad de usar la magia a su voluntad y sin límites.
                         """);
        definiciones.add("""
                         Los magos no son muy relevantes en una pelea en la que las armas son la clave del éxito. Ahora, si lo que se necesita
                         son hechizos, pocos están a la altura de esta clase de personajes. A diferencia de otras clases mágicas de D&D, los magos
                         pueden lanzar hechizos basados en los conocimientos adquiridos. 
                         
                         Dicho de otra manera, ellos construyen su repertorio de hechizos a medida que el juego evoluciona. Es decir que pueden
                         empezar siendo muy débiles, pero van adquiriendo poder.
                         """);
    }
    
    public void setDefi(ArrayList listaDefi){
        this.definiciones = listaDefi;
    }
    
    public ArrayList getDefi(){
        return definiciones;
    }
}
