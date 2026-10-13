//package Recoursion;
//public class SubsetOfSum {
//
//    public static boolean subset(int[] arr, int idx, int sum) {
//
//        // Target found
//        if (sum == 0) {
//            return true;
//        }
//
//        // No elements left
//        if (idx == arr.length) {
//            return false;
//        }
//
//        // Include current element OR exclude current element
//        return subset(arr, idx + 1, sum - arr[idx])
//                || subset(arr, idx + 1, sum);
//    }
//
//    public static void main(String[] args) {
//
//        int[] arr = {5,4,3};
//        int sum = 8;
//
//        System.out.println(subset(arr, 0, sum));
//    }
//}
