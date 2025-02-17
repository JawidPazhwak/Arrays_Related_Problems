public class MatrixTranspose {
    public static void main(String[] args){
        int [][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        
        System.out.println("Matrix: ");
        output(arr);
        System.out.println("Transpose: ");
        transpose(arr);
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
    public static void transpose(int[][] arr){
        for(int i = 0; i < arr.length; i ++){   
            for(int j = 0; j < arr[i].length; j ++){
                if(j != arr[i].length - 1){
                    System.out.print(arr[j][i] + ", ");
               }
               else{
                System.out.print(arr[j][i]);
               }               
            }
            System.out.println();
        }
    }
}
