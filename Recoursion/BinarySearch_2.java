//      //FIRST OCCCURENCE
//package Recoursion;
//public class BinarySearch_2{
//    public static void main(String[] args){
//      int[] arr={2,3,4,5,5,6,7};
//        int hi=arr.length-1;
//        System.out.println(fun(arr,5,0,hi));
//    }
//
//    public static int fun(int[] arr,int target,int lo, int hi){
//
//        if(lo>hi)return -1;
//        int mid=lo+(hi-lo)/2;
//        int x=0;
//        if(arr[mid]==target && arr[mid-1]==target){
//            return mid-1;
//
//
//        }
//        else if(arr[mid]>target)return fun(arr,target,lo,hi-1);
//        else return fun(arr,target,lo+1,hi);
//
//    }
//
//
//}