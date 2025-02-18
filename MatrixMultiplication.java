

public class MatrixMultiplication {
    public static void main(String[] args){
        int[][] arr1 = {{1,2}, {3,4}};
        int[][] arr2 = {{5,6}, {7,8}};
        System.out.println("First matrix: ");
        output(arr1);
        System.out.println("Second matrix: ");
        output(arr2);
        System.out.println("Matrix Multiplication:");
        multiply(arr1, arr2);
        output(multiply(arr1, arr2));
    }
    public static void output(int[][] arr){
        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j < arr[i].length; j ++){
                if(j != arr.length - 1){
                    System.out.print(arr[i][j] + ", ");
                }
                else{
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }
    }
    public static int[][] multiply(int[][] arr1, int[][] arr2){
        int[][] product = new int[arr1.length][arr2[0].length];
        for(int i = 0; i < arr1.length; i ++){
            for(int j = 0; j < arr2[i].length; j ++){
                for(int k = 0; k < arr1[0].length; k ++){
                    product[i][j] = product[i][j] + arr1[i][k] * arr2[k][j];
                }
                
            }
        }
        return product;
    }
}
