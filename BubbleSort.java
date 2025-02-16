public class BubbleSort {
    public static void main(String[] args) {

        String[] names = {"Bob", "Alice", "Max"};
        int[] marks = {100, 80, 90,};

        System.out.println("Before sorting: ");
        output(marks, names);
        System.out.println();
        System.out.println("After sorting: ");
        sort(marks);
        output(marks, names);
    }
    public static void sort(int[] arr1){
        for(int i = 0; i < arr1.length; i ++){
            for(int j = 0; j < arr1.length - 1; j ++){
                int min = arr1[j];
                int max = arr1[j + 1];
                if( max < min){
                    arr1[j] = max;
                    arr1[j + 1] = min;
                }
            }
        }
    }
    public static void output(int[] arr1, String[] arr2){

        for(int i = 0; i < arr2.length; i ++){
            if(i != arr2.length - 1){
                System.out.print(arr2[i] + ", ");
            }
            else{
                System.out.print(arr2[i]);
            }
        }
                
        System.out.println();
        for(int i = 0; i < arr1.length; i ++){
            if(i != arr1.length - 1){
             System.out.print(arr1[i] + ", ");
            }
            else{
                System.out.print(arr1[i]);
            }
        }

    }
}
