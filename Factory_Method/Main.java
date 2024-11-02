package Factory_Method;

public class Main{

    public static void main(String args[]){
        Factory f = new IDCardFactory();
        Product p1 = f.create("田中");
        Product p2 = f.create("Ichiro");
        Product p3 = f.create("大村");

        p1.use();
        p2.use();
        p3.use();
    }
}