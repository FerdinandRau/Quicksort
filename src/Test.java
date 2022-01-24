import java.util.Arrays;

public class Test {

        public static void main(String[] args) {

                // Array
                int[] arr = { 7, 3, 6, 9, 2, 1, 7, 9, 4, 7, 4, 3, 1, 9, 1 };

                // Objekt
                Quicksort q = new Quicksort();

                // Ausgabe
                System.out.println("unsortiert: " + Arrays.toString(arr));

                // sortieren
                arr = q.sortieren(arr);

                // Ausgabe
                System.out.println("sortiert:   " + Arrays.toString(arr));
        }
}
