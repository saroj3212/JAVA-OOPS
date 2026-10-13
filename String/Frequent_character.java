
             //BRUTE FORSE METHOD AND NOT ALL TIME WORK
//package String;
//import java.util.*;
//public class Frequent_character{
//    public static void main(String[] args){
//        String s="ipnhydgh";
//        char[] arr=s.toCharArray();
//        Arrays.sort(arr);
//        char  ch=arr[0];
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]) {
//                    ch=arr[i];
//                    System.out.println(ch);
//                    return;
//                }
//
//            }
//
//        }
//
//    }
//}


                         // // USING SLIDING WINDOW OPTIMIZE METHOD
//package String;
//import java.util.*;
//public class Frequent_character{
//
//    public static void main(String[] args){
//        String s="vhqvoi";
//        System.out.print(fun(s));
//    }
//
//    public static char fun(String s){
//
//        int n=s.length();
//        int max=-1;
//        char ans=s.charAt(0);
//        char[] arr=s.toCharArray();
//        Arrays.sort(arr);
//        int i=0,j=0;
//        while(j<n){
//            if(arr[i]==arr[j]) j++;
//            else {
//                int frq = j - i;
//                if (frq > max) {
//                     max=frq;
//                     ans=arr[i];
//                }
//                i=j;
//            }
//
//
//        }
//        int frq = j - i; //WHEN LAST TWO ELEMENT ARE SAME THEN THIS THING ARE WORK
//        if (frq > max) {
//            max=frq;
//            ans=arr[i];
//        }
//        return ans;
//
//    }
//
//
//}


//          //BEST SOLUTION MOST FREQUENT ARRAY
//
//  package String;
//public class Frequent_character{
//    public static void main(String[] args){
//        String s="abcdd";
//        int n=s.length();
//        int[] frq=new int[26];
//        for(int i=0;i<n;i++){
//            char ch=s.charAt(i);
//            int idx=ch-97;
//            frq[idx]++;
//        }
//        int maxFreq=-1;
//        char ans=s.charAt(0);
//        System.out.print(ans);
//    }
//}