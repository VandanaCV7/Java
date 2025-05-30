public class MergeSort {public static void main(String[] args) {
    int[] intArray = {20, 35, -15, 7, 55, 1, -22};
    mergesortt(intArray,0, intArray.length);
    for (int i=0 ; i<intArray.length ; i++){
        System.out.println(intArray[i]+" ");
    }
}
public static void mergesortt(int[] input, int start, int end){
    if (end-start < 2){return;}
    int mid = (start+end)/2;
    mergesortt(input, start, mid);
    mergesortt(input, mid, end);
    merge(input, start, mid, end);
}
public static void merge(int[] input, int start, int mid, int end){
    if (input[mid-1]<= input[mid]){
        return;
    }
    int i = start;
    int j = mid;
    int tempindex = 0;
    int [] temp = new int[end - start];
    while (i<mid && j < end){
        temp[tempindex++] = input[i] <= input[j] ? input[i++] : input[j++];
    }
    System.arraycopy(input, i, input, start + tempindex, mid - i);
    System.arraycopy(temp, 0, input, start, tempindex);
    }
}
