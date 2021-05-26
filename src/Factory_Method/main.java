package Factory_Method;

import Factory_Method.framework.Factory;
import Factory_Method.framework.Product;
import Factory_Method.idcard.IDCardFactory;

public class main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小军");
        card1.use();
        card2.use();
        card3.use();
    }
}
