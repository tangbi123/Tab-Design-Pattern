package ChainOfResponsibility;

public class SpecialSupport extends Support{
    private int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble touble) {
        if(touble.getNumber() == number){
            return true;
        }
        return false;
    }
}
