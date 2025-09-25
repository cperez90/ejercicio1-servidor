import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Desenvolupador desenvolupador1 = new Desenvolupador();
        desenvolupador1.nom = "Alexandra";
        Desenvolupador desenvolupador2 = new Desenvolupador();
        desenvolupador2.nom = "Rosa";
        Desenvolupador desenvolupador3 = new Desenvolupador();
        desenvolupador3.nom = "Sergio";

        Tasque tasque1 = new Tasque();
        tasque1.nom = "manager IT";
        tasque1.horesEstimades = 20;

        Tasque tasque2 = new Tasque();
        tasque2.nom = "disseny IT";
        tasque2.horesEstimades = 25;
        tasque2.addDependencies(tasque1);

        Tasque tasque3 = new Tasque();
        tasque3.nom = "programador";
        tasque3.horesEstimades = 28;
        tasque3.addDependencies(tasque1);

        Tasque tasque4 = new Tasque();
        tasque4.nom = "desseny";
        tasque4.horesEstimades = 36;
        tasque4.addDependencies(tasque1);
        tasque4.addDependencies(tasque2);

        Participacio participacio1 = new Participacio();
        participacio1.desenvolupador = desenvolupador1;
        participacio1.rol = Rol.FRONTEND;
        participacio1.horesFetes = 30;

        Participacio participacio2 = new Participacio();
        participacio2.desenvolupador = desenvolupador2;
        participacio2.rol = Rol.FULLSTACK;
        participacio2.horesFetes = 30;

        Participacio participacio3 = new Participacio();
        participacio3.desenvolupador = desenvolupador3;
        participacio3.rol = Rol.BACKEND;
        participacio3.horesFetes = 30;

        Proyecte proyecte = new Proyecte();
        proyecte.nom = "proyecto 1";
        proyecte.dataInici = LocalDate.now();
        proyecte.addTasques(tasque1);
        proyecte.addTasques(tasque2);
        proyecte.addTasques(tasque3);
        proyecte.addTasques(tasque4);
        proyecte.addParticipan(participacio1);
        proyecte.addParticipan(participacio2);

        //System.out.println("Hores Totals "+ proyecte.horesDedicadesTotal(proyecte.tasques));
        //proyecte.tasquesOrdenades();

        proyecte.infoProyecte(proyecte);

    }
}