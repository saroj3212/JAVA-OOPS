//
//package Input;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//
//public class BufferReder {
//
//    public static void main(String[] args) throws IOException {
//
//        // Keyboard input নেওয়ার ব্যবস্থা তৈরি
//        BufferedReader br = new BufferedReader(
//                new InputStreamReader(System.in)
//        );
//
//        // প্রথম সংখ্যা পড়া
//        System.out.print("Enter first number: ");
//        int a = Integer.parseInt(br.readLine());
//
//        // দ্বিতীয় সংখ্যা পড়া
//        System.out.print("Enter second number: ");
//        int b = Integer.parseInt(br.readLine());
//
//        // দুটি সংখ্যা যোগ করা
//        int sum = a + b;
//
//        // Result print করা
//        System.out.println("Sum = " + sum);
//    }
//}
