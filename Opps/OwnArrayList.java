//package Opps;
//class ArrayList{
//    int[] arr;
//    int idx=0;
//    int size=0;
//    ArrayList(int capacity){
//        arr=new int[capacity];
//    }
//
//    void add(int ele){
//        if(idx==arr.length){ //ARRAY IS FULL
//            capacityIncrease();
//        }
//        arr[idx++]=ele;
//        size++;
//    }
//
//    void capacityIncrease(){
//        int [] arr2=new int[arr.length*2]; //CAPACITY INCREASE
//        for(int i=0;i<arr.length;i++){ //COPY AND PEST
//            arr2[i]=arr[i];
//        }
//        arr=arr2;
//    }
//
//    void removedForEnd(){
//         idx--;
//         size--;
//    }
//
//
//        void remove(int index) {
//            for (int i = index; i < size - 1; i++) {
//                arr[i] = arr[i + 1];
//            }
//            size--;
//        }
//
//
//
//    void insert(int idx,int valu){
//        for (int i = size; i > idx; i--) {
//            arr[i] = arr[i - 1];
//        }
//
//        arr[idx] = valu;
//        size++;
//        this.idx++;
//    }
//
//    int cpacity(){
//        return arr.length;
//    }
//}
//public class OwnArrayList {
//    public static void main(String[] args){
//        ArrayList arr=new ArrayList(4);
//        System.out.println(arr.cpacity());
//        System.out.println(arr.size);
//        arr.add(10);
//        arr.add(20);
//        arr.add(30);
//        arr.add(40);
//        System.out.print(arr.size);
//    }
//}