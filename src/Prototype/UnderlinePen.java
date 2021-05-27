package Prototype;

import java.nio.charset.StandardCharsets;

public class UnderlinePen implements Product{
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }


    @Override
    public void use(String s) {
        int length = s.getBytes(StandardCharsets.UTF_8).length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for(int i = 0; i < length; i++){
            System.out.print(ulchar);
        }
        System.out.println();
    }

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
