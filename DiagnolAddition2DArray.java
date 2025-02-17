public class DiagnolAddition2DArray {
    public static void main(String[] args){
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};

        System.out.println("Matrix: ");
        output(arr);
        System.out.println();
        add(arr);
        
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

    public static void add(int[][] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i ++){
            sum = sum + arr[i][i];
            if(i != arr.length - 1){
                System.out.print(arr[i][i] + " + ");
            }
            else{
                System.out.print(arr[i][i]);
            }
            
        }
        System.out.print(" ");
        System.out.println();
        System.out.println("Diagnol Sum: " + sum);
    }
}
