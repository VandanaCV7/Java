public class JumpSearch {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21,34, 55, 89, 144, 233, 377, 610};
        int x = 1; // Find the index of 'x' using Jump Search
        int index = JumpSearching(arr, x);
        System.out.println("\nNumber " + x +" is at index " + index); // Print the index where 'x' is located
    }
    static int JumpSearching(int arr[], int x){
        int n = arr.length; // Finding block size to be jumped
        int step = (int)Math.floor(Math.sqrt(n));
        // Finding the block where element is present (if it is present)
        int prev = 0;
        for (int minStep = Math.min(step, n)-1; arr[minStep] < x; minStep = Math.min(step, n)-1)
        {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }
        // Doing a linear search for x in block beginning with prev.
        while (arr[prev] < x)
        {
            prev++;
            // If we reached next block or end of array, element is not present.
            if (prev == Math.min(step, n))
                return -1;
        }
        // If element is found
        if (arr[prev] == x){
            return prev;
        }
        return -1;
    }
}
