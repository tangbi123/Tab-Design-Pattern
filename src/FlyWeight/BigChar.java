package FlyWeight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
    private char charname;
    private String fontdata;

    public BigChar(char charname){
        this.charname = charname;
        try{
            BufferedReader reader  = new BufferedReader(
                    //注意 文件的路径
                    new FileReader("src/FlyWeight/big" + charname + ".txt")
            );
            String line;
            StringBuffer buf = new StringBuffer();
            while((line = reader.readLine()) != null){
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontdata = buf.toString();
        }catch (IOException e){
            this.fontdata = charname + "?";
            System.out.println("cannot find" + fontdata);
        }

    }

    public void print(){
        System.out.println(fontdata);
    }
}
