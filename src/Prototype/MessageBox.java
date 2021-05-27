package Prototype;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class MessageBox implements Product{
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes(StandardCharsets.UTF_8).length;
        for(int i = 0; i < length + 4; i++)
            System.out.print(decochar);
        System.out.println();
        System.out.println(decochar + " " + s + " " + decochar);

        for(int i = 0; i < length + 4; i++)
            System.out.print(decochar);
        System.out.println();
    }

    /**
     * clone a Product and return it
     * */
    @Override
    public Product crateClone() {
        Product p = null;
        try{
            p = (Product) clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }
}
