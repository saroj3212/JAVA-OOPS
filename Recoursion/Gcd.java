//  //HCF
//package Recoursion;
//public class Gcd{
//    public static void main(String[] args){
//        int a=12;
//        int b=16;
//            int hcf=0;
//        for(int i=1;i<=Math.min(a,b);i++){
//            if(a%i==0 && b%i==0) {
//                hcf = i;
//            }
//
//        }
//            System.out.println(hcf+" ");
//
//    }
//}

//// Best version
//package Recoursion;
//public class Gcd{
//    public static void main(String[] args){
//        int a=12;
//        int b=16;
//        System.out.println(fun(a,b)+" ");
//    }
//    public static int fun(int a , int b){
//        if(a==0) return b;
//        return fun(b%a,a);
//    }
//}