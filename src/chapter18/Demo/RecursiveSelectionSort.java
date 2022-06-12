package chapter18.Demo;

public class RecursiveSelectionSort {
    public static void sort(double[] list) {
        sort(list, 0, list.length - 1); // Sort the entire list
        for (double d : list)
            System.out.println(d);
    }

    private static void sort(double[] list, int low, int high) {
        if (low < high) {
            // Find the smallest number and its index in list[low .. high]
            int indexOfMin = low;
            double min = list[low];
            for (int i = low + 1; i <= high; i++) {
                if (list[i] < min) {
                    min = list[i];
                    indexOfMin = i;
                }
            }

            // Swap the smallest in list[low .. high] with list[low]
            list[indexOfMin] = list[low];
            list[low] = min;

            // Sort the remaining list[low+1 .. high]
            sort(list, low + 1, high);
        }
    }

    public static void main(String[] args) {
        sort(new double[] {11.6, 9.8, 3.4, 12.2, 1.4, 8.4});
    }
}
