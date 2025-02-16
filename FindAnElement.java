import java.util.Scanner;
public class FindAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the length of your array: ");
        int l = sc.nextInt();
        System.err.println("Enter the number you want to find: ");
        int n = sc.nextInt();

        int[] arr = new int[l];
        input(arr, sc);
        find(arr, n);
    }
    public static void input(int[] arr, Scanner sc){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter your number: ");
            arr[i] = sc.nextInt();
        }
    }
    public static void find(int[] arr, int n){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == n){
                System.out.println(n + " Found at index: " + i);
            }
            else{
                System.out.println(n + " Not found at index: " + i);
            }
        }
       
    }

}
