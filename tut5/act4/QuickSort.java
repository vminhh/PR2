package tut5.act4;

public class QuickSort extends IntSortingAlgorithm {
    public QuickSort(int[] array) {
        super("Quick Sort ", array);
    }

    @Override
    public void sort() {
        quickSort(array, 0, array.length - 1);
        sortedArray = array.clone();
    }

    private void quickSort(int[] a, int l, int r) {
        if (l < r) {
            int p = partition(a, l, r);
            quickSort(a, l, p);
            quickSort(a, p + 1, r);
        }
    }

    private int partition(int[] a, int l, int r) {
        int pivot = a[l];
        int i = l - 1;
        int j = r + 1;

        do {
            ++i;
        } while (a[i] < pivot);
        do {
            --j;
        } while (a[j] > pivot);

        if (i < j) {
            swap(a, i, j);
        }
        return j;
    }

    private void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
