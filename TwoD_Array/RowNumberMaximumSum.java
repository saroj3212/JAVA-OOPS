//package TwoD_Array;
//public class RowNumberMaximumSum{
//    public static void main(String[] args){
//        int[][] arr={{1,2,3},{3,2,3},{4,5,6}};
//        int max=-1;
//        int count=0;
//        for(int i=0;i<arr.length;i++){
//            int sum=0;
//            for(int j=0;j<arr[0].length;j++){
//                sum+=arr[i][j];
//
//            }
//            if(max<sum){
//                max=i;
//                count=sum;
//            }
//            System.out.println();
//        }
//        System.out.println(max+" "+count);
//    }
//}

////Find the minimum element out of all the maximum elements of each row
//package TwoD_Array;
//public class RowNumberMaximumSum{
//    public static void main(String[] args){
//        int[][] arr={{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};
//        int[] ans = new int[arr.length];
//
//        for(int i=0;i<arr.length;i++){
//
//            int sum=0;
//            for(int j=0;j<arr[0].length;j++){
//                if(sum<arr[i][j]) sum=arr[i][j];
//            }
//             ans[i]=sum;
//        }
//
//        int max= Integer.MAX_VALUE;
//        for(int i=0;i<ans.length;i++){
//             if(max>ans[i]) max=ans[i];
//        }
//        System.out.print(max);
//    }
//}