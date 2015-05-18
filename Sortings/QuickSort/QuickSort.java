public class QuickSort {

    public static void main(String[] args) {

        int[] list = { 24,21,11,21,45,26,63 };
        System.out.print("\nOriginal List: ");
        for(int i : list) System.out.print(i + " ");
        System.out.print("\n");

        sort(list); // Sort the list using QuickSort

        System.out.print("Sorted by QuickSort: ");
        for(int i : list) System.out.print(i + " ");
        System.out.println("\n");
    }

    public static void QuickSort(int[] list, int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;

        int pivot = list[lowerIndex+(higherIndex-lowerIndex) / 2];

        while(i <= j) {
            while(list[i] < pivot) {
                i++;
            }

            while(list[j] > pivot) {
                j--;
            }
            if(i <= j) {
                swap(list, i, j);
                i++;
                j--;
            }
        }

        if(lowerIndex < j) {
            QuickSort(list, lowerIndex, j);
        }

        if(i < higherIndex) {
            QuickSort(list, i, higherIndex);
        }
    }

    public static void sort(int[] list) {
        if(list == null || list.length == 0) {
            return;
        }
        QuickSort(list, 0, list.length-1);
    }

    public static void swap(int[] list, int A, int B) {
        int temp = list[A];
        list[A] = list[B];
        list[B] = temp;
    }
}
