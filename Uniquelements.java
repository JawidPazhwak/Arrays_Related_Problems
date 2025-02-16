import java.util.Scanner;
public class Uniquelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the length of your array: ");
        int l = sc.nextInt();

        int[] arr = new int[l];
        int[] temp = new int[arr.length];
        input(arr, sc);
        System.err.println("Before modification: ");
        output(arr);
        duplicate(arr, temp);
        System.err.println();
        System.err.println("After modification: ");
        output(temp);
    }
    public static void input(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.err.println("Enter your number: ");
            arr[i] = sc.nextInt();
        }
    }
    public static void duplicate(int[] arr, int[] temp){
        int index = 0;
        for(int i = 0; i < arr.length; i ++){
            boolean flag = false;
            for(int j = 0; j < index; j ++){
                if(arr[i] == arr[j]){
                flag = true;
                break;
            }
        }
            
            if(!flag){
                temp[index] = arr[i];
                index ++;
            }
        }
       
       
    }
    public static void output(int[] temp){
        for(int i = 0; i < temp.length; i ++){
            if(temp[i] != 0){
                if(i != temp.length - 1){
                    System.out.print(temp[i] + ", ");
                }
                else{
                    System.out.print(temp[i]);
                }
            }
            
        }
    }
}
