import java.util.List;

public class Tasque {
    public String nom;
    public int horesEstimades;
    public List<Tasque> dependencies;

    public String getNom() {
        return nom;
    }

    public int getHoresEstimades() {
        return horesEstimades;
    }

    public List<Tasque> getDependencies() {
        return dependencies;
    }
}
