//package Pattern_printing;
//
//import java.util.Scanner;
//
//public class pascalTriangle {
//
//    public static int fact(int x) {
//        int sum = 1;
//
//        for (int i = 1; i <= x; i++) {
//            sum *= i;
//        }
//
//        return sum;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//
//            // Spaces
//            for (int j = 0; j < n - i; j++) {
//                System.out.print(" ");
//            }
//
//            // Numbers
//            for (int j = 0; j <= i; j++) {
//
//                int value = fact(i) / (fact(j) * fact(i - j));
//
//                System.out.print(value + " ");
//            }
//
//            System.out.println();
//        }
//    }
//}
