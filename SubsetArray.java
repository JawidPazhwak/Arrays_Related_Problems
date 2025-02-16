import java.util.Scanner;
public class SubsetArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of your first array: ");
        int l1 = sc.nextInt();
        System.out.println("Enter the length of your second array: ");
        int l2 = sc.nextInt();

        int[] arr1 = new int[l1];
        int[] arr2 = new int[l2];
        input(arr1, arr2, sc);
        System.out.println("Array 1: ");
        output(arr1);
        System.out.println();
        System.out.println("Array 2: ");
        output(arr2);
        System.out.println();
        subset(arr1, arr2);
    }
    public static void input(int[] arr1, int[] arr2, Scanner sc){
        for(int i = 0; i < arr1.length; i ++){
            System.out.println("Enter your number: ");
            arr1[i] = sc.nextInt();
        }
        for(int j = 0; j < arr2.length; j ++){
            System.out.println("Enter your number: ");
            arr2[j] = sc.nextInt();
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
    public static void subset(int[] arr1, int[] arr2){
        int counter = 0;
        for(int i = 0; i < arr1.length; i ++){
            for(int j = 0; j < arr2.length; j ++){
                if(arr1[i] == arr2[j]){
                    counter = counter + 1;
                }
            }
        }
        if(counter != 0){
            System.out.println("Array 2 is a subset of Array 1");
        }
        else{
            System.out.println("Array 2 is not a subset of Array 1");
        }
        
    }
}

