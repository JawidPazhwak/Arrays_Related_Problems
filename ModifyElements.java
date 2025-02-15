import java.util.Scanner;
public class ModifyElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of your array: ");
        int l = sc.nextInt();

        int[] arr = new int[l];
        input(arr, sc);
        System.err.println("Before modifying: ");
        output(arr);
        System.err.println();
        System.err.println("After modifying: ");
        modify(arr);
        output(arr);

    }
    public static void input(int[] arr, Scanner sc){
        for(int i = 0; i < arr.length; i ++){
            System.err.println("Enter your number: ");
            arr[i] = sc.nextInt();
        }
    }
    public static void modify(int[] arr){
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] > 0){
                arr[i] = 1;
            }
            else if(arr[i] < 0){
                arr[i] = 0;
            }
            else{
                arr[i] = arr[i];

            }
                        }
    }
    public static void output(int[] arr){
        for(int i = 0; i < arr.length; i ++){
            if(i != arr.length - 1){
                System.out.print(arr[i] + ", ");
            }
            else{
                System.err.println(arr[i]);
            }
        }
    }

}
