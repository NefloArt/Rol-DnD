package personaje.razas;

import java.util.ArrayList;

public class Razas {
    ArrayList<String> razas = new ArrayList<>();
    ArrayList<String> subrazas = new ArrayList<>();
    ArrayList<String> definiciones = new ArrayList<>();
    
    public void addRazas(){
        
        razas.add("Hombre Pajaro");
        razas.add("Draconido");
        razas.add("Enano");
        razas.add("Elfo");
        razas.add("Genasi");
        razas.add("Gnomo");
        razas.add("Goliath");
        razas.add("Semielfo");
        razas.add("Semiorco");
        razas.add("Mediano");
        razas.add("Humano");
        razas.add("Tiflin");
        razas.add("Aasimar");
    }
    
    public void setRazas(ArrayList listaRazas){
        this.razas = listaRazas;
    }
    
    public ArrayList getRazas(){
        return razas;
    }
    
    public void addEnano(){
        subrazas.add("Enano de las Montañas");
        subrazas.add("Enano de las Colinas");
    }
    
    public void addElfo(){
        subrazas.add("Alto Elfo");
        subrazas.add("Elfo de los Bosques");
        subrazas.add("Elfo Eladrin");
    }
    
    public void addGenasi(){
        subrazas.add("Genasi de Aire");
        subrazas.add("Genasi de Tierra");
        subrazas.add("Genasi de Fuego");
        subrazas.add("Genasi de Agua");
    }
    
    public void addGnomo(){
        subrazas.add("Gnomo de Roca");
        subrazas.add("Gnomo de las profundidades");
    }
    
    public void addMediano(){
        subrazas.add("Mediano piesligeros");
        subrazas.add("Mediano robusto");
    }
    
    public void setSubRazas(ArrayList listaSubRazas){
        this.subrazas = listaSubRazas;
    }
    
    public ArrayList getSubRazas(){
        return subrazas;
    }
    
    public void addDefi(){
        definiciones.add("""
                         Recluidos en altas montañas, subidos encima de grandes árboles, los aarakocras, a veces llamados hombres pájaro,
                         evocan miedo y admiración. Muchos aarakocra no son nativos del Plano Material. Proceden de un mundo más allá
                         de las infinitas vistas del Plano Elemental del Aire. Son inmigrantes, refugiados, exploradores y rastreadores,
                         sus puestos de vigilancia funcionando como sus apoyos en un mundo extraño y ajeno.
                         """);
        definiciones.add("""
                         Nacidos de dragones, tal como su nombre proclama, los dracónidos caminan orgullosos por un mundo que los recibe
                         con incomprensión temerosa. Creados por los dioses dracónidos o por los dragones mismos, los dracónidos nacían
                         originalmente de huevos de dragón como una única raza, combinando los mejores atributos de dragones y humanoides.
                         Algunos dracónidos son fieles servidores de verdaderos dragones, otros son soldados que luchan en grandes guerras,
                         y otros se encuentran a la deriva, sin una vocación clara en la vida.
                         """);
        definiciones.add("""
                         Ricos reinos de antiguas grandezas, salones tallados en las entrañas de las montañas, el eco de picos y martillos
                         en profundas minas y ardientes forjas, la entrega total al clan y la tradición, y un odio visceral hacia los goblins
                         y los orcos. Estos principios comunes unen a todos los enanos.
                         """);
        definiciones.add("""
                         Los elfos son un pueblo mágico de gracilidad sobrenatural, que viven en lugares de etérea belleza, morando en el interior
                         de antiguos bosques o en espiras plateadas que brillan con luz feérica, donde una suave música surca el aire y dulces
                         fragancias flotan en el viento. Los elfos aman la naturaleza y la magia, el arte, la música y la poesía.
                         """);
        definiciones.add("""
                         Aquellos que piensan alguna vez en los otros planos los consideran reinos remotos y distantes, pero la influencia planar
                         puede notarse por todo el mundo. A veces se manifiestan en seres que, debido a un accidente al nacer, albergan el poder
                         de los planos en su sangre. Los genasi son una de estas gentes, la descendencia entre genios y mortales.
                         """);
        definiciones.add("""
                         Un murmullo constante de bullicio impregna las madrigueras y vecindarios donde los gnomos forman sus muy unidas comunidades.
                         El murmullo está puntualizado por otros ruidos: un entrechocar de engranajes por allí, una pequeña explosión por allá, un
                         chillido de sorpresa y triunfo, y especialmente estallidos de carcajadas. Los gnomos disfrutan de la vida, recreándose en cada
                         momento de invención, exploración, investigación, creación y diversión.
                         """);
        definiciones.add("""
                         En las cimas de las montañas más altas, donde los árboles no crecen y soplan gélidos vientos, moran los aislados goliats.
                         Pocos pueden decir que han visto un goliat con sus propios ojos, y aún menos pueden decir que son amigos de uno. Los goliats
                         vagan por un reino desolado de piedra, viento y frío. Sus cuerpos parecen haber sido esculpidos de las rocas de las montañas,
                         y les otorgan grandes capacidades físicas. Sus espíritus se parecen al viento, convirtiéndolos en nómadas que vagan de cumbre
                         a cumbre. Sus corazones están imbuidos con el frío procedente de sus tierras, dejando a cada goliat con la responsabilidad de
                         ganarse un lugar en la tribu o morir intentándolo.
                         """);
        definiciones.add("""
                         Caminando entre dos mundos pero sin pertenecer a ninguno, los semielfos poseen lo que algunos creen que son las mejores cualidades
                         de sus padres elfos y humanos: la curiosidad, creatividad y ambición de los últimos, templada por los agudos sentidos, amor por la
                         naturaleza y gustos artísticos de los primeros. Algunos semielfos viven entre humanos, apartados por sus diferencias físicas y emocionales,
                         velando por sus amigos y seres queridos mientras el tiempo apenas deja mella en ellos. Otros viven con los elfos, llegando a la madurez
                         mientras sus pares continúan siendo niños, creciendo sin descanso en los eternos reinos élficos. Muchos semielfos, incapaces de encajar
                         en ninguna de estas sociedades, escogen una vida de vagabundeo solitario, o se unen a otros parias e inadaptados en una vida de aventureros.
                         """);
        definiciones.add("""
                         Ya sea unidos bajo el liderazgo de un poderoso brujo o habiendo luchado hasta el hartazgo después de años de conflicto, las tribus orcas
                         y los humanos a veces forman alianzas, uniendo fuerzas en una enorme horda para el terror de las tierras civilizadas de los alrededores.
                         Cuando estas aliazas son selladas mediante matrimonios, nacen los semiorcos. Algunos se alzan para convertirse en orgullosos líderes de
                         sus tribus, aventajándose de su sangre humana frente a sus compañeros de sangre pura. Otros se aventuran al mundo exterior para probarse
                         a sí mismos frente a los humanos y las otras razas civilizadas. Muchos de ellos se convierten en aventureros, cubriéndose de gloria gracias
                         a su fuerza, y de notoriedad por sus costumbres barbáricas y furia salvaje.
                         """);
        definiciones.add("""
                         Las comodidades del hogar son la meta en la vida de la mayoría de los medianos: un lugar donde asentarse en paz y tranquilidad, lejos de
                         monstruos acechantes y el choque de ejércitos. Otros forman bandas nómadas que viajan constantemente, atraídos por el camino y el horizonte
                         para descubrir las maravillas de nuevas tierras y sus gentes. Los medianos trabajan de buena gana con otros, y son leales a sus amigos, ya
                         sean medianos o no. Pueden demostrar una ferocidad notable cuando sus amigos, familias o comunidades son amenazadas.
                         """);
        definiciones.add("""
                         En las crónicas de la mayoría de los mundos, los humanos son la más joven de las razas, tardíos en su llegada a la escena mundial y efímeros
                         en comparación con enanos, elfos y dragones. Quizás es por sus cortas vidas que luchan por lograr tanto como puedan en los años que le son dados;
                         o quizás sienten que tienen algo que probar a las razas mayores, y es ese el por qué de las fundaciones de sus imperios basados en la conquista y
                         el comercio. Cualquiera que sea su motivación, los humanos son los innovadores, los triunfadores y los pioneros de los mundos.
                         """);
        definiciones.add("""
                         Ser recibidos con miradas furtivas y susurros, sufrir violencia e insultos en la calle, ver desconfianza y miedo en cada mirada: ésta es la carga
                         de los tiflin. Además, para empeorar las cosas, los tiflin saben que esto es debido a un pacto realizado hace generaciones que introdujo en sus venas
                         la esencia de Asmodeo, el señor de los Nueve Infiernos. Su apariencia y naturaleza no son culpa suya, sino de un antiguo pecado, por el cual ellos,
                         sus hijos y los hijos de sus hijos siempre deberán pagar el precio.
                         """);
        definiciones.add("""
                         Los aasimar portan la luz de los cielos en sus almas. Descienden de humanos tocados por el poder del Monte Celestia, el plano divino de muchas deidades
                         legales buenas. Los aasimar nacieron para ser los campeones de los dioses, sus nacimientos son aclamados como bendiciones. Son gentes de rostros
                         sobrenaturales, con rasgos luminosos que revelan su herencia celestial.
                         """);
    }
    
    public void addDefiEnano(){
        definiciones.add("""
                         Como enano de la montaña, eres fuerte y corpulento, acostumbrado a una vida dura en terrenos rocosos. Probablemente seas un poco más alto
                         (para ser un enano), y tengas una coloración más clara. Los enanos escudados del norte de Faerûn, junto con el clan gobernante de Hylar y el
                         clan noble de Daewar de Dragonlance son enanos de la montaña.
                         """);
        definiciones.add("""
                         Como enano de las colinas, posees sentidos agudos, una buena intuición y gran resistencia. Los enanos dorados de Faerûn en su poderoso reino del
                         sur son enanos de las colinas, así como los exiliados Neidar y el degradado Klar de Kynn en Dragonlance.
                         """);
    }
    
    public void addDefiElfo(){
        definiciones.add("""
                         Como un alto elfo, tienes una mente aguda y dominas al menos las bases de la magia. En muchos mundos de D&D, hay dos tipos de altos elfos. Los del
                         primer tipo, que incluye los elfos grises y del valle de Greyhawk, los Silvanesti de Dragonlance y los elfos del sol de los Reinos Olvidados, son
                         arrogantes y solitarios, creyéndose superiores a las demás razas e incluso a los demás elfos. El segundo tipo, que incluye a los altos elfos de Greyhawk,
                         los Qualinesti de Dragonlance y los elfos de la luna de los Reinos Olvidados, son más comunes y amistosos, y pueden ser encontrados en compañía de humanos y otras razas.
                         """);
        definiciones.add("""
                         Como elfo de los bosques, tienes unos sentidos e intuición afilados, y tus pies te llevan rápida y sigilosamente a través de tus bosques nativos.
                         Esta categoría incluye los elfos salvajes (grugach) de Greyhawk y los Kagonesti de Dragonlance, así como las razas de elfos de los bosques de Greyhawk
                         y los Reinos Olvidados. En Faerûn, los elfos de los bosques (también llamados elfos salvajes, elfos verdes o elfos forestales) son solitarios y desconfían
                         de los no elfos.
                         """);
        definiciones.add("""
                         Los eladrin son los elfos nativos de la Tierra de las Hadas, un reino de belleza, emociones impredecibles y magia sin límites. Un eladrin está asociado
                         con una de las cuatro estaciones y tiene una coloración reminiscente de esa estación, que también puede afectar al humor del eladrin:
                         
                         -El otoño es la estación de la paz y la buena voluntad, cuando la cosecha del verano es compartida por y con todos.
                         -El invierno es la estación de la observación y el duelo, cuando la vibrante energía del mundo se adormece.
                         -La primavera es la estación del jolgorio y la celebración, marcada por la alegría tras el paso de la pena del invierno.
                         -El verano es la estación de la valentía y la agresión, un tiempo de energía sin restricciones.
                         
                         Algunos eladrin permanecen asociados con una estación particular durante toda su vida, mientras otros se transforman, adoptando las características de
                         una estación nueva. Al finalizar un descanso largo, cualquier eladrin puede cambiar su estación, eligiendo la presente en el mundo o la que mejor
                         represente su estado anímico actual. Por ejemplo, un eladrin puede cambiar a otoño si se siente contento, a invierno si le azota la pena, a primavera
                         si se siente explotar de felicidad, o a verano si se enfurece.
                         """);
    }
    
    public void addDefiGenasi(){
        definiciones.add("""
                         Genasis elementales del Aire.
                         """);
        definiciones.add("""
                         Genasis elementales de la Tierra.
                         """);
        definiciones.add("""
                         Genasis elementales del Fuego.
                         """);
        definiciones.add("""
                         Genasis elementales del Agua.
                         """);
    }
    
    public void addDefiGnomo(){
        definiciones.add("""
                         Como gnomo de la roca, posees un ingenio y resistencia natural que va más allá de la de los demás gnomos. La mayoría de los gnomos de los mundos de
                         D&D son gnomos de la roca, incluidos los gnomos hojalateros de Dragonlance.
                         """);
        definiciones.add("""
                         Una tercera subraza de gnomos, los gnomos de la profundidad (o svirfneblin) viven en pequeñas comunidades dispersas por la Infraoscuridad. A diferencia
                         de los drow y los duergar, los svirfneblin son tan bienintencionados y compasivos como sus primos de la superficie. Sin embargo, son precavidos, astutos,
                         taciturnos y sospechan de los forasteros, y su humor y entusiasmo son ensombrecidos por el opresivo ambiente en el que viven. Su maestría inventiva está
                         dirigida en su mayoría hacia la piedra.
                         """);
    }
    
    public void addDefiMediano(){
        definiciones.add("""
                         Como mediano piesligeros, puedes evadir fácilmente el ser detectado, incluso usando a otras personas como cobertura. Tiendes a ser afable y llevarte bien
                         con los demás. En los Reinos Olvidados, los medianos piesligeros son los que más lejos se han expandido, y por ello, son la variedad más común.
                         
                         Los piesligeros son los más dados a amar los viajes de todos los medianos, y suelen habitar junto a otras razas o llevar una vida nómada. En el mundo de
                         Greyhawk, estos medianos son llamados pelopies o tiosaltos.
                         """);
        definiciones.add("""
                         Como mediano fornido, eres más duro de lo normal y tienes cierta resistencia al veneno. Algunos dicen que los fornidos tienen sangre enana. En los
                         Reinos Olvidados, estos medianos son llamados fortecores, y son los más comunes en el sur.
                         """);
    }
    
    public void setDefi(ArrayList listaDefi){
        this.definiciones = listaDefi;
    }
    
    public ArrayList getDefi(){
        return definiciones;
    }
}
