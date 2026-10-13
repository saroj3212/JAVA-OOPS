//package Recoursion;
//public class PrintSubset {
//    public static void main(String[] args) {
//        String s = "abc";
//        subset("", s, 0);
//    }
//
//    public static void subset(String ans, String s, int idx) {
//        if (idx == s.length()) { //
//            System.out.println(ans);
//            return;
//        }
//        char ch = s.charAt(idx);
//        subset(ans + ch, s, idx + 1); //PICK
//        subset(ans, s, idx + 1); //SKIP
//    }
//}