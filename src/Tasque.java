import java.util.ArrayList;
import java.util.List;

public class Tasque {
    public String nom;
    public int horesEstimades;
    public List<Tasque> dependencies = new ArrayList<Tasque>();

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
