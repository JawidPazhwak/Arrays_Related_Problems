import java.util.Scanner;
public class MatrixDeterminant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 2;
        int col = 2;
        int[][] arr = new int[row][col];
        input(arr, sc);
        System.out.println("Matrix: ");
        output(arr);
        System.out.println("Determinant: " + det(arr));
    }
    public static int[][] input(int[][] arr, Scanner sc){
        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j < arr[i].length; j ++){
                System.out.println("Enter your number: ");
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public static void output(int[][] arr){
        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j < arr[i].length; j ++){
                if(j != arr[i].length){
                    System.out.print(arr[i][j] + ", ");
                }
                else{
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }
    }
    public static int det(int[][] arr){
        return arr[0][0] * arr[1][1] - arr[1][0] * arr[0][1];
    }
}
