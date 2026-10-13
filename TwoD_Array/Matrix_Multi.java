//package TwoD_Array;
//public class Matrix_Multi {
//
//    public static void main(String[] args) {
//      int[][] arr={{1,2},{3,4}};
//        int[][] crr={{4,3},{0,1}};
//        int [][] ans= new int[arr.length][crr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//
//                for (int k = 0; k < crr.length; k++) {
//                   ans[i][j]+=arr[i][k] *crr[k][j];
//                }
//            }
//        }
//
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.print(ans[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}