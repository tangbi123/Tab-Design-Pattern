package Bridge;

public class main {

    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, world"));

        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, world1"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, world2"));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(3);
    }
}
