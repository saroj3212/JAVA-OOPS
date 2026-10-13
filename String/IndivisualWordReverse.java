//package String;
//public class IndivisualWordReverse{
//    public static void main(String[] args){
//        String s="i am the best coder";
//        System.out.print(Reverse(s));
//    }
//
//    public static String  Reverse(String s){
//        int n=s.length();
//      String ans="";
//        int i=0,j=0;
//        while(j<n) {
//            if(s.charAt(j) == ' '){
//                StringBuilder word=new StringBuilder(s.substring(i,j));
//                word.reverse();
//
//               ans=ans+word.toString()+" ";
//               i=j+1;
//
//            }
//            j++;
//        }
//           return ans;
//    }
//}