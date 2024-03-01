package tut5.act4;

public class Main {
    public static void main(String[] args) {
        int[] test = { 8, 7, -2, 0, -3, 6, 4 };

        IntSortingAlgorithm origin = new IntSortingAlgorithm("Original: ", test);
        System.out.println(origin);
        System.out.println("Array sorted: " + origin.isSorted());

        BubbleSort bub = new BubbleSort(test);
        bub.sort();
        System.out.println(bub);

        QuickSort qui = new QuickSort(test);
        qui.sort();
        System.out.println(qui);

        MergeSort mer = new MergeSort(test);
        mer.sort();
        System.out.println(mer);
    }
}
