//package TwoD_Array;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Pascal_Triangle {
//
//    public static void main(String[] args) {
//
//        int n = 2;
//
//        List<List<Integer>> ans = generate(n);
//
//        System.out.println(ans);
//    }
//
//    public static List<List<Integer>> generate(int n) {
//
//        List<List<Integer>> ans = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//
//            ans.add(new ArrayList<>()); // this is array list creat like this []
//
//            for (int j = 0; j <= i; j++) {
//
//                if (i == j || j == 0) {
//                    ans.get(i).add(1);  // i[1]
//                }
//                else {
//                    int val = ans.get(i - 1).get(j)
//                            + ans.get(i - 1).get(j - 1);
//
//                    ans.get(i).add(val);
//                }
//            }
//        }
//
//        return ans;
//    }
//}