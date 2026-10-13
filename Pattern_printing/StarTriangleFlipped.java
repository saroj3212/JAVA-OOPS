//package Pattern_printing;
//
//import java.util.Scanner;
//
//public class StarTriangleFlipped {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("enter the number : ");
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//               if(n+1<=i+j) System.out.print("*");
//               else System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
//}



//package Pattern_printing;
//
//import java.util.Scanner;
//
//public class StarTriangleFlipped {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("enter the number : ");
//                int n=sc.nextInt();
//                for(int i=1;i<=n;i++){
//                    for(int j=1;i+j<=n;j++){  //this loop is work in # print;
//                        System.out.print("#"+" ");
//                    }
//                    for(int k=1;k<=i;k++){   //this loop is work in * print;
//                        System.out.print("*" +" ");
//                    }
//                    System.out.println();
//                }
//    }
//}