package Interpreter;

import java.io.BufferedReader;
import java.io.FileReader;

public class InterpreterMain {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(
                    //注意文件的位置
                    new FileReader("src/Interpreter/program.txt")
            );
            String text;
            while((text = reader.readLine()) != null){
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgrameNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
            reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
