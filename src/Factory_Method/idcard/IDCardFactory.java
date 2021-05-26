package Factory_Method.idcard;

import Factory_Method.framework.Factory;
import Factory_Method.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private List owner = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owner.add(((IDCard)product).getOwner());
    }

    public List getOwner(){
        return owner;
    }
}
