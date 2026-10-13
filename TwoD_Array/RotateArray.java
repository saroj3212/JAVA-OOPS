//ROTATE 90 DEGREE

//METHOD 1
//package TwoD_Array;
//public class RotateArray{
//    public static void main(String[] args){
//        int[][] arr={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
//        for(int i=0;i<arr[0].length;i++){
//            for(int j=arr.length-1;j>=0;j--){
//                 System.out.print(arr[j][i]+" ");
//            }
//            System.out.println();
//        }
//
//
//    }
//}

////METHOD 2 LEETCODE
//
//package TwoD_Array;
//public class RotateArray{
//    public static void main(String[] args){
//        int[][] arr={{2,8,3,4},{7,2,1,6},{5,5,4,1},{3,1,8,2}};
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<i;j++){
//                 int temp=arr[i][j];
//                 arr[i][j]=arr[j][i];
//                 arr[j][i]=temp;
//            }
//
//        }
//        for(int i=0;i<arr.length;i++){
//            for(int j=arr[0].length-1;j>=0;j--){
//                 System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//
//
//
//    }
//}