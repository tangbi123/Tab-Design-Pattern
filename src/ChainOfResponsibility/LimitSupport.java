package ChainOfResponsibility;

public class LimitSupport extends Support{
    private int limit;
    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble touble) {
        if(touble.getNumber() < limit){
            return true;
        }
        return false;
    }
}
