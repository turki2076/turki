//package Generics;
//
//public class generic {
//
//    public static void main(String[] args) {
//      Pair<Integer,String> pair=new Pair<>(1,"one");
//        System.out.println(pair.getFirst());
//        System.out.println(pair.getSecond());
//        System.out.println(pair);
//
//    }
//}
//
//class Pair<T,U>{
//    T first;
//
//    U second;
//
//    public Pair (T First,U Second){
//        this.first=First;
//        this.second=Second;
//
//    }
//    public T getFirst(){
//        return first;
//    }
//    public U getSecond(){
//        return second;
//    }
//
//    @Override
//    public String toString() {
//        return "Pair{" +
//                "first=" + first +
//                ", second=" + second +
//                '}';
//    }
//}
