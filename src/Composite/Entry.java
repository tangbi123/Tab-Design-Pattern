package Composite;

public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmemtException
    {
        throw new FileTreatmemtException();
    }
    public void printList(){
        printList("");
    }
    protected  abstract void printList(String prefix);
    // filename(size)
    public String toString(){
        return getName() + "(" + getSize() + ")";
    }
}
