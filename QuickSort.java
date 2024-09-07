import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] arr, int low, int high){
        if(low<high){
            int p = part(low,high,arr);
            sort(arr, low, p-1);
            sort(arr, p+1, high);
        }
        
    }
    public static int part(int low, int high, int[] arr){
        int pivot = arr[high];
        int m = low;
        for(int i =low ; i < high ; i++){
            if(arr[i]<=pivot){
                int temp = arr[m];
                arr[m]= arr[i];
                arr[i]= temp;
                m++;
            }
        }
        int temp = arr[m];
        arr[m] = arr[high];
        arr[high]=temp;
        return m;
    }

    public static void main(String[] args) {
        int[] arr ={5,4,1,7,6,2};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
