import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Proyecte {
    public String nom;
    public LocalDate dataInici;
    public List<Participacio> participan = new ArrayList<Participacio>();
    public List<Tasque> tasques = new ArrayList<Tasque>();

    public String getNom() {
        return nom;
    }

    public LocalDate getDataInici() { return dataInici; }

    public List<Participacio> getParticipan() {
        return participan;
    }

    public List<Tasque> getTasques() {
        return tasques;
    }

    public void addParticipan(Participacio participacio) {
        participan.add(participacio);
    }

    public void addTasques(Tasque tasque) {
        tasques.add(tasque);
    }

    public int horesDedicadesTotal(List<Tasque> tasques) {
        int total = 0;
        for (Tasque tasque : tasques) {
            total += tasque.getHoresEstimades();
        }
        return total;
    }

    public List<Tasque> ordenaTasques(List<Tasque> tasques) {

        return tasques;
    }
}
