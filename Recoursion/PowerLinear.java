//package Recoursion;
//import java.util.Scanner;
//public class PowerLinear{
//    public static int pow(int a,int b){
//        if (b==0 )return 1;
//         return a*pow(a,b-1);
//    }
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.print("enter the first number : ");
//        int n=sc.nextInt();
//        System.out.print("enter the power number : ");
//        int p=sc.nextInt();
//       int result= pow(n,p);
//       System.out.println(result);
//    }
//}

////Better version
//package Recoursion;
//import java.util.Scanner;
//public class PowerLinear{
//    public static int pow(int a,int b){
//        if(b==0)return 1;
//        int call=pow(a,b/2);
//        if(b%2==0) return call * call;
//         else return a * call * call;
//    }
//
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.print("enter the Base: ");
//        int a=sc.nextInt();
//        System.out.print("enter the exponent : ");
//        int b=sc.nextInt();
//        System.out.println(pow(a,b));
//    }
//}