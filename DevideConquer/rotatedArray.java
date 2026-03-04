package DevideConquer;

public class rotatedArray {

    public static int search(int[] arr, int target, int si, int ei) {

        while (si <= ei) {
            int mid = si + (ei-si) / 2;
            // Best case
            if (arr[mid] == target) {
                return mid;
            }

            // On line L1
            if (arr[si] <= arr[mid]) {
                // case1: Search on left
                if (arr[si] <= target && arr[mid] > target) {
                    return search(arr, target, si, mid - 1);
                } else { // case2: Search in remaining right
                    return search(arr, target, mid + 1, ei);
                }

            } else { // On line L2
                // case1: Search on right
                if (arr[mid] < target && arr[ei] < target) {
                    return search(arr, target, mid + 1, ei);
                } else {
                    return search(arr, target, si, mid - 1);
                }

                // case2: Serch in remaining left.
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 4, 6, 7, 0, 1, 2 };
        int target = 0;
        int ei = arr.length - 1;
        int TIdx = search(arr, target, 0, ei);
        System.out.println(TIdx);
    }
}
