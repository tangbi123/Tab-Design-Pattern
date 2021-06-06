package Proxy;

public class ProxyMain {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("现在的名字是 "+ p.getPrinterName());
        //p.print("Hello world");
        p.setPrinterName("Bob");
        System.out.println("现在的名字是 " + p.getPrinterName());
        p.print("Hello world");
    }
}
