package Visitor;

import Composite.FileTreatmemtException;

import java.util.Iterator;

public abstract class Entry implements Element{
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmemtException
    {
        throw new FileTreatmemtException();
    }
    public Iterator iterator() throws FileTreatmemtException{
        throw new FileTreatmemtException();
    }
    public String toString(){
        return getName() + "(" + getSize() + ")";
    }
}
