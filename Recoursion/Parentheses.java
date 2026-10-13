//package Recoursion;
//import java.util.*;
//public class Parentheses{
//    public static void generate(int n,int l,int r,String s,ArrayList<String>list){
//        if(r==n){
//            list.add(s);
//            return;
//        }
//        if(l<n)generate(n,l+1,r,s+"(",list);
//        if(r<l)generate(n,l,r+1,s+")",list);
//    }
//    public static void main(String[] args){
//       int n=2;
//        ArrayList<String>list=new ArrayList<>();
//        generate(n,0,0,"",list);
//        System.out.println(list);
//    }
//}