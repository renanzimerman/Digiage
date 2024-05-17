import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * Write a list and add an aleatory number of Strings. In the end, print out how
 * many distinct itens exists on the list.
 *
 */

public class TASK3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        Random random = new Random();

        int numeroPalavra = random.nextInt(10) + 1;

        System.out.println("Digite alguns objetos: ");

        for (int i = 0; i < numeroPalavra; i++) {
            String objeto = input.nextLine();
            list.add(objeto);
        }

        Set<String> itensDistintos = new HashSet<>(list);

        System.out.println("Número de itens distintos na lista: " + itensDistintos.size());
    }
}
