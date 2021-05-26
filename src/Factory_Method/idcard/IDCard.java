package Factory_Method.idcard;

import Factory_Method.framework.Product;

public class IDCard extends Product {
    private String owner;
    public IDCard(String owner){
        System.out.println("制作" + owner + "的ID卡");
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }
    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }
}
