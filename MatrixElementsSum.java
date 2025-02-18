public class MatrixElementsSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("Matrix: ");
        output(arr);
        System.out.println("Sum of elements: ");
        sum(arr);

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
    public static void sum(int[][] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j < arr[i].length; j ++){
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
