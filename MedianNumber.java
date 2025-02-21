import java.util.Scanner;
public class MedianNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of you array: ");
        int l = sc.nextInt();

        int[] arr = new int[l];
        input(arr, sc);
        System.out.println("Numbers: ");
        output(arr);
        System.out.println();
        System.out.println("Median number: ");
        sort(arr);
        median(arr);
        // output(arr);
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
            for(int j = 0; j < arr.length - 1; j ++){
                int min = arr[j];
                int max = arr[j + 1];
                if(max < min){
                    arr[j] = max;
                    arr[j + 1] = min;
                }
            }
        }
    }
    public static void median(int[] arr){
        int middle = 0;
        middle = arr.length / 2;
        if(arr.length % 2 == 0){
            System.out.println((arr[middle - 1] + arr[middle]) / 2.0);
        }
        else{
            System.out.println(arr[middle]);
        }
    }
}
