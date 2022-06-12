package chapter18.Demo;

public class RecursiveBinarySearch {
    public static int recursiveBinarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        return recursiveBinarySearch(list, key, low, high);
    }

    private static int recursiveBinarySearch(int[] list, int key,
                                             int low, int high) {
        if (low > high) // The list has been exhausted without a match
            return -low - 1;

        int mid = (low + high) / 2;
        if (key < list[mid])
            return recursiveBinarySearch(list, key, low, mid - 1);
        else if (key == list[mid])
            return mid;
        else
            return recursiveBinarySearch(list, key, mid + 1, high);
    }

    public static void main(String[] args) {
        int index = recursiveBinarySearch(new int[] {1, 4, 7, 8, 11, 34, 67}, 8);
        System.out.println("The index of the number: " + index);
    }
}
