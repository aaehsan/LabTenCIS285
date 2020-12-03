
public class SelectionSort {
	 private int temp;

	/** Creates a new instance of SelectionSort */
    public SelectionSort() {
    }

    /* A simple SelectionSort algorithm
     * pre-condition: Must have created an array of integers
     * post-condition: The nested loop will test the array of integers
     * inputs: Integer values
     * outputs: Check whether positive, negative, mixed, or duplicate
     * special conditions: All values must be integers and put in an array
     */
    public int[] basicSelectionSort(int[] x) {
        for (int i = 0; i < x.length; ++i) {
            for (int j= i+1; j < x.length; ++j) {
                if (x[i] > x[j]) {
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            } // end of inner for loop
        } // end of outer for loop
        return x;
    } // end of basicSelectionSort method

}
