public class Quicksort {

        private int[] array;

        public int[] sortieren(int[] array) {
                this.array = array;
                quicksort(0, array.length - 1);
                return this.array;
        }

        public void quicksort(int anfang, int ende) {

                // Prüfung
                if (anfang >= ende) {
                        return;
                }

                // Pivot
                int pivot = array[ende];

                // Pointer
                int pointerLinks = anfang;
                int pointerRechts = ende;

                // Partitionierung
                while (pointerLinks < pointerRechts) {
                        while (array[pointerLinks] <= pivot && pointerLinks < pointerRechts) {
                                pointerLinks++;
                        }
                        while (array[pointerRechts] >= pivot && pointerLinks < pointerRechts) {
                                pointerRechts--;
                        }
                        // Tauschen
                        int temp = array[pointerLinks];
                        array[pointerLinks] = array[pointerRechts];
                        array[pointerRechts] = temp;
                }

                // Pivot einsetzen
                int temp = array[pointerLinks];
                array[pointerLinks] = pivot;
                array[ende] = temp;

                // Rekursion
                quicksort(anfang, pointerLinks - 1);
                quicksort(pointerLinks + 1, ende);
        }
}
