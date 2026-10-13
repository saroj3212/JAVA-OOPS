//package String;
//public class BulidInMethod{
//    public static void main (String[] args){
//        String s="panda";
//        System.out.println(s.contains("anda")); // anda are hare or not String if hare true either false
//        System.out.println(s.startsWith("pan")); //start are pan or not
//        System.out.println(s.toUpperCase());
//    }
//}


////COMPAIR TO METHOD BUILD
//package String;
//public class BulidInMethod{
//    public static void main(String[] args){
//        String a="saroj";
//        String b="sar";
//        System.out.println(compare(a,b));
//    }
//
//    public static int compare(String a, String b){
//        int count=0;
//        for(int i=0;i<a.length();i++){
//            for(int j=0;j<b.length();j++){
//                if(a.charAt(i)==b.charAt(j))count++;
//            }
//        }
//        return a.length()-count;
//    }
//}



////STRING ADD
//package String;
//public class BulidInMethod{
//    public static void main (String[] args){
//        String s="saoroj";
//        s+=10; //NUMBER ADD
//        System.out.println(s);
//        s+="panda"; //ANOTHER STRING ADD
//        System.out.println(s);
//    }
//}

////STRING INTEGER ADD
//package String;
//public class BulidInMethod{
//    public static void main (String[] args){
//        String s="saoroj";
//       System.out.println(s+10+20); // STRING ADD INTEGSER THEN THIS INTERGER STRING TREAT
//        System.out.println(10+s+20); //" " " " " " " " " "
//        System.out.println(10+s);  //" " " " " " " " " "
//        System.out.println('A'+10+s);
//    }
//}

////INTEGER TO CONVART STRING
//
//// METHOD 1
//package String;
//
//import java.util.*;
//
//public class BulidInMethod {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String s = " "; //empty String
//        System.out.println(s + n);
//
//    }
//}

////METHOD 2
//
//package String;
//
//import java.util.*;
//
//public class BulidInMethod {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        String s=Integer.toString(n);
//        System.out.println(s);
//
//    }
//}

//// STRING TO CONVART INTEGER
//package String;
//public class BulidInMethod{
//    public static void main(String[] args){
//        String s="1255656";
//        int n=Integer.parseInt(s);
//        System.out.println(n+1);
//    }
//}

////STRING TO CONVART ARRAY
//package String;
//public class BulidInMethod{
//    public static void main (String[] args){
//        String s="sarojpanda";
//        char[] arr=s.toCharArray();
//        for(char ch : arr){
//            System.out.print(ch+" ");
//        }
//    }
//}


////STRING SHORT
//package String;
//import java.util.*;
//public class BulidInMethod{
//    public static void main(String[] args){
//        String s="saroj";
//        char[] arr=s.toCharArray();
//        Arrays.sort(arr);
//        System.out.println(arr);
//    }
//}













