package Array;

public class FindKthSmallestElement {// Standard partition process of QuickSort.
    // It considers the last element as pivot
    // and moves all smaller element to left of
    // it and greater elements to right
    public static int partition(Integer[] arr, int low, int high)
    {
        int x = arr[high], i = low;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] <= x) {
                // Swapping arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
 
                i++;
            }
        }
 
        // Swapping arr[i] and arr[r]
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
 
        return i;
    }
 
    // This function returns k'th smallest element
    // in arr[l..r] using QuickSort based method.
    // ASSUMPTION: ALL ELEMENTS IN ARR[] ARE DISTINCT
    public static int kthSmallest(Integer[] arr, int low, int high, int k)
    {
        // If k is smaller than number of elements
        // in array
        if (k > 0 && k <= high - low + 1) {
            // Partition the array around last
            // element and get position of pivot
            // element in sorted array
            int pos = partition(arr, low, high);
 
            // If position is same as k
            if (pos - low == k - 1)
                return arr[pos];
 
            // If position is more, recur for
            // left subarray
            if (pos - low > k - 1)
                return kthSmallest(arr, low, pos - 1, k);
 
            // Else recur for right subarray
            return kthSmallest(arr, pos + 1, high, k - pos + low - 1);
        }
 
        // If k is more than number of elements
        // in array
        return Integer.MAX_VALUE;
    }
 
    // Driver program to test above methods
    public static void main(String[] args)
    {
        Integer arr[] = new Integer[] { 12, 3, 5, 7, 4, 19, 26 };
        int k = 3;
        System.out.print("K'th smallest element is " + kthSmallest(arr, 0, arr.length - 1, k));
    }
}
