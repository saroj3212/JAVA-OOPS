//package Opps;
//
//public class MethodOverloding {
//
//    public static class Student {
//
//        String name;
//        int rno;
//        double cgpa;
//
//        // Constructor 1
//        // Same constructor name "Student"
//        // Parameters: String, int, double
//        Student(String s, int x, double y) {
//            name = s;
//            rno = x;
//            cgpa = y;
//        }
//
//        // Constructor 2
//        // Same constructor name "Student"
//        // But different parameter list: no parameters
//        Student() {
//        }
//
//        // Constructor 3
//        // Same constructor name "Student"
//        // But parameter order is different: int, String, double
//        Student(int x, String s, double y) {
//            rno = x;
//            name = s;
//            cgpa = y;
//        }
//    }
//
//    public static void main(String[] args) {
//
//        // Calls Constructor 1
//        Student s1 = new Student("saroj", 3212, 7.5);
//
//        // Calls Constructor 3
//        Student s2 = new Student(3212, "saroj", 7.5);
//    }
//}