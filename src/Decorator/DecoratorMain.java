package Decorator;

public class DecoratorMain {
    public static void main(String[] args){
        Display d1 = new StringDisplay("Hello world.");
        Display d2 = new SideBorder(d1, '#');
        Display d3 = new FullBorder(d2);
        d1.show();
        d2.show();
        System.out.println();
        d3.show();
        System.out.println();
        Display d4 = new SideBorder(
                new FullBorder(
                        new FullBorder(
                                new SideBorder(
                                        new FullBorder(
                                                new StringDisplay("hello, tab")
                                        ),
                                        '*'
                                )
                        )
                ),
                '/'
        );
        d4.show();

    }
}
