import java.util.Scanner;
public class RemoveElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of your array: ");
        int l = sc.nextInt();
        System.out.println("Enter the number you want to remove: ");
        int n = sc.nextInt();
        int[] arr = new int[l];

        input(arr, sc);
        System.out.println("Before removing: ");
        output(arr);
        System.out.println();
        System.out.println("After removing: ");
        remove(arr, n);
        output(arr);
    }
    public static void input(int[] arr, Scanner sc){
        for(int i = 0; i < arr.length; i ++){
            System.out.println("Enter your number: ");
            arr[i] = sc.nextInt();
        }

    }
    public static void output(int[] arr){
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] != 0){
                if(i != arr.length - 1){
                    System.out.print(arr[i] + ", ");
                }
                else{
                    System.out.print(arr[i]);
                }
            }
       }
    }
    public static void remove(int[] arr, int n){
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == n){
                arr[i] = 0;
            }
            
        }
    }
    
}
