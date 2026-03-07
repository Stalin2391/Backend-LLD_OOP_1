package OOPS.LLD1.Generics;

public class Client {
    public static void main(String[] args) {
        Pair pair = new Pair();
        pair.first = "demo";
        pair.second = 23.2;
        Double d = (Double) pair.first;
        System.out.println(d);

        // with Object data type,we don't get compile time safety



        PairGeneric<String, Double> pairGeneric = new PairGeneric<>();
        pairGeneric.first = "Generic";
        pairGeneric.second = 23.4;


    }
}
