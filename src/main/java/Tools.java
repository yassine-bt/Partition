import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tools {


    /**
     * Cette fonction prend un paramètre « liste » et un paramètre « taille » et retourne
     * une liste de sous liste, où chaque sous liste a au maximum « taille » éléments.
     * <p>
     * NB : cette fonction utilise une boucle for sur l'iterator de la liste passée et une variable compteur
     *
     * @param liste  List<Integer>
     * @param taille Integer
     * @return List<List < Integer>>
     * @throws Exception
     */
    public static List<List<Integer>> partitionManuelle(List<Integer> liste, Integer taille) throws Exception {

        if (liste == null || liste.isEmpty()) {
            throw new Exception("La Liste est null ou vide");
        }

        if (taille == null || taille <= 0) {
            throw new Exception("La taille des sousliste est null ou <= 0");
        }

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> subList = new ArrayList<>(taille);
        int compteur = 0;

        for (Iterator<Integer> iterator = liste.iterator(); iterator.hasNext(); ) {
            Integer element = iterator.next();
            subList.add(element);
            compteur++;
            if (compteur == taille || !iterator.hasNext()) {
                result.add(subList);
                // reinitialisation des variables
                compteur = 0;
                subList = new ArrayList<>(taille);
            }
        }
        return result;
    }

    /**
     * Cette fonction prend un paramètre « liste » et un paramètre « taille » et retourne
     * une liste de sous liste, où chaque sous liste a au maximum « taille » éléments.
     * <p>
     * NB : cette méthode utilise la fonction prédéfinie subListe de l'interface List
     *
     * @param liste  List<Integer>
     * @param taille Integer
     * @return List<List < Integer>>
     * @throws Exception
     */
    public static List<List<Integer>> partition(List<Integer> liste, Integer taille) throws Exception {

        if (liste == null || liste.isEmpty()) {
            throw new Exception("La Liste est null ou vide");
        }

        if (taille == null || taille <= 0) {
            throw new Exception("La taille des sousliste est null ou <= 0");
        }

        List<List<Integer>> result = new ArrayList<>();
        int index = 0;

        while (true) {
            if (index >= liste.size()) {
                result.add(liste.subList((index - taille), liste.size()));
                return result;
            } else if ((index + taille) >= liste.size()) {
                result.add(liste.subList(index, liste.size()));
                return result;
            }

            result.add(liste.subList(index, (index + taille)));
            index += taille;

        }
    }

}
