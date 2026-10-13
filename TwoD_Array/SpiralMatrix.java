//package TwoD_Array;
//
//import java.util.*;
//
//public class SpiralMatrix {
//
//    public static void main(String[] args) {
//
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        System.out.println(SpiralTravel(arr));
//    }
//
//    public static ArrayList<Integer> SpiralTravel(int[][] arr) {
//
//        ArrayList<Integer> ans = new ArrayList<>();
//
//        int m = arr.length;
//        int n = arr[0].length;
//
//        int fr = 0, lr = m - 1; // first row, last row
//        int fc = 0, lc = n - 1; // first column, last column
//
//        while (fr <= lr && fc <= lc) {
//
//            // RIGHT →
//            if (fr > lr || fc > lc) break;
//
//            for (int j = fc; j <= lc; j++) {
//                ans.add(arr[fr][j]);
//            }
//            fr++;
//
//            // DOWN ↓
//            if (fr > lr || fc > lc) break;
//
//            for (int i = fr; i <= lr; i++) {
//                ans.add(arr[i][lc]);
//            }
//            lc--;
//
//            // LEFT ←
//            if (fr > lr || fc > lc) break;
//
//            for (int j = lc; j >= fc; j--) {
//                ans.add(arr[lr][j]);
//            }
//            lr--;
//
//            // UP ↑
//            if (fr > lr || fc > lc) break;
//
//            for (int i = lr; i >= fr; i--) {
//                ans.add(arr[i][fc]);
//            }
//            fc++;
//        }
//
//        return ans;
//    }
//}