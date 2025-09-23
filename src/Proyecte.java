import java.util.Date;
import java.util.List;

public class Proyecte {
    public String nom;
    public Date dataInici;
    public List<Participacio> participan;
    public List<Tasque> tasques;

    public String getNom() {
        return nom;
    }

    public Date getDataInici() {
        return dataInici;
    }

    public List<Participacio> getParticipan() {
        return participan;
    }

    public List<Tasque> getTasques() {
        return tasques;
    }
}
