import java.util.Scanner;
public class ScalarMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Given Matrix: "); 
        int[][] arr = {{1,2,3}, {4,5,6}};   
        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j < arr.length; j ++){
                if(j != arr.length - 1){
                    System.out.print(arr[i][j] + ", ");
                }
                else{
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        multiply(arr, n);
    }
    public static void multiply(int[][] arr, int n){
        int[][] arr1 = new int[arr.length][arr[0].length];
        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j < arr[i].length; j ++){
                // arr[i][j] = 0;
                arr1[i][j] = (n * arr[i][j]);
            }
        }
        for(int x = 0; x < arr1.length; x ++){
            for(int y = 0; y < arr1[x].length; y ++){
                if(y != arr1[x].length - 1){
                    System.out.print(arr1[x][y] + ", ");
                }
                else{
                    System.out.print(arr1[x][y]);
            }            
        }
        System.out.println();
     }
    }
}
