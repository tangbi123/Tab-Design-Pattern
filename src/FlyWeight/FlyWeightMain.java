package FlyWeight;

public class FlyWeightMain {
    public static void main(String[] args) {
        BigString bs = new BigString("321123");
        bs.print();
        bs = new BigString("123321");
        bs.print();
    }
}
