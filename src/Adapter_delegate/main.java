package Adapter_delegate;

import Adapter_implements.Print;
import Adapter_implements.PrintBanner;

public class main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printStrong();
        p.printWeak();
    }
}
