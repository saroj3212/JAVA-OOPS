//package String;
//public class NonRepetingCharacter{
//    public static void main(String[] args){
//        String s="racecar";
//        System.out.println(fun(s));
//    }
//
//    public static char fun(String s){
//
//                int[] freq = new int[26];
//
//                // Count frequency
//                for (int i = 0; i < s.length(); i++) {
//                    freq[s.charAt(i) - 'a']++;
//                }
//
//                // Find first character with frequency 1
//                for (int i = 0; i < s.length(); i++) {
//                    if (freq[s.charAt(i) - 'a'] == 1) {
//                        return s.charAt(i);
//                    }
//                }
//
//                return '$';
//
//
//
//
//    }
//}