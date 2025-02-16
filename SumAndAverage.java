import java.util.Scanner;
public class SumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of your array: ");
        int l = sc.nextInt();

        Double [] arr = new Double[l];
        input(arr, sc);
        double i = sum(arr);
        System.err.println("Sum: " + i);
        double j = average(arr, i);
        System.err.println("Average: " + j);
    }
    public static void input(Double[] arr, Scanner sc){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter your number: ");
            arr[i] = sc.nextDouble();
        }
    }
    public static Double sum(Double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];    
        }
        return sum;
    }
    public static Double average(Double[] arr, Double sum){
        double average = 0;
        average = sum(arr) / arr.length;
        return average;
    }
    
}
