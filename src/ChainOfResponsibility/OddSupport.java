package ChainOfResponsibility;

public class OddSupport extends Support{
    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble touble) {
        if(touble.getNumber() % 2 == 1){
            return true;
        }
        return false;
    }
}
