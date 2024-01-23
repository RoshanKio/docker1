
import java.util.Arrays;

public class Hi {
    static public void main(String tts[]) {
        int array[] = {9, 2, 8, 6, 4, 5, 7, 1};
        System.out.println("Array, before sorting : "+Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Array, after sorting : "+Arrays.toString(array));
    }

    static public void bubbleSort(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    //swap arr[y] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}