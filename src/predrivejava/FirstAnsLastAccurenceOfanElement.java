package predrivejava;


public class  FirstAnsLastAccurenceOfanElement {

    public static int firstOccurence(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return firstOccurence(arr, key, i + 1);
    }

    public static int lstOccurence(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        int isFound = lstOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 7, 8, 5};
        System.out.println(firstOccurence(arr, 5, 0));
        System.out.print(lstOccurence(arr, 5, 0));
    }
}



//
//public class FirstAnsLastAccurenceOfanElement {
//    public int[] searchRange(int[] nums, int target) {
//        int[] ans = {-1, -1};
//        ans[0] = firstOccurrence(nums, target, 0);
//        ans[1] = lastOccurrence(nums, target, 0);
//        return ans;
//    }
//
//    public static int firstOccurrence(int[] arr, int key, int i) {
//        if (i == arr.length) {
//            return -1;
//        }
//
//        if (arr[i] == key) {
//            return i;
//        }
//
//        return firstOccurrence(arr, key, i + 1);
//    }
//
//    public static int lastOccurrence(int[] arr, int key, int i) {
//        if (i == arr.length) {
//            return -1;
//        }
//
//        int isFound = lastOccurrence(arr, key, i + 1);
//        if (isFound == -1 && arr[i] == key) {
//            return i;
//        }
//        return isFound;
//    }
//}
