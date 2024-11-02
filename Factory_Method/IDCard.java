package Factory_Method;

public class IDCard extends Product{

    private String owner;
    private int serial;

    IDCard(String owner, int serial){
        this.owner = owner;
        this.serial = serial;
        System.out.println(owner+"のカードを作成します。番号は"+serial+"です。");
    }

    @Override
    public void use(){
        System.out.println(this+"のカードを使用します");
    }

    @Override
    public String toString(){
        return "IDCard:"+owner+"("+serial+")";
    } 
}