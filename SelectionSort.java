import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of your array: ");
        int l = sc.nextInt();
        
        int[] arr = new int[l];
        input(arr, sc);
        System.out.println("Before sorting: ");
        output(arr);
        System.out.println();
        System.out.println("After sorting: ");
        sort(arr);
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
            if(i != arr.length - 1){
                System.out.print(arr[i] + ", ");
            }
            else{
                System.out.print(arr[i]);
            }
            
        }
    }
    public static void sort(int[] arr){
        for(int i = 0; i < arr.length; i ++){
            int min = i;
            for(int j = i + 1; j < arr.length; j ++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

}
