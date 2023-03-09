import java.util.*;

public class Solver {

    int nbRow;
    int nbPrenoms; // le nombre de prenoms au total
    int nbGroupes; // le nombre de groupes

    List<String> prenoms; // la liste des prenoms

    Solver(int nbRow) {
        this.nbRow = nbRow;
        this.nbPrenoms = 0;
        this.nbGroupes = 0;
        this.prenoms = new ArrayList<>();
    }

    public void readParameters(Scanner scan) {
        for(int i=0;i<nbRow;i++) {
            String p1 = scan.next();
            String p2 = scan.next();

            prenoms.add(p1);
            prenoms.add(p2);
        }
    }

    void solve() {
        // nbGroupes = cherche le nombre de groupes
//        Set<String> set = new HashSet<>(prenoms);
//        nbPrenoms = set.size();
        Map<String, Integer> count = new HashMap<>();
        for (String prenom : prenoms) {
            count.put(prenom, count.getOrDefault(prenom, 0) + 1);
        }
        int maxCount = 0;
        for (int c : count.values()) {
            maxCount = Math.max(maxCount, c);
        }
        nbGroupes = maxCount;

        // Calcule le nombre total de prénoms
        nbPrenoms = count.size();
    }

    public int getNbGroupes() {
        return nbGroupes;
    }

    public int getNbPrenoms() {
        return nbPrenoms;
    }

    public List<String> getPrenoms() {
        System.out.println("x");
    }
}