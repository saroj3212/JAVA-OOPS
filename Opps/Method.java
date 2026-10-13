//package Opps;
//public class Method{
//    public static class StudentData{
//        int name;
//        int id;
//        int[] mark;
//
//        StudentData(int n){   //DIFERENT SIZE OF ARRAY PASS USING CONSTRACTOR
//            mark=new int[n];
//        }
//
//    }
//public static void main(String[] args){
// StudentData s1 = new StudentData(4);
//    StudentData s2 = new StudentData(3);
//}
//}

//package Opps;
//public class Method{
//    public static class StudentData{
//        int[] marks;
//        StudentData(int[] n){
//            marks=n;
//        }
//        void print(){
//            for(int i=0;i<marks.length;i++){
//                System.out.print(marks[i]+" ");
//            }
//        }
//    }
//    public static void main(String[] args){
//      int[] arr= {2,3,4,5};
//      StudentData s1=new StudentData(arr);
//      s1.marks[0]=30; //shallo copy
//      s1.print();
//    }
//}