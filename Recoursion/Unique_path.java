//METHOD 1
//package Recoursion;
//public class Unique_path{
//
//    public static int path(int m,int n){
//        if(m==1 || n==1)return 1;
//        return path(m-1,n)+path(m,n-1);
//    }
//    public static void main(String[] args){
//        int m=2;
//        int n=2;
//        System.out.println(path(m,n));
//    }
//}

////METHOD 2
//package Recoursion;
//public class Unique_path{
//
//    public static int path(int cr,int cc,int lr,int lc){
//        if(cr==lr && cc==lc)return 1;
//        if(cr>lr || cc>lc)return 0;
//        int right=path(cr,cc+1,lr,lc);
//        int down=path(cr+1,cc,lr,lc);
//        return right+down;
//    }
//    public static void main(String[] args){
//        int m=2;
//        int n=2;
//        System.out.println(path(0,0,m-1,n-1));
//    }
//}