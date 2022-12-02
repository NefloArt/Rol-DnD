package personaje.ficha;

import java.util.*;
import java.io.*;
import personaje.razas.Razas;
import personaje.clases.Clases;

public class FichaPersonaje {
    private static boolean terminar=false;
    
    public static void Ficha(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("""
                           Instrucciones de creación de personaje:
                           
                           -Elegir una raza
                           -Elegir una clase
                           -Tirada de dados para característcias de personaje
                           
                           (Presiona Intro para comenzar)
                           """);
        leer.nextLine();
    }
    
    public static void Check(){
        Scanner leer = new Scanner(System.in);
        String respuesta="";
        
        try{
            Scanner lecStats = new Scanner(new FileReader("stats.txt"));
            Scanner lecRaza = new Scanner(new FileReader("Raza.txt"));
            Scanner lecClase = new Scanner(new FileReader("Clase.txt"));
            
            if (!(lecStats.equals("")||lecRaza.equals("")||lecClase.equals(""))) {
                do {
                    System.out.println("Ya existe una ficha de personaje creada, desea eliminarla?");
                    respuesta = leer.nextLine();
                    if (!(respuesta.equalsIgnoreCase("si")||respuesta.equalsIgnoreCase("no"))) {
                        System.out.println("Respuesta errónea, escribe si o no.");
                    }
                } while (!(respuesta.equalsIgnoreCase("si")||respuesta.equalsIgnoreCase("no")));
                if (respuesta.equalsIgnoreCase("si")) {
                    try (FileWriter esc = new FileWriter("stats.txt")) {
                        esc.write("");
                        esc.close();
                    }
                    try (FileWriter esc = new FileWriter("Raza.txt")) {
                        esc.write("");
                        esc.close();
                    }
                    try (FileWriter esc = new FileWriter("Clase.txt")) {
                        esc.write("");
                        esc.close();
                    }
                    terminar=false;
                }
                else{
                    terminar=true;
                }
            }
            
        }catch(IOException e){
            
        }
    }
    
    public static boolean Terminar(){
        return terminar;
    }
    
    public static void Raza(){
        Scanner leer = new Scanner(System.in);
        
        File archivo = new File("Raza.txt");
        
        String respuesta,respuestaDef;
        boolean subraza;
        
        Razas razas = new Razas();
        Razas subRazas = new Razas();
        Razas defi = new Razas();
        
        defi.addDefi();
        
        razas.addRazas();
        ArrayList<String> listaRaza = razas.getRazas();
        String razasArray[] = new String[listaRaza.size()];
        razasArray = listaRaza.toArray(razasArray);
        
        try(FileWriter esc = new FileWriter("Raza.txt")){
                System.out.println("Que raza quieres elegir?\n");
                for (int i = 0; i < razasArray.length; i++) {
                    System.out.print(razasArray[i] + "   ");
                    if ((i+1)%5==0) {
                        System.out.println("");
                    }
                }

                System.out.print("\n");
                respuesta = leer.nextLine().toLowerCase().replaceAll(" ", "");
                int indice = (razasArray.length-1);
                int indiceSub;
                int indiceDefSub;

                for (int i = 0; i < razasArray.length; i++) {
                    if (razasArray[i].toLowerCase().replaceAll(" ", "").contains(respuesta)) {
                        if (indice>i) {
                            indice=i;
                        }
                    }
                }

                int indiceDef = indice;

                switch (indice) {
                    case 2 -> {
                        subRazas.addEnano();
                        defi.addDefiEnano();
                        subraza = true;
                    }
                    case 3 -> {
                        subRazas.addElfo();
                        defi.addDefiElfo();
                        subraza = true;
                    }
                    case 4 -> {
                        subRazas.addGenasi();
                        defi.addDefiGenasi();
                        subraza = true;
                    }
                    case 5 -> {
                        subRazas.addGnomo();
                        defi.addDefiGnomo();
                        subraza = true;
                    }
                    case 9 -> {
                        subRazas.addMediano();
                        defi.addMediano();
                        subraza = true;
                    }
                    default -> subraza = false;
                }

                ArrayList<String> listaDefi = defi.getDefi();
                String defiArray[] = new String[listaDefi.size()];
                defiArray = listaDefi.toArray(defiArray);

                ArrayList<String> listaSubRaza = subRazas.getSubRazas();
                String subRazasArray[] = new String[listaSubRaza.size()];
                subRazasArray = listaSubRaza.toArray(subRazasArray);

                indiceSub = (subRazasArray.length-1);
                indiceDefSub = (defiArray.length-1);

                if (subraza) {
                    System.out.println("Que subraza quieres elegir?\n");
                    for (String i : subRazasArray) {
                        System.out.print(i + "    ");
                    }
                    System.out.print("\n");
                    respuestaDef = leer.nextLine().toLowerCase().replaceAll(" ", "");
                    for (int i = 0; i < subRazasArray.length; i++) {
                        if (subRazasArray[i].toLowerCase().replaceAll(" ", "").contains(respuestaDef)) {
                            if (indiceSub>i) {
                                indiceDefSub = i+13;
                                indiceSub = i;
                            }
                        }
                    }
                    System.out.println("\n" + subRazasArray[indiceSub] + "\n\n" + defiArray[indiceDef] + "\n" + defiArray[indiceDefSub]);
                    esc.write(subRazasArray[indiceSub]);
                    esc.close();
                }else{
                    System.out.println("\n" + razasArray[indice] + "\n\n" + defiArray[indiceDef]);
                    esc.write(razasArray[indice]);
                    esc.close();
                }
        }catch(IOException e){
        }
    }
    
    public static void Clase(){
        Scanner leer = new Scanner(System.in);
        
        File archivo = new File("Clase.txt");
        
        String respuesta,respuestaDef;
        
        Clases clases = new Clases();
        Clases defi = new Clases();
        
        defi.addDefi();
        
        clases.addRazas();
        ArrayList<String> listaClase = clases.getClases();
        String clasesArray[] = new String[listaClase.size()];
        clasesArray = listaClase.toArray(clasesArray);
        
        try(FileWriter esc = new FileWriter("Clase.txt")){
                System.out.println("Que clase quieres elegir?\n");
                for (int i = 0; i < clasesArray.length; i++) {
                    System.out.print(clasesArray[i] + "   ");
                    if ((i+1)%5==0) {
                        System.out.println("");
                    }
                }

                System.out.print("\n");
                respuesta = leer.nextLine().toLowerCase().replaceAll(" ", "");
                int indice = (clasesArray.length-1);

                for (int i = 0; i < clasesArray.length; i++) {
                    if (clasesArray[i].toLowerCase().replaceAll(" ", "").contains(respuesta)) {
                        if (indice>i) {
                            indice=i;
                        }
                    }
                }

                int indiceDef = indice;

                ArrayList<String> listaDefi = defi.getDefi();
                String defiArray[] = new String[listaDefi.size()];
                defiArray = listaDefi.toArray(defiArray);

                System.out.println("\n" + clasesArray[indice] + "\n\n" + defiArray[indiceDef]);
                esc.write(clasesArray[indice]);
                esc.close();
        }catch(IOException e){
        }
    }
    
    public static void Stats(){
        Scanner leer = new Scanner(System.in);
        
        File fichafile = new File("stats.txt");
        
        String repetir,respuesta;
        String stats[] = {"Fuerza","Destreza","Constitucion","Inteligencia","Sabiduria","Carisma"};
        
        int dados[] = new int[4];
        int ficha[][] = new int[6][2];
        
        int cont=2;
        
        
        try
            {if(!fichafile.exists()){
                fichafile.createNewFile();
            }
                try{
                    try (FileWriter esc = new FileWriter("stats.txt")) {
                        for (int i = 0; i < ficha.length; i++) {
                            while (cont>0){
                                System.out.println("Dados de " + stats[i]);
                                for (int j = 0; j < dados.length; j++) {
                                    dados[j] = (int)(1+Math.random()*6);
                                    System.out.print(dados[j] + " ");
                                }
                                if (cont>1) {
                                    do {
                                        System.out.println("Quieres hacer otra tirada?");
                                        repetir = leer.nextLine();
                                        if (repetir.equalsIgnoreCase("si")) {
                                            cont--;
                                        }else if (repetir.equalsIgnoreCase("no")) {
                                            cont=0;
                                        }else{
                                            System.out.println("Error, introduce si o no.");
                                        }
                                    } while (!(repetir.equalsIgnoreCase("si")||repetir.equalsIgnoreCase("no")));
                                }else if(cont==1){
                                    cont=0;
                                }
                            }
                            cont=2;
                            
                            Arrays.sort(dados, 0, dados.length);
                            
                            for (int j = (dados.length-1); j > 0; j--) {
                                ficha[i][0] += dados[j];
                            }
                            System.out.println(stats[i] + ": " + ficha[i][0]);
                            System.out.println("");
                            
                            for (int j = 0; j < ficha.length; j++) {
                                if (ficha[i][0]==18) {
                                    ficha[i][1]=+4;
                                }else if(ficha[i][0]>=16){
                                    ficha[i][1]=+3;
                                }else if(ficha[i][0]>=14){
                                    ficha[i][1]=+2;
                                }else if(ficha[i][0]>=12){
                                    ficha[i][1]=+1;
                                }else if(ficha[i][0]>=10){
                                    ficha[i][1]=0;
                                }else if(ficha[i][0]>=8){
                                    ficha[i][1]=-1;
                                }else if(ficha[i][0]>=6){
                                    ficha[i][1]=-2;
                                }else if(ficha[i][0]>=4){
                                    ficha[i][1]=-3;
                                }else if(ficha[i][0]>=2){
                                    ficha[i][1]=-4;
                                }else{
                                    ficha[i][1]=-5;
                                }
                            }  
                        }
                        
                        for (int i = 0; i < stats.length; i++) {
                            esc.write(stats[i] + ": " + ficha[i][0] + " (");
                            if (ficha[i][1]>=0) { 
                                esc.write("+" + ficha[i][1] + ")\n");
                            }else{
                                esc.write(ficha[i][1] + ")\n");
                            }
                        }
                    }
                }catch(IOException e){
                }
        }catch(IOException e){
        }
    }
    
    public static void LeerFicha(){
        
        try{
            Scanner lecStats = new Scanner(new FileReader("stats.txt"));
            Scanner lecRaza = new Scanner(new FileReader("Raza.txt"));
            Scanner lecClase = new Scanner(new FileReader("Clase.txt"));
            
            System.out.println("Tu personaje es un " + lecRaza.nextLine() + ", " + lecClase.nextLine() + " con las siguientes características");
        
            while (lecStats.hasNextLine()) {
                System.out.println(lecStats.nextLine() + " ");
            }
            
        }catch(IOException e){
            
        }
    }
    
}
