//package Pattern_printing;
//
//import java.util.Scanner;
//
//public  class NumberBridge {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("enter the row & colum no : ");
//        int n=sc.nextInt();
//        for(int i=1;i<=2*n-1;i++)  System.out.print(i +" ");
//        System.out.println();
//
//        n--; //4
//        for(int i=1;i<=n;i++){ //Row number
//            int a=1;
//            for(int j=1;j<=n+1-i;j++) System.out.print(a++ +" "); // number print
//            for(int k=1;k<=2*i-1;k++) {
//                System.out.print(" " +" "); //Space print
//                a++;
//            }
//            for(int j=1;j<=n+1-i;j++) System.out.print(a++ +" "); // number print
//
//            System.out.println();
//        }
//    }
//}
//
