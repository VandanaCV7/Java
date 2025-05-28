public class BinarySearchRcursive {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90}; //Should be sorted
        int l = 0, r = arr.length-1; //lower and higher boundary
        int key = 90; //Searchable element
        int Result = BinarySearch(l, r, key, arr);
        System.out.println("Element "+ key + " is found at index "+Result);
    }
    static int BinarySearch(int l, int r,int key, int arr[]){
        while (l<=r) {
            int m=(l+r)/2;
            if(arr[m]==key){
                return m;
            }
            else if(arr[m]<key){
                l=m+1;
                BinarySearch(l, r, key, arr);
            }
            else{
                r=m-1;
                BinarySearch(l, r, key, arr);
            }
        }
        return -1;
    }
}