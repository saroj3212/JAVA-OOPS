//package Recoursion;
//public class OneToN{
//    public static void fun(int x,int y){
//        if(x==0||y>x)return;
//        System.out.println(y);
//        y++;
//        fun(x,y);
//    }
//    public static void main(String[] args){
//        int n=5;
//        fun(n,1);
//    }
//}


////This concept are VVI
//
//package Recoursion;
//import java.util.Scanner;
//public class OneToN{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//        fun(n);
//    }
//
//    public static void fun(int x){
//        if(x==0)return;
//        fun(x-1);
//        System.out.println(x); //Call → Call → Call → return 0 → Print while coming BACK
//    }
//}