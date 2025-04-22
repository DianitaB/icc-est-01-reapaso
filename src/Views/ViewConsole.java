package Views;
import Models.Persona;

public class ViewConsole {
    public void printPersonsArray(Persona[] personas){
        for (Persona persona : personas){
            System.out.println(persona);
        }
    }
    public void printMesagge(String mesagge){
        System.out.println(mesagge);

    }
}
