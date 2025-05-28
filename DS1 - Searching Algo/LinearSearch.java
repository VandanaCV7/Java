import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1, 5, 100, 99, 2, 4, 15};
        boolean flag = false;
        //Printing an array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //getting a input from user to search
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        //searching
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                System.out.println("Preset");
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println("Absent");
        }
        sc.close();
    }
}
