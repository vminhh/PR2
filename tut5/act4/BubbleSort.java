package tut5.act4;

public class BubbleSort extends IntSortingAlgorithm {
    public BubbleSort(int[] array) {
        super("Bubble Sort ", array);
    }

    @Override
    public void sort() {
        int n = array.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    swapped = true;
                }
            }
            n--;
        } while (swapped);

        sortedArray = array.clone();
    }

    private void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
