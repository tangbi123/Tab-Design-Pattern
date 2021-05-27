package Prototype;

public class main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox sBox = new MessageBox('*');
        MessageBox mBox = new MessageBox('/');
        manager.register("upen", upen);
        manager.register("sBox", sBox);
        manager.register("mBox", mBox);

        Product p1 = manager.create("upen");
        p1.use("测试机哦");
        Product p2 = manager.create("sBox");
        p2.use("测试机哦i");
    }
}
