package tricKy;

public class program3 {
     

 
    public static int countInversions(int[] arr) {
        if (arr == null || arr.length < 2) return 0;
        return mergeSortAndCount(arr, 0, arr.length - 1);
    }

  
    private static int mergeSortAndCount(int[] arr, int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = (left + right) / 2;

            
            count += mergeSortAndCount(arr, left, mid);

     
            count += mergeSortAndCount(arr, mid + 1, right);

           
            count += mergeAndCount(arr, left, mid, right);
        }
        return count;
    }


    private static int mergeAndCount(int[] arr, int left, int mid, int right) {
        int[] leftArr = new int[mid - left + 1];
        int[] rightArr = new int[right - mid];

    
        System.arraycopy(arr, left, leftArr, 0, leftArr.length);
        System.arraycopy(arr, mid + 1, rightArr, 0, rightArr.length);

        int i = 0, j = 0, k = left, swaps = 0;

     
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                swaps += (leftArr.length - i); 
            }
        }

      
        while (i < leftArr.length) arr[k++] = leftArr[i++];
        while (j < rightArr.length) arr[k++] = rightArr[j++];

        return swaps;
    }


    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int result = countInversions(arr);

        System.out.println("Number of inversion pairs: " + result);
    }
}
