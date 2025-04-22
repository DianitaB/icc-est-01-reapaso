
import Controllers.PersonaController;
import Models.Persona;
import Views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona ("Juan",25),
            new Persona ("Maria",30),
            new Persona("Carlos",22),
            new Persona("Ana",28),
            new Persona("Luis",35),
            new Persona("Sofia",27),
            new Persona("Miguel",40),
            new Persona("Laura",32),
            new Persona("Pedro",29),
            new Persona("Elena",26),
        };
        PersonaController pC = new PersonaController();
        ViewConsole vC = new ViewConsole();

        vC.printMesagge("Personas: ");
        vC.printMesagge("------------------------------");
        vC.printPersonsArray(personas);
        vC.printMesagge("------------------------------");
        vC.printMesagge("Personas Ordenadas por edad: ");
        vC.printMesagge("------------------------------");
        pC.ordenarPorEdad(personas);
        vC.printPersonsArray(personas);
        vC.printMesagge("------------------------------");
        vC.printMesagge("Buscar persona con edad 40: ");
        vC.printMesagge("------------------------------");
        Persona pB = pC.buscarPorEdad(personas, 40);
        if (pB == null){
            vC.printMesagge("------------------------------");
            vC.printMesagge("No hay persona con esa edad.");
           
        } else { 
            
            vC.printMesagge("La persona con edad 40 es " + pB);
            vC.printMesagge("------------------------------");
           
        
        }
        
        vC.printMesagge("Buscar persona con edad 90: ");
        
        Persona pF = pC.buscarPorEdad(personas, 90);
        if (pF == null){
            vC.printMesagge("------------------------------");
            vC.printMesagge("No hay persona con esa edad.");
            vC.printMesagge("------------------------------");
        } else { 
            vC.printMesagge("------------------------------");
            vC.printMesagge("La persona con edad 40 es " + pF);
            vC.printMesagge("------------------------------");
        
        }


    }
}
