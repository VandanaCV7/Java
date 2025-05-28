public class P2Maxof3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;

        // Find the maximum of three numbers
        int max = a; // Assume a is the maximum initially

        if (b > max) {
            max = b; // Update max if b is greater
        }
        if (c > max) {
            max = c; // Update max if c is greater
        }

        System.out.println("The maximum of " + a + ", " + b + ", and " + c + " is: " + max);
    }
}
