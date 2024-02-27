public class Main {
    public static void main(String[] args) {


        int[] arr = {6, 3, 5, 7, 4, 2, 1, 8}; //selection sort ile sıralanacak liste
        int[] cloneArr = {6, 3, 5, 7, 4, 2, 1, 8}; //quicksort ile sıralanacak liste
        System.out.println();
        SelectionSort(arr);
        System.out.println("Selection Sort Output:");
        System.out.println("*********************************");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("*********************************");
        recQuickSort(cloneArr, 0, cloneArr.length - 1);

        System.out.println("Quick Sort Output:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(cloneArr[i]);
        }

    }

    public static void SelectionSort(int[] aa) {
        int outt, iin, min;

        for (outt = 0; outt < aa.length; outt++) //İç içe for olduğu için O(N^2) zamanda çalışır
        {
            min = outt;
            for (iin = outt + 1; iin < aa.length; iin++) {
                if (aa[iin] < aa[min]) {
                    min = iin;
                }
            }
            Swap(outt, min, aa);
        }
    }

    public static void recQuickSort(int[] theArray, int left, int right)// best case: O(n log2n) worst case: O(n2) average case: O(n log n)
    {
        if (right - left <= 0)
            return; 
        else
        {
            int pivot = theArray[right];

            int partition = partitionIt(theArray, left, right, pivot);
            recQuickSort(theArray, left, partition - 1);
            recQuickSort(theArray, partition + 1, right);
        }
    }

    public static int partitionIt(int[] theArray, int left, int right, long pivot) {
        int leftPtr = left - 1;
        int rightPtr = right;
        while (true) {
            while (theArray[++leftPtr] < pivot) ;
            while (rightPtr > 0 && theArray[--rightPtr] > pivot) ;
            if (leftPtr >= rightPtr)
                break;
            else
                Swap(leftPtr, rightPtr, theArray);
        }
        Swap(leftPtr, right, theArray);
        return leftPtr;
    }

    private static void Swap(int a, int b, int[] aa) {
        int temp = aa[a];
        aa[a] = aa[b];
        aa[b] = temp;
    }
}
    

