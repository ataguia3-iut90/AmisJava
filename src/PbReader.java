import java.io.*;
import java.util.*;

class PbReader {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH); // pour être ok avec le serveur qui juge votre solution

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = "";
            line = br.readLine(); // lire la 1ère ligne
            int nb = Integer.parseInt(line); // conversion en entier
            for(int i=0;i<nb;i++) { // lire nb lignes suivantes
                line = br.readLine();
                String[] parts = line.split(" "); // découpage grâce aux espaces
                int n1 = Integer.parseInt(parts[0]);
                int n2 = Integer.parseInt(parts[0]);
                int n3 = Integer.parseInt(parts[0]);
                // faire qqchose avec n1, n2, n3
            }
        }
        catch(IOException e) {}
    }
}