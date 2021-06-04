package ChainOfResponsibility;

public class NoSupport extends Support{
    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble touble) {
        return false;
    }
}
