public void testMixed(){
     int[] arr = new int[5];
     arr[0] = -1;
     arr[1] = -2;
     arr[2] = 0;
     arr[3] = 1;
     arr[4] = 2;

     int[] Sortedarr = new int[5];
     Sortedarr[0] = -2;
     Sortedarr[1] = -1;
     Sortedarr[2] = 0;
     Sortedarr[3] = 1;
     Sortedarr[4] = 2;
     SelectionSort tempVal = new SelectionSort();
     tempVal.basicSelectionSort(arr);
     assertArrayEquals(Sortedarr, arr);
       /** Test data contains with both positive, negative and zeros **/
   }

   public void testDuplicates(){
     int[] arr = new int[5];
     arr[0] = 1;
     arr[1] = 1;
     arr[2] = 1;
     arr[3] = 2;
     arr[4] = 2;

     int[] Sortedarr = new int[5];
     Sortedarr[0] = 1;
     Sortedarr[1] = 1;
     Sortedarr[2] = 1;
     Sortedarr[3] = 2;
     Sortedarr[4] = 2;

     SelectionSort tempVal = new SelectionSort();
     tempVal.basicSelectionSort(arr);
     assertArrayEquals(Sortedarr, arr);
       /** Test data contains duplicates **/
   }
