import java.util.Scanner;
public class RowAndColumnSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        input(arr, sc);
        System.out.println("Matrix: ");
        output(arr);
        System.out.println();
        sum(arr);
    }
    public static void input(int[][] arr, Scanner sc){
        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j < arr[i].length; j ++){
                System.out.println("Enter your number: ");
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public static void output(int[][] arr){
        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j < arr[i].length; j ++){
                if(j != arr[i].length - 1){
                    System.out.print(arr[i][j] + ", ");        
                }
                else{
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }
    }
    public static void sum(int[][] arr){
        
        for(int i = 0; i < arr.length; i ++){
            int rowsum = 0;
            int colsum = 0;
            for(int j = 0; j < arr[i].length; j ++){
                rowsum = rowsum + arr[i][j];
                colsum = colsum + arr[j][i];
            }
            System.out.println("Row sum: " + rowsum + " ");
            System.out.println("Col sum: " + colsum + " ");

        }
        
    }
}
