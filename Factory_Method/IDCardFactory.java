package Factory_Method;

public  class   IDCardFactory extends Factory{
    private int SERIAL = 100;

    @Override
    IDCard createProduct(String owner){
        return new IDCard(owner,++SERIAL);
    }
    
    @Override
    void registerProduct(Product p){
        System.out.println(p+"を登録しました。");
    }
}