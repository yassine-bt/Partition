
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String... args) throws Exception {
        List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println("Main list = " + liste);
        List<List<Integer>> res = new Tools().partition(liste, 1);
        res.forEach(element -> System.out.println("Current sublist = " + element));
    }
}
