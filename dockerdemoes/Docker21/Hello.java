
import java.util.Arrays;

public class Hello {
    static public void main(String[] tts) {
        int ar[] = {0, 2, 9, 4, 5, 6, -41, -5};
        System.out.println("Array before sorting : "+Arrays.toString(ar));
        bubbleSort(ar);
        System.out.println("Sorted Array : "+Arrays.toString(ar));
    }

    public static void bubbleSort(int ... krishna) {
        int n = krishna.length;

        for(int i = 0; i < n-1; i++) {
            for(int j = 0 ; j < n-i-1; j++) {
                if(krishna[j]>krishna[j+1]) {
                    //swap krishna[j] and krishna[j+1]
                    int temp = krishna[j];
                    krishna[j] = krishna[j+1];
                    krishna[j+1] = temp;
                }
            }
        }
    }
}