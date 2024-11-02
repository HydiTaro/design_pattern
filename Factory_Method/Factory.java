package Factory_Method;

public abstract class Factory{

    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    abstract Product createProduct(String owner);
    abstract void registerProduct(Product p);
}