package Observe;

public class ObserverMain {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumbserGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserve();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}
