//package Recoursion;
//public class TowerOfHanoi{
//
//    public static void main(String[] args){
//        hanoi(3,'A','B','C');
//    }
//
//    public static void hanoi(int n,char a,char b,char c){
//        if (n==0)return;
//        //via via variable are midle hare
//        //n-1 disk a to b via c
//        hanoi(n-1,a,c,b);
//        //largest from a to c
//        System.out.println(a+"->"+c);
//        //n-1 disk b to c
//        hanoi(n-1,b,a,c);
//
//    }
//}