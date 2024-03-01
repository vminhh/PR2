package tut5.act4;

public class MergeSort extends IntSortingAlgorithm {
    public MergeSort(int[] array) {
        super("Merge Sort ", array);
    }

    @Override
    public void sort() {
        mergeSort(array, 0, array.length - 1);
        sortedArray = array.clone();
    }

    private void mergeSort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, l);
            merge(a, l, m, r);
        }
    }

    private void merge(int[] a, int l, int m, int r) {
        int x = m - l + 1;
        int y = r - m;
        int[] a_left = new int[x];
        int[] a_right = new int[y];

        for (int i = 0; i < x; i++) {
            a_left[i] = a[l + i];
        }
        for (int i = 0; i < y; i++) {
            a_right[i] = a[m + i + 1];
        }

        int i = 0, j = 0, k = l;
        while (i < x && j < y) {
            if (a_left[i] <= a_right[j]) {
                a[k] = a_left[i];
                ++i;
            } else {
                a[k] = a_right[j];
                ++j;
            }
            ++k;
        }

        while (i < x) {
            a[k] = a_left[i];
            ++i;
            ++k;
        }
        while (j < y) {
            a[k] = a_right[j];
            ++j;
            ++k;
        }

    }
}
