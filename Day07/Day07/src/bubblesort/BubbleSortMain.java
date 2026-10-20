public class BubbleSortMain {
    
    public static void bubbleSort(int arr[], int N){
        int comps = 0, passes =  0;
        // Repeat N-1 times
        for(int i = 1; i < N; i++){
            passes++;

            //Compare Consecutive pair of elements
            for( int j=0; j<N-1; j++){
                comps++;
                
                // If left element is greater than right element then swap
                if( arr[j] > arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
