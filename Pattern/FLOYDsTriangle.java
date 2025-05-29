package Pattern;

public class FLOYDsTriangle {
public static void main(String[] args) {
    int x=0,n=7;
    for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
            System.out.print(x +"  ");
            x++;
        }
        System.out.println();
    }
}
}
