import java.util.Scanner;
public class SearchElementInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in your matrix: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns in your matrix: ");
        int col = sc.nextInt();
        
        int[][] matrix = new int[row][col];
        input(matrix, sc);

        find(matrix, sc);
    }
    public static void input(int[][] matrix, Scanner sc) {
        for(int i = 0; i < matrix.length; i ++){
            for(int j = 0; j < matrix[i].length; j ++){
                System.out.println("Enter the number: ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    public static void find(int[][] matix, Scanner sc) {
        System.out.println("Enter the number you want to find in the matrix: ");
        int n = sc.nextInt();
        boolean flag = false;
        int col = 0;
        int row = 0;
        for(int i = 0; i < matix.length; i ++){
            for(int j = 0; j < matix[i].length; j ++){
                if(n == matix[i][j]){
                    flag = true;
                    row = i;
                    col = j;
                    break;
                }
            }
            if(flag){
                break;
        }
    }
        if(flag){
            System.out.println(n + " found in the row " + row + " and column " + col);
        }
        else{
            System.out.println(n + " not found");
        }
    }
}
