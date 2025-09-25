import java.util.ArrayList;
import java.util.List;

public class Tasque {
    private String nom;
    private int horesEstimades;
    private List<Tasque> dependencies = new ArrayList<Tasque>();

    public Tasque(String nom, int horesEstimades) {
        this.nom = nom;
        this.horesEstimades = horesEstimades;
        this.dependencies = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public int getHoresEstimades() {
        return horesEstimades;
    }

    public List<Tasque> getDependencies() {
        return dependencies;
    }

    public void addDependencies(Tasque tasque){
        dependencies.add(tasque);
    }
}
