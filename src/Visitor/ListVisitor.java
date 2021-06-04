package Visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor{
    private String currentDir = "";
    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while(it.hasNext()){
            Entry entry = (Entry)it.next();
            //用 本visitor访问 entry
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}
