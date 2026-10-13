//package TwoD_Array;
//
//import java.util.ArrayList;
//
//public class Array_List {
//    public static void main(String[] args) {
//
//        ArrayList<Integer> c = new ArrayList<>();
//        c.add(2);c.add(5);
//
//        ArrayList<Integer> d=new ArrayList<>();
//        d.add(3);d.add(5);
//
//        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
//           arr.add(c);arr.add(d);
//
//        System.out.println(arr);
//
//        //print 2d array
//        for(int i=0;i<arr.size();i++){
//            for(int j=0;j<arr.get(i).size();j++){
//                System.out.print(arr.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//        //using for each loop
//        for(ArrayList<Integer> list: arr){
//            for(int ele: list) System.out.print(ele+" ");
//            System.out.println();
//        }
//    }
//}