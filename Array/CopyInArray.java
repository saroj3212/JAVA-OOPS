                //shallow copy
//package Array;
//public class CopyInArray{
//    public static void main(String[] args) {
//        int[] arr={10,30,40,50};
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//        int[] nums=arr;//copy in array in nums this copy is called shallow coppy
//        for(int ele : nums){
//            System.out.print(ele+" ");
//        }
//    }
//}


//package Array;
//public class CopyInArray{
//    public static void main(String[] args) {
//        int[] arr={10,30,40,50};
//        int[] nums=arr;
//        nums[0]=90;
//        //shallow copy change the oringal valu it is a main problem in shallow copy
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//    }
//}


                  //deep copy
    //deep copy is realy copy in array .its copy  array element change copy element valu does not impect of origanal array

//  package Array;
//import java.util.Arrays;
//public class CopyInArray{
//    public static void main(String[] args) {
//        int[] arr={20,30,40,50};
//        for(int ele:arr){
//            System.out.print(ele +" ");
//        }
//        System.out.println();
//        int[]brr=Arrays.copyOf(arr,arr.length); //deep copy
//        brr[0]=100;
//        for(int ele:arr){
//            System.out.print(ele +" ");
//        }
//    }
//}


//                package Array;
//                import java.util.Arrays;
//                public class CopyInArray{
//                    public static void main(String[] args) {
//                        int[] arr={20,30,40,50};
//                        for(int ele:arr){
//                            System.out.print(ele +" ");
//                        }
//                        System.out.println();
//                        int[] brr=new int[arr.length]; //another tactic make a deep copy
//                        for(int i=0;i<arr.length;i++){
//                            System.out.print(arr[i]+ " ");
//                        }
//                    }
//                }






 