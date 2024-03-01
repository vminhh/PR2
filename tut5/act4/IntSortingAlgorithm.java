package tut5.act4;

public class IntSortingAlgorithm {
    protected String name;
    protected int[] array;
    protected int[] sortedArray;

    public IntSortingAlgorithm(String name, int[] array) {
        this.name = name;
        this.array = array;
    }

    public void sort() {
    }

    public boolean isSorted() {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < array[i])
                return false;
        }
        return true;
    }

    public String toString() {
        return getName() + java.util.Arrays.toString(array);
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] arr) {
        this.array = arr;
    }

    public int[] getSortedArr() {
        return sortedArray;
    }

    public void setSortedArr(int[] arr) {
        this.sortedArray = arr;
    }
}
