public class SymmetricMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {2,4,5}, {3,5,6}};
        symmetric(arr);
    }
    public static void symmetric(int[][] arr){
        boolean flag = false;
        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j < arr[i].length; j ++){
                flag = false;
                if(arr[i][j] == arr[j][i]){
                    flag = true;
                }
            }
        }
        if(flag){
            System.out.println("Matrix is symmetric");
        }
        else{
            System.out.println("Matrix is not symmetric");
        }
    }
}
