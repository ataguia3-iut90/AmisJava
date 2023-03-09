import java.sql.SQLOutput;
import java.util.*;

public class Amis {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        System.out.println("test");
        System.out.println(args);

        Scanner scan = new Scanner(System.in);

        int nbRow = scan.nextInt();
        System.out.println(nbRow);

//        scan.nextLine();

        Solver s = new Solver(nbRow);
        s.readParameters(scan);
//        s.solve();

        System.out.println("Nombre de groupes : " + s.getNbGroupes());
        System.out.println("Nombre de prénoms : " + s.getNbPrenoms());

    }
}
