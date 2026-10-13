// package Function;
//
// import java.util.Scanner;
//
// public class FactorialCalculate {
//     public static int fact(int n){
//
//         int count=1;
//         for(int i=1;i<=n;i++){
//             count*=i;
//         }
//         return count;
//     }
//         public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.print("enter the number : ");
//         int n=sc.nextInt();
//         if(n<=0){
//             System.out.println("unvalid number ");
//             return ;
//         }
//
//         int res=fact(n);
//         System.out.println("factorial of number : "+res);
//     }
// }


//package Function;
//
//import java.util.Scanner;
//
//public class FactorialCalculate {
//    public static int fact(int n){
//        int count=1;
//        for(int i=1;i<=n;i++){
//            count*=i;
//        }
//        return count;
//    }
//    public static void ncr(int n,int r){
//      System.out.println(fact(n)/(fact(r)*fact(n-r)));
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("enter the n : ");
//        int n=sc.nextInt();
//        System.out.print("enter the r : ");
//        int r=sc.nextInt();
//        if(n<0 || r<0) System.out.println("unvalid number! enter the valid number ");
//         ncr(n,r);
//
//    }
//}